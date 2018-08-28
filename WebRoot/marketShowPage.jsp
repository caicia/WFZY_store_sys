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
							<th>申请的店铺名称</th>
							<th>申请的类型：</th>
							<th>申请的商品：</th>
							<th>开始时间段：</th>
							<th>申请数量：</th>
							<th>审核状态：</th>
							<th>操作：</th>
						</tr>
							<c:forEach items="${goodsapply}" var="i">
							<tr>
								<td>${shops}</td>
								<td>
								<c:if test="${i.goodstype==1}">限时购</c:if>
								<c:if test="${i.goodstype==2}">福利社</c:if>
								<c:if test="${i.goodstype==3}">企业订购</c:if>
								<c:if test="${i.goodstype==4}">期订</c:if>
								</td>
								<td>${i.getgoodsName()}</td>
								<td>
								<c:if test="${i.goodstype==1}"><fmt:formatDate value="${i.starttime}" pattern="yyyy-MM-dd　HH:mm:ss"/></c:if>
								<c:if test="${i.goodstype!=1}">不限时间</c:if>
								</td>
								<td><c:if test="${i.goodstype==1}">${i.storknum}</c:if>
								<c:if test="${i.goodstype!=1}">不限量</c:if>
								</td>
								<td>
								<c:if test="${i.ishandle==1}"><font color="blue">审核通过</font></c:if>
								<c:if test="${i.ishandle==-1}"><font color="red">审核不通过</font></c:if>
								<c:if test="${i.ishandle==0}"><font color="black">尚未审核</font></c:if>
								</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerOut('${i.ishandle}','')">取消活动</button>
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
function layerOut(title,url)
{
	if(title != 1)
	{
		alert("审核尚未通过请勿进行此操作");
	}
            //layer.msg('这是最常用的吧');
    else
    {  
       layer.open({
                type: 2,
                title: title,
                fix: false,
                maxmin: true,
                shadeClose: true,
                area: ['1100px', '600px'],
                content: url,
       });
    }
}
</script>
</body>
</html>
