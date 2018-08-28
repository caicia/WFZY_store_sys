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
	<div class="page-container">
		<c:forEach items="${order}" var="i">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>订单编号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="订单编号" id="orderno" name="orderno"   value="${i.orderno}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="ui_content">
				<div class="ui_tb">
					<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
						<tr>
							<th>商品名称</th>
							<th>商品规格：</th>
							<th>商品价格：</th>
							<th>购买数量：</th>
						</tr>
							<c:forEach begin="0" end="${count-1}" var="step" step="1">
							<tr>
								<td>${goodsname.get(step)}</td>
								<td>${goodsremarks.get(step)}</td>
								<td>${goodsprice.get(step)}</td>
								<td>${goodscount.get(step)}</td>
							</tr>
							</c:forEach>
					</table>
				</div>
				</div>
				<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>订单备注：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="订单备注" id="orderNote" name="orderNote"   value="${i.orderremarks}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>订单状态：</label>
				<div class="formControls col-xs-8 col-sm-9">
				
				<input type="text" class="input-text" placeholder=""
						placeholder="订单状态" id="orderStats" name="orderStats"   value="<c:if test='${i.orderstatus==-2}'>待发货</c:if>
									<c:if test='${i.orderstatus==1}'>配送中</c:if>
									<c:if test='${i.orderstatus==2}'>用户确认收货</c:if>
									<c:if test='${i.orderstatus==-3}'>用户拒收</c:if>
									<c:if test='${i.orderstatus==-1}'>用户取消</c:if>" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>收货人名称：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="收货人名称" id="receivingMember" name="receivingMember"   value="${i.receivedname}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>收件人地址：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="收件人地址" id="receivingMenberAddress" name="receivingMemberAddress"   value="${i.receivedaddress}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>收件人手机：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="收件人手机" id="receivingMemberPhone" name="receivingMemberPhone"   value="${i.receivedphone}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>快递公司：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="快递公司" id="courierCompany" name="courierCompany"   value="${expressName}" readonly="readonly" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>有效状态：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="有效状态" id="isEffective" name="isEffective"   value='<c:if test="${i.dataflag==1}">有效</c:if><c:if test="${i.dataflag==-1}">删除</c:if>' readonly="readonly" >
				</div>
			</div>
			<br>
			
			<div class="row cl">
				以下为填写部分：
			</div>
			<br>
			
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>快递单号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder=""
						placeholder="快递单号" id="ExpressNumber" name="ExpressNumber"   value="">
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>发货时间：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input name="endtime" type="text"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'#F{$dp.$D(\'datemin\')}'})"
						id="datemin" class="input-text Wdate" style="width:180px;"
						placeholder=""  value="">
				</div>
			</div>
			<br>
			
			<button class="btn btn-primary radius" onclick="insertExpress(${i.orderid})" style="float:left;margin-left: 30%;width: 10%">
					提交快递信息
			</button>
			</c:forEach>
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
		function StrToGMT(time){
    			let GMT = new Date(time)
    			return GMT
			}
	
		function insertExpress(orderid)
		{
			var ExpressNumber = document.getElementById("ExpressNumber").value;
			var datemin = document.getElementById("datemin").value;
			var orderno = document.getElementById("orderno").value;
			if(ExpressNumber == "" || datemin == "")
			{
				alert("请完善快递信息");
			}
			else
			{
				var obj={
					orderid : orderid,
					orderno : orderno,
	   				expressno : ExpressNumber,
	   				deliverytime : StrToGMT(datemin),
	   			};
	   			obj = JSON.stringify(obj);
	   			$.ajax({
				url : '${pageContext.request.contextPath }/insertOrderExpress.action',
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
				})
			}
		}
	</script>
</body>
</html>