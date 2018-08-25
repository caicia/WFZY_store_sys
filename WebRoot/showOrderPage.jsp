<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
							<th>产品名称</th>
							<th>购买数量</th>
							<th>购买价格</th>
							<th>产品备注</th>
							<th>订单状态</th>
							<th>订单备注</th>
							<th>商品总金额</th>
							<th>收货方式</th>
							<th>运费</th>
							<th>订单总金额</th>
							<th>支付方式</th>
							<th>是否支付</th>
							<th>收货人名字</th>
							<th>收货人手机</th>
							<th>收货人地址</th>
							<th>是否需要发票</th>
							<th>下单时间</th>
						</tr>
							<c:forEach items="${express}" var="i">
							<tr>
								
								<td>${shopList.get(0).getShopname()}</td>
								<td>${i.expressname}</td>
								<td>${i.expresscode}</td>
								<c:if test="${i.dataflag==2}"><td>支持</td></c:if>
								<c:if test="${i.dataflag!=2}"><td>不支持</td></c:if>
								<td>
								<c:if test="${i.dataflag==2}">
								<button onclick="del(${i.dataflag},${shopList.get(0).getShopid()},${i.expressid})">
										不支持
								</button>
								</c:if>
								<c:if test="${i.dataflag!=2}">
								<button onclick="insert(${i.dataflag},${shopList.get(0).getShopid()},${i.expressid})">
										支持
								</button>
									
								</c:if>
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
	
	/** 删除 **/
	function del(dataflag,shopid,expressid){
		// 非空判断

		var obj={
	   			shopid : shopid,
	   			expressid : expressid,
	   		};
	   		obj = JSON.stringify(obj);
	   		$.ajax({
				url : '${pageContext.request.contextPath }/delShopsExpress.action',
				contentType : 'application/json;charset=utf-8',
			   	type : "POST",
				data : obj,
				dataType : "json",
				async : false,
				success : function(data) {
					
					if(data.flag == 1)
					{
						alert("更新成功");
						window.location.reload();
					}
					else
					{
						alert("更新失败");
						window.location.reload();
					}
				},
				error : function(data) {alert("error")},
			})
		}
	
	/** 插入 **/
	function insert(dataflag,shopid,expressid){
		// 非空判断
		var obj={
	   			shopid : shopid,
	   			expressid : expressid,
	   		};
	   		obj = JSON.stringify(obj);
	   		$.ajax({
				url : '${pageContext.request.contextPath }/insertShopsExpress.action',
				contentType : 'application/json;charset=utf-8',
			   	type : "POST",
				data : obj,
				dataType : "json",
				async : false,
				success : function(data) {
					
					if(data.flag == 1)
					{
						alert("更新成功");
						window.location.reload();
					}
					else
					{
						alert("更新失败");
						window.location.reload();
					}
				},
				error : function(data) {alert("error")},
			})
		}
</script>
</body>
</html>
