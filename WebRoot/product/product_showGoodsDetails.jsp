<%@ page language="java" import="java.util.*,com.WFZY.ulits.DateUtils "
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!--_meta 作为公共模版分离出去-->
<jsp:include page="../_meta.jsp"></jsp:include>
<!--/meta 作为公共模版分离出去-->

<link
	href="${pageContext.request.contextPath }/lib/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="page-container">
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>商品名称：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="hidden" id="goodsid" value="${goods.goodsid }">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.goodsname }" id="goodsname" readonly="readonly">
			</div>
		</div>
		<br>
		<c:if test="${createtime != null}">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>创建时间：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入商品名称"
						value="${createtime }" id="createtime" readonly="readonly">
				</div>
			</div>
			<br>
		</c:if>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>商品编号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.goodssn }" id="goodssn" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>商品货号：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.productno }" id="productno" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>三级分类类型：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<label>已属于：</label> <select name="" id="">
					<option value="${goods.goodsclassifyid }">${goodsclassifyname }</option>
				</select>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>商品图片：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<img width="300" src="${goods.goodsimg }"> <br> <br>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2">产品描述：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<textarea id="goodsdesc" cols="" rows="" readonly class="textarea"
					placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true"
					nullmsg="备注不能为空！" onKeyUp="textarealength(this,200)">${goods.goodsdesc }</textarea>
				<p class="textarea-numberbar">
					<em class="textarea-length">0</em>/200
				</p>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>市场价：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" id="marketprice" value="${goods.marketprice }"
					class="input-text" style="width:90%" readonly="readonly"> 元
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>门店价：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" id="shopprice" value="${goods.shopprice }"
					class="input-text" style="width:90%" readonly="readonly"> 元
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>访问量：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.visitnum }" id="visitnum" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>评价数：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.appraisenum }" id="appraisenum" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>商品总库存量：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.goodsstock }" id="goodsstock" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>总销售量：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<input type="text" class="input-text" placeholder="请输入商品名称"
					value="${goods.salenum }" id="salenum" readonly="readonly">
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>是否上架：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="issale">
					<c:if test="${goods.issale ==1 }">
						<option value="${goods.issale }" selected="selected">上架</option>
					</c:if>
					<c:if test="${goods.issale ==0 }">
						<option value="${goods.issale }" selected="selected">不上架</option>
					</c:if>
				</select>
			</div>
		</div>
		<br>
		<c:if test="${saletime != null}">
			<div class="row cl">
				<label class="form-label col-xs-4 col-sm-2"><span
					class="c-red">*</span>上架时间：</label>
				<div class="formControls col-xs-8 col-sm-9">
					<input type="text" class="input-text" placeholder="请输入商品名称"
						value="${saletime }" id="saletime" readonly="readonly">
				</div>
			</div>
			<br>
		</c:if>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>是否精品：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="isbest">
					<c:if test="${goods.isbest ==1 }">
						<option value="${goods.isbest }" selected="selected">是</option>
					</c:if>
					<c:if test="${goods.isbest ==0 }">
						<option value="${goods.isbest }" selected="selected">否</option>
					</c:if>
				</select>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>是否推荐：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="isrecom">
					<c:if test="${goods.isrecom ==1 }">
						<option value="${goods.isrecom }" selected="selected">是</option>
					</c:if>
					<c:if test="${goods.isrecom ==0 }">
						<option value="${goods.isrecom }" selected="selected">否</option>
					</c:if>
				</select>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>是否新品：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="isnew">
					<c:if test="${goods.isnew ==1 }">
						<option value="${goods.isnew }" selected="selected">是</option>
					</c:if>
					<c:if test="${goods.isnew ==0 }">
						<option value="${goods.isnew }" selected="selected">否</option>
					</c:if>
				</select>
			</div>
		</div>
		<br>
		<div class="row cl">
			<label class="form-label col-xs-4 col-sm-2"><span
				class="c-red">*</span>是否热销产品：</label>
			<div class="formControls col-xs-8 col-sm-9">
				<select id="ishot">
					<c:if test="${goods.ishot ==1 }">
						<option value="${goods.ishot }" selected="selected">是</option>
					</c:if>
					<c:if test="${goods.ishot ==0 }">
						<option value="${goods.ishot }" selected="selected">否</option>
					</c:if>
				</select>
			</div>
		</div>
		<br>
	</div>


	<!--_footer 作为公共模版分离出去-->
	<jsp:include page="../_footer.jsp"></jsp:include>
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

</body>
</html>
