<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/jquery/jquery-1.7.1.js"></script>
<link href="${pageContext.request.contextPath }/style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<!--_meta 作为公共模版分离出去-->
<jsp:include page="/_meta.jsp"></jsp:include>
<!--/meta 作为公共模版分离出去-->
<link href="${pageContext.request.contextPath }/style/authority/common_style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/authority/commonAll.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/style/authority/jquery.fancybox-1.3.4.css" media="screen"></link>
<script type="text/javascript" src="${pageContext.request.contextPath }/scripts/artDialog/artDialog.js?skin=default"></script>
<title>信息管理系统</title>

<style>
	.alt td{ background:black !important;}
</style>
</head>
<body>
	
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th>订单编号</th>
							<th>购买用户</th>
							<th>购买商品</th>
							<th>商品评分</th>
							<th>服务评分</th>
							<th>快递评分</th>
							<th>评价内容</th>
							<th>评价图片</th>
							<th>评价时间</th>
							<th>回复评论</th>
						</tr>
							<c:forEach begin="0" end="${comment.size()-1 }" var="step" step="1">
							<tr>
							
								<td>${orderno.get(step) }</td>
								<td>${username.get(step) }</td>
								<td>${goodsname.get(step) }</td>
								<td>${comment.get(step).goodsscore }</td>
								<td>${comment.get(step).servicescore }</td>
								<td>${comment.get(step).timescore }</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerOut('评论内容','${comment.get(step).content }','${comment.get(step).commentid}')">
										评论内容
								</button>
								</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerPhoto('评论图片','${comment.get(step).images }')">
										评论图片
								</button>
								</td>
								<td><fmt:formatDate value="${comment.get(step).createtime}" pattern="yyyy-MM-dd　HH:mm:ss"/> </td>
								<td>
								<c:if test='${comment.get(step).replytime==null }'><button class="btn btn-primary radius" onclick="layerOut('回复评论','${comment.get(step).content }','${comment.get(step).commentid}')">
										评论内容
								</button></c:if>
								<c:if test='${comment.get(step).replytime!=null }'><button class="btn btn-primary radius" onclick="layerOut('已经评论','${comment.get(step).content }','${comment.get(step).commentid}')">
										已经评论
								</button></c:if>
								</td>
							</tr>
							</c:forEach>
					</table>
				</div>
				</div>
				
					<!--_footer 作为公共模版分离出去-->
	<jsp:include page="/_footer.jsp"></jsp:include>
	<!--/_footer /作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/validate-methods.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/jquery.validation/1.14.0/messages_zh.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/ueditor/1.4.3/ueditor.config.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/ueditor/1.4.3/ueditor.all.min.js"> </script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>


	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>

<script type="text/javascript">

	
function layerOut(title,url,commentid)
{
	if(title == "评论内容")
      layer.alert(url);
    else if(title == "已经评论")
    {
    	layer.alert("已经评论过了，不要再点了");
    }
    else
    {
    	layer.confirm('<textarea style="width: 400px; height: 300px; font-size:18px" id="shopreply"></textarea>',{
			btn:["确定",'取消']
		}, function(){
			var shopreply = document.getElementById("shopreply").value;
				var obj={
					commentid : commentid,
					replytime : new Date(),
	   				shopreply : shopreply,
	   			};
	   			obj = JSON.stringify(obj);
	   			$.ajax({
					url : '${pageContext.request.contextPath }/updateComment.action',
					contentType : 'application/json;charset=utf-8',
			   		type : "POST",
					data : obj,
					dataType : "json",
					async : false,
					success : function(data) {
						if(data.flag == 1)
						{
							alert("更新成功");
							window.parent.location.reload();
							var index = parent.layer.getFrameIndex(window.name);
							parent.layer.close(index);
						}
						else
						{
							alert("更新失败");
							window.parent.location.reload();
							var index = parent.layer.getFrameIndex(window.name);
							parent.layer.close(index);
						}
				},
				error : function(data) {alert("error")},
				});
			}); 
    }
}

function layerPhoto(title,url)
{
		if(url == "")
		{
			layer.alert("此评论没有图片");
		}
		else
		{
		var json=url.split("&WFZY.com&");
	 	
	 	for(var i=0;i<json.length;i++)
	 		{
	 		var img = "<img src='" + json[i] + "' />";  
			layer.open({  
	    		type: 1,  
	    		shade: false,  
	    		title: false, //不显示标题  
	    		area:['auto','auto'],  
	   	 		area: [img.width + 'px', img.height+'px'],  
	    		content: img, //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响  
	    		cancel: function () {  
	        	//layer.msg('图片查看结束！', { time: 5000, icon: 6 });  
	    		}  
			});  
	 		}
 	 	}
}


</script>

</body>
</html>
