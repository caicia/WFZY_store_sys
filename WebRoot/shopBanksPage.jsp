<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!--_meta 作为公共模版分离出去-->
<jsp:include page="/_meta.jsp"></jsp:include>
<!--/meta 作为公共模版分离出去-->

<link
	href="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page-container">
	<c:forEach items="${shopList}" var="i">
            <c:forEach items="${banks}" var="b">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>银行卡号：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="bankno" id="bankno" placeholder="" value="${b.bankno} "
						class="input-text" >
				</div>
				<button class="btn btn-primary radius" onclick="banksCheck()">
					 验证
				</button>
			</div>

		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>银行卡类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="bankType" id="bankType" placeholder="" value="****"
						class="input-text" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>银行名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="bankName" id="bankName" placeholder="" value="${b.bankname}"
						class="input-text" readonly="readonly">
			</div>
			
			
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>银行卡状态：</label>
			<div class="formControls col-xs-8 col-sm-9">
					<input type="text" name="bankStas" id="bankStas" placeholder="" value='<c:if test="${b.dataflag eq '1'}">有效</c:if><c:if test="${b.dataflag != '1'}">无效</c:if>'
						class="input-text" readonly="readonly">
			</div>
		</div>
		
		<br>
		<br>
		
		<button class="btn btn-primary radius" onclick="shopApplyAuccess(${b.bankid})" style="float:left;margin-left: 30%;width: 10%">
					更新银行卡
		</button>
		

		</c:forEach>
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
	
		$("#bankno").bind("input propertychange",function(event){
       			var bankName = document.getElementById("bankName");
				var bankType = document.getElementById("bankType");
				var bankStas = document.getElementById("bankStas");
				bankName.value="";
                bankType.value="";
                bankStas.value="";
		});
	
		function banksCheck() {
			var bankName = document.getElementById("bankName");
			var bankType = document.getElementById("bankType");
			var bankStas = document.getElementById("bankStas");
			var bankno = document.getElementById("bankno").value;
			$.ajax({
			    type : "POST",
				url : '${pageContext.request.contextPath }/checkBanksNumber.action',
				data : {
					bankno : bankno,
				},
				async : false,
				success : function(data) {
					var key=data.key; 
                    if(data.validated === false)
                    {
                    	alert("请输入正确的银行卡");
                    	bankName.value="none";
                    	bankType.value="none";
                    	bankStas.value="none";
                    }
                    else
                    {
                        alert("正确的银行卡");
                    	bankName.value=data.bank;
                    	bankType.value=data.cardType;
                    	bankStas.value=data.stat;
                    }
				},
				error : function(data) {alert("0")},
				dataType : "json"
			})
			
		}
		
		 function shopApplyAuccess(bankid)
	   {
	   		var bankname = document.getElementById("bankName").value;
			var bankType = document.getElementById("bankType").value;
			var bankStas = document.getElementById("bankStas").value;
			var bankno = document.getElementById("bankno").value;
	   		
	   		if(bankName == "" || bankName == "none" || bankType == "****" || bankType == "undefined"  || bankStas != "ok")
	   		{
	   			alert("请填写正确信息，无需重复插入银行卡");
	   		}
	   		else
	   		{
	   		var obj={
	   			bankid : bankid,
	   			bankno : bankno,
				bankname : bankname,
	   		};
	   		obj = JSON.stringify(obj);
	   		$.ajax({
				url : '${pageContext.request.contextPath }/updateBanks.action',
				contentType : 'application/json;charset=utf-8',
			   	type : "POST",
				data : obj,
				dataType : "json",
				async : false,
				success : function(data) {
					
					if(data.flag == 1)
					{
						alert("更新成功");
					}
					else
					{
						alert("更新失败");
					}
				},
				error : function(data) {alert("error")},
			})
			}
	   }
		</script>
</body>
</html>
