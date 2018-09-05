<%@ page language="java" import="java.util.*,com.WFZY.mapper.*"
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

<title>商品分类</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<style>
.content {
	width: 100%;
	height: 100%;
	background-color: gray;
}

h1, table {
	margin: 50px;
}

tr {
	height: 100px;
	width: 95%;
}

.goodsclassifyname {
	font-size: 18px;
	width: 300px;
	height: 50px;
	text-indent: 10px;
	border-radius: 10px;
	border: 0px;
	background-color: white;
}

.goodsclassifysort {
	font-size: 18px;
	width: 300px;
	height: 50px;
	text-indent: 10px;
	border-radius: 10px;
	border: 0px;
	background-color: white;
}

.goodsclassifybtn {
	color: white;
	font-size: 25px;
	width: 500px;
	height: 50px;
	border-radius: 10px;
	border: 0px;
	background-color: green;
	font-size: 25px;
}
</style>
</head>

<body>
	<br>

	<section class="Hui-article-box">
		<nav class="breadcrumb">
			<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
			产品管理 <span class="c-gray en">&gt;</span> 商品分类 <a
				class="btn btn-success radius r"
				style="line-height:1.6em;margin-top:3px"
				href="javascript:location.replace(location.href);" title="刷新"><i
				class="Hui-iconfont">&#xe68f;</i></a>
		</nav>
		<div class="Hui-article">
			<div class="content">

				<h1>添加二级商品分类</h1>
				<form
					action="${pageContext.request.contextPath }/product/product_addTwoGoodsClassify.action"
					method="get">
					<table>
					    <tr>
							<td style="font-size: 20px; width: 200px;text-align: center;">父类分类:</td>
							<td><input class="goodsclassifyname" type="text"
								name="gpname" readonly="readonly"  value="${goodsclassify.goodsclassifyname} " />
								<input class="goodsclassifyid" name="gpid" type="hidden" value="${goodsclassify.goodsclassifyid}" />
							</td>
						</tr>
					
						<tr>
							<td style="font-size: 20px; width: 200px; text-align: center;">已有的二级分类:</td>
							<td>
							  
							   <select class="goodsclassifyname"  >
							       <c:forEach items="${GoodsclassifyNameList }" var="n"> 
									  <option value="${n.goodsclassifyname }">${n.goodsclassifyname }</option>
									</c:forEach>
							   </select>
							  
							</td>
						</tr>

						<tr>
							<td style="font-size: 20px; width: 200px;text-align: center;">分类名称:</td>
							<td><input class="goodsclassifyname" type="text"
								name="goodsclassifyname" placeholder="请输入分类名称" /></td>
						</tr>
						<tr>
							<td style="font-size: 20px;width: 200px;text-align: center;">排&nbsp;序&nbsp;号:</td>
							<td><input class="goodsclassifysort" type="text"
								name="goodsclassifysort" placeholder="请输入排序号" /></td>
						</tr>
						<tr>
							<td colspan="2"><input class="goodsclassifybtn"
								type="submit" value="确定"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</section>
	<!--_footer 作为公共模版分离出去-->
	<jsp:include page="../_footer.jsp"></jsp:include>
	<!--/_footer /作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript"
		src="lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
	<script type="text/javascript">
		var setting = {
			view : {
				dblClickExpand : false,
				showLine : false,
				selectedMulti : false
			},
			data : {
				simpleData : {
					enable : true,
					idKey : "id",
					pIdKey : "pId",
					rootPId : ""
				}
			},
			callback : {
				beforeClick : function(treeId, treeNode) {
					var zTree = $.fn.zTree.getZTreeObj("tree");
					if (treeNode.isParent) {
						zTree.expandNode(treeNode);
						return false;
					} else {
						demoIframe.attr("src", treeNode.file + ".html");
						return true;
					}
				}
			}
		};
	
		var zNodes = [
			{
				id : 1,
				pId : 0,
				name : "一级分类",
				open : true
			},
			{
				id : 11,
				pId : 1,
				name : "二级分类"
			},
			{
				id : 111,
				pId : 11,
				name : "三级分类"
			},
			{
				id : 112,
				pId : 11,
				name : "三级分类"
			},
			{
				id : 113,
				pId : 11,
				name : "三级分类"
			},
			{
				id : 114,
				pId : 11,
				name : "三级分类"
			},
			{
				id : 115,
				pId : 11,
				name : "三级分类"
			},
			{
				id : 12,
				pId : 1,
				name : "二级分类 1-2"
			},
			{
				id : 121,
				pId : 12,
				name : "三级分类 1-2-1"
			},
			{
				id : 122,
				pId : 12,
				name : "三级分类 1-2-2"
			},
		];
	
		var code;
	
		function showCode(str) {
			if (!code)
				code = $("#code");
			code.empty();
			code.append("<li>" + str + "</li>");
		}
	
		$(document).ready(function() {
			var t = $("#treeDemo");
			t = $.fn.zTree.init(t, setting, zNodes);
			demoIframe = $("#testIframe");
			demoIframe.bind("load", loadReady);
			var zTree = $.fn.zTree.getZTreeObj("tree");
			zTree.selectNode(zTree.getNodeByParam("id", '11'));
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>