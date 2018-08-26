<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<!--_meta 作为公共模版分离出去-->
<jsp:include page="/_meta.jsp"></jsp:include>
<!--/meta 作为公共模版分离出去-->

<link
	href="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page-container">
	
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>申请的店铺名称：</label>
				<div class="formControls col-xs-8 col-sm-9">
					
					<select name="shopName" id="shopName">
					<c:forEach items="${shops}" var="i">
							<option value="${i.shopid}">${i.shopname}</option>
					</c:forEach>
					</select>
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>申请的类型：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<select name="applyType" id="applyType">
							<option value="1">限时购</option>
							<option value="2">福利社</option>
							<option value="3">企业订购</option>
							<option value="4">期订</option>
					</select>
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>申请的商品：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<select name="applyGoods" id="applyGoods">
					<c:forEach items="${goods}" var="k">
					<option value="${k.goodsid}" title="${k.goodsstock}" id="goodst">${k.goodsname}   库存量:${k.goodsstock}
					</option>
					</c:forEach>
					</select>
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>开始时间段：</label>
				<div class="formControls col-xs-8 col-sm-9">
				日期：	<input name="endtime" type="text"
						onfocus="WdatePicker({dateFmt:'yyyy-MM-dd',minDate: '%y-%M-#{%d+1}'})"
						id="datemin" class="input-text Wdate" style="width:180px;"
						placeholder=""  value="">
				时间段：	<select name="dateTime" id="dateTime">
						<c:forEach items="${time}" var="t">
						<option value="${t.limittime }">
						<fmt:formatDate value="${t.limittime }" pattern="HH:mm:ss"/>
						</option>
						</c:forEach>
						</select>
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>申请数量：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="applyNum" id="applyNum" placeholder="" value=""
						class="input-text" >
				</div>
			</div>
			<br>
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>申请理由：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="applyReason" id="applyReason" placeholder="" value=""
						class="input-text" >
				</div>
			</div>
			<br>
		
		<button class="btn btn-primary radius" onclick="oirt()" style="float:left;margin-left: 30%;width: 10%">
					提交申请
		</button>

		

		
		
	
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
	
			$("#applyType").bind("input propertychange",function(event){
       			var applyType = document.getElementById("applyType").value;
       			var limitTime = document.getElementById("limitTime");
       			if(applyType == 1)
       			{
       				limitTime.value="1小时";
       				limitTime.readOnly=true;
       			}
				else
				{
					limitTime.value="";
					limitTime.readOnly=false;
				}
			});
	
			function StrToGMT(time){
    			let GMT = new Date(time)
    			return GMT
			};
			
			function dateToGMT(strDate){
   				 var dateStr=strDate.split(" ");  
   				 var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
   				 var date = new Date(Date.parse(strGMT));
   				 return date;
			};
			
			function oirt(){
			
			var shopName = document.getElementById("shopName").value;
			var applyType = document.getElementById("applyType").value;
			var applyGoods = document.getElementById("goodst").value;
			var goodsstock = parseInt(document.getElementById("goodst").title);
			var datemin = document.getElementById("datemin").value;
			var applyNum = parseInt(document.getElementById("applyNum").value);
			var applyReason = document.getElementById("applyReason").value;
			
			if(applyReason == "" || datemin == "" || applyNum == "")
			{
				alert("请填写完整信息");
			}
			else if(applyNum > goodsstock)
			{
				alert("申请数量不能大于库存");
				alert(applyNum + " > " + goodsstock)
			}
			else 
			{
				var dateTime = document.getElementById("dateTime").value;
				var d = dateToGMT(dateTime);
				var hmstime=d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
				var totaltime = datemin+' '+hmstime;
				var obj={
					goodstype : applyType,
					goodsid : applyGoods,
					shopid : shopName,
					createtime : new Date(),
					starttime : StrToGMT(totaltime),
					endtime : "",
					storknum : applyNum,
					ishandle : '0',
	   				applytext : applyReason,
	   			};
	   		obj = JSON.stringify(obj);
	   		$.ajax({
				url : '${pageContext.request.contextPath }/insertGoodsApply.action',
				contentType : 'application/json;charset=utf-8',
			   	type : "POST",
				data : obj,
				dataType : "json",
				async : false,
				success : function(data) {
					
					if(data.flag == 1)
					{
						alert("提交申请成功");
						window.location.reload();
					}
					else
					{
						alert("提交申请失败");
					}
				},
				error : function(data) {alert("error")},
			})
			}
		}
	</script>

</body>
</html>
