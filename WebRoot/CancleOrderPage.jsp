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
							<th>取消的商品</th>
							<th>取消的理由</th>
							<th>取消的时间</th>
							<th>订单状态</th>
							<th>订单详情</th>
							<th>物流状态</th>
							<th>操作</th>
						</tr>
							<c:if test="${order.size()>0 }">
							<c:forEach begin="0" end="${order.size()-1 }" var="step" step="1">
							<tr>
							
								<td>${orderno.get(step)}</td>
								<td>${username.get(step)}</td>
								<td>${goodsname.get(step)}</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerOut('取消的理由','${order.get(step).getRefundotherreson()}')">
										取消的理由
								</button>
								</td>
								<td>
								<fmt:formatDate value="${order.get(step).getCreatetime()}" pattern="yyyy-MM-dd　HH:mm:ss"/>
								</td>
								<td><c:if test='${orderstatus.get(step)==-2}'>未付款的订单</c:if>
									<c:if test='${orderstatus.get(step)==0}'>待发货</c:if>
									<c:if test='${orderstatus.get(step)==1}'>配送中</c:if>
									<c:if test='${orderstatus.get(step)==2}'>用户确认收货</c:if>
									<c:if test='${orderstatus.get(step)==-3}'>用户拒收</c:if>
									<c:if test='${orderstatus.get(step)==-1}'>用户取消</c:if>
								</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerOut('订单详情','${pageContext.request.contextPath }/shop/showDetailsPage.action?orderid=${orderno.get(step)}')">
										订单详情
								</button>
								</td>
								<td>
								<button class="btn btn-primary radius" onclick="layerOut('物流追踪','${pageContext.request.contextPath }/shop/showWLList.action?nu=${expressno.get(step)}&com=${expressid.get(step)}&time=${deliverytime.get(step)}')">
										物流追踪
								</button>
								</td>
								<td>
								<c:if test="${order.get(step).getRefundstatus()==0 }">
								<button class="btn btn-primary radius" onclick="reason('物流追踪','${order.get(step).getOrderid()}','${order.get(step).getOrderrefundsid()}')">
										取消的理由
								</button>
								</c:if>
								<c:if test="${order.get(step).getRefundstatus()==-1 }"><font color="red">未同意取消 </font></c:if>
								</td>
							</tr>
							</c:forEach>
							</c:if>
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
	if(title == "取消的理由")
	{
		layer.alert(url);
	}
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

function reason(reason,orderid,Orderrefundsid)
{
	layer.confirm('<textarea style="width: 300px; height: 300px; font-size:18px" id="shopreply"></textarea>',{
			btn:["同意取消",'不同意取消']
		}, function(){
			var shopreply = document.getElementById("shopreply").value;
			pull("同意取消",shopreply,orderid,Orderrefundsid);
			},
		function(){
			var shopreply = document.getElementById("shopreply").value;
			pull('不同意取消',shopreply,orderid,Orderrefundsid);
		});
}

function pull(status,shopreply,orderid,Orderrefundsid)
{
				var refundstatus = 0;
				if(status == "同意取消")
				{
					alert(Orderrefundsid);
					refundstatus = 1;
				}
				else
				{
					alert(Orderrefundsid);
					refundstatus = -1;
				}
				var obj={
					orderrefundsid : Orderrefundsid,
					orderid : orderid,
					shoprejectreason : shopreply,
					refundstatus : refundstatus,
	   			};
	   			obj = JSON.stringify(obj);
	   			$.ajax({
					url : '${pageContext.request.contextPath }/CancleOrder.action',
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
}
</script>

</body>
</html>
