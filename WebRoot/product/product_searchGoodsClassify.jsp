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
.clear {
	clear: both;
}

.addOneClassifyBtn {
	display: block;
	width: 220px;
	height: 35px;
	color: white;
	margin-top: 10px;
	margin-left: 20px;
	background-color: green;
	font-size: 22px;
	text-align: center;
	border-radius: 5px;
	text-decoration: none;
}
.addOneClassifyBtn:HOVER {
	color: white;
	text-decoration: none;
}

.searchInput{
    font-size:20px;
    width: 220px;
	height: 35px;
	color: #707070;
	background-color: white;
	margin-top: 10px;
	margin-left: 20px;
	border: 1px solid black;
	border-radius: 5px;
	text-indent: 2em;
}
.searchBtn{
	width: 76px;
    height: 34px;
    font-size: 18px;
	color: white;
	background-color: green;
	text-align: center;
	border-radius: 5px;
	border: 0px;
	margin-top: 10px;
}

.classifyTable {
	width: 95%;
	margin-top: 10px;
	border: 3px solid rgb(240, 240, 240);
}

.classifyTr {
	text-align: left;
	background-color: rgb(249, 249, 249);
}

.classifyTr1 {
	text-align: left;
	height: 50px;
}

.classifyTr td {
	font-size: 20px;
}

.classifyTr1 td {
	font-size: 18px;
	border: 2px solid rgb(240, 240, 240);
}

.addClassify {
	display: block;
	width: 160px;
	height: 30px;
	color: white;
	background-color: green;
	text-align: center;
	border-radius: 5px;
	float: left;
	margin-right: 10px;
	margin-left: 10px;
}

.updateClassify {
	display: block;
	width: 50px;
	height: 30px;
	color: white;
	background-color: green;
	text-align: center;
	border-radius: 5px;
	float: left;
	margin-right: 10px;
}

.deleteClassify {
	display: block;
	width: 50px;
	height: 30px;
	color: white;
	background-color: green;
	text-align: center;
	border-radius: 5px;
	float: left;
}

.classifyTable tr td a:HOVER {
	color: white;
	text-decoration: none;
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
			<a class="addOneClassifyBtn"
				href="${pageContext.request.contextPath }/product/prodctCategory.action">查看一级分类</a>
			<a class="addOneClassifyBtn"
				href="${pageContext.request.contextPath }/product/prodctCategoryTwo.action">查看二级分类</a>
			<a class="addOneClassifyBtn"
				href="${pageContext.request.contextPath }/product/prodctCategoryThree.action">查看三级分类</a>
			<a class="addOneClassifyBtn"
				href="${pageContext.request.contextPath }/product/product_OneGoodsClassify.action">+
				新增一级分类</a>
			<form
				action="${pageContext.request.contextPath }/product/product_serchGoodsClassify.action"
				method="get">
				<input class="searchInput" name="searchInput" type="text"
					name="allKey" placeholder="请输入关键字"> <input
					class="searchBtn" type="submit" value="搜索">
			</form>

			<div style="margin: 0 auto; width: 95%; font-size: 20px;">
				<table class="classifyTable">
					<tr class="classifyTr">
						<td style="color: red;text-align:center;">#</td>
						<!-- <td style="text-align:center;">Id</td> -->
						<td style="text-align:center;">父类</td>
						<td style="text-align:center;">分类级别</td>
						<td style="text-align:center;">分类名称</td>
						<td style="text-align:center;">排序号</td>
						<td style="text-align:center;">子类总数</td>
						<td>操作</td>
					</tr>

					<c:if test="${searchGoodsclassifyVo.size() <= 0 }">
						<tr class="classifyTr">
							<td colspan="7" style="color: red;text-align:center;">暂无数据</td>
						</tr>
					 </c:if>

                    <c:if test="${searchGoodsclassifyVo.size() > 0 }">
							<!-- 商品分类遍历 -->
							<%
								int i = 1;
							%>
							<c:forEach items="${searchGoodsclassifyVo }" var="i">
								<tr class="classifyTr1">
									<td style="color: red;text-align:center;"><%=i++%></td>
									<%-- <td style="text-align:center;">${i.goodsclassifyid }</td> --%>
									<td style="text-align:center;"><c:if
											test="${i.goodsclassifyparentname == null }">顶级</c:if> <c:if
											test="${i.goodsclassifyparentname != null }">
							      ${i.goodsclassifyparentname }
							   </c:if></td>
									<td style="text-align:center;"><c:if
											test="${i.goodsclassifygrade==1 }">一级----></c:if> <c:if
											test="${i.goodsclassifygrade==2 }">二级----></c:if> <c:if
											test="${i.goodsclassifygrade==3 }">三级----></c:if></td>
									<td style="text-align:center;">${i.goodsclassifyname }</td>
									<td style="text-align:center;">${i.goodsclassifysort }</td>
									<td style="text-align:center;">${i.childcount }</td>
									<td><c:if test="${i.goodsclassifygrade==1 }">
											<a class="addClassify"
												href="${pageContext.request.contextPath }/product/product_TwoGoodsClassify.action?goodsclassifyid=${i.goodsclassifyid}">+
												新增二级分类</a>
										</c:if> <c:if test="${i.goodsclassifygrade==2 }">
											<a class="addClassify"
												href="${pageContext.request.contextPath }/product/product_ThreeGoodsClassify.action?goodsclassifyid=${i.goodsclassifyid}">+
												新增三级分类</a>
										</c:if> <a class="updateClassify"
										href="${pageContext.request.contextPath }/product/product_updateGoodsClassify.action?goodsclassifyid=${i.goodsclassifyid}&goodsclassifyname=${i.goodsclassifyname }&goodsclassifysort=${i.goodsclassifysort }&goodsclassifygrade=${i.goodsclassifygrade }">修改</a>
										<a class="deleteClassify"
										href="${pageContext.request.contextPath }/product/product_deleteGoodsClassify.action?goodsclassifyid=${i.goodsclassifyid}">删除</a></td>
								</tr>
							</c:forEach>
						</c:if>
						<div class="clear"></div>
				</table>

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