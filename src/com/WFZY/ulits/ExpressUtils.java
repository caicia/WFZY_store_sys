package com.WFZY.ulits;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;


/**
 *   快递 查询 API 接口
 * @author hasee
 *
 */
public class ExpressUtils {
	
	public static String select() {
	    String host = "https://allexp.market.alicloudapi.com";
	    String path = "/expQuery";
	    String method = "GET";
	    String appcode = "e5306d3a274047ba8a8a86b2d0f2f853";
	    Map<String, String> headers = new HashMap<String, String>();
	    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("com", "shentong");
	    querys.put("nu", "7700438906817");


	    try {
	    	/**
	    	* 重要提示如下:
	    	* HttpUtils请从
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
	    	* 下载
	    	*
	    	* 相应的依赖请参照
	    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
	    	*/
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	    	//System.out.println(response.toString());
	    	//获取response的body
	    	System.out.println("ExpressUtils.java的快递查询类的 main（）方法");
	    	System.out.println(EntityUtils.toString(response.getEntity()));
	    	return EntityUtils.toString(response.getEntity());
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return null;
	}
	
}
