<%@ page language="java" import="java.util.*,com.WFZY.pojo.*"
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
	line-height: 30px;
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
	line-height: 30px;
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
	line-height: 30px;
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

			<div style="">
				<div class="pd-20">
					<div class="text-c">
						日期范围： <input type="text"
							onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})"
							id="logmin" class="input-text Wdate" style="width:120px;">
						- <input type="text"
							onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})"
							id="logmax" class="input-text Wdate" style="width:120px;">
						<input type="text" name="" id="" placeholder=" 活动名称"
							style="width:250px" class="input-text">
						<button name="" id="" class="btn btn-success" type="submit">
							<i class="Hui-iconfont">&#xe665;</i> 搜活动
						</button>
					</div>
					<div class="cl pd-5 bg-1 bk-gray mt-20">
						<span class="l"> <a class="btn btn-danger radius"
							href="${pageContext.request.contextPath }/product/prodctCategory.action">查看一级分类</a>
							<a class="btn btn-danger radius"
							href="${pageContext.request.contextPath }/product/prodctCategoryTwo.action">查看二级分类</a>
							<a class="btn btn-danger radius"
							href="${pageContext.request.contextPath }/product/prodctCategoryThree.action">查看三级分类</a>
							<a class="btn btn-primary radius"
							href="${pageContext.request.contextPath }/product/product_OneGoodsClassify.action"><i
								class="Hui-iconfont">&#xe600;</i> 新增一级分类</a></span> <span class="r">共有数据：<strong>54</strong>条
						</span>
					</div>
					<div class="mt-20">
						<table
							class="table table-border table-bordered table-bg table-hover table-sort">
							<thead>
								<tr class="text-c">
									<td style="color: red;text-align:center;">#</td>
									<!-- <td style="text-align:center;">Id</td> -->
									<td style="text-align:center;">父类</td>
									<td style="text-align:center;">分类级别</td>
									<td style="text-align:center;">分类名称</td>
									<td style="text-align:center;">排序号</td>
									<td style="text-align:center;">子类总数</td>
									<td>操作</td>
								</tr>
							</thead>
							<tbody>
								<!-- 商品分类遍历 -->
								<%
										int i = 1;
									%>
								<c:forEach items="${goodsclassifyListVo }" var="i">
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

								<div class="clear"></div>
						</table>
					</div>
				</div>
			</div>
		</div>
	</section>



	<!--_footer 作为公共模版分离出去-->
	<jsp:include page="../_footer.jsp"></jsp:include>
	<!--/_footer /作为公共模版分离出去-->

	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/lib/zTree/v3/js/jquery.ztree.all-3.5.min.js"></script>
	<script type="text/javascript">
		/*添加活动*/
		function product_add(title, url) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
		/**/
		function product_show(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url
			});
			layer.full(index);
		}
	
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 0, "desc" ] ], //默认第几个排序
				"bStateSave" : true, //状态保存
				"aoColumnDefs" : [
					//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
					{
						"orderable" : false,
						"aTargets" : [ 0, 6 ]
					} // 制定列不参与排序
				]
			});
			$('.table-sort tbody').on('click', 'tr', function() {
				if ($(this).hasClass('selected')) {
					$(this).removeClass('selected');
				} else {
					table.$('tr.selected').removeClass('selected');
					$(this).addClass('selected');
				}
			});
		});
	
		function updateType(id, type) {
			var message = 0
			$.ajax({
				url : 'http://localhost:8080/WFZY_Backstage/updataActivity.action',
				data : {
					activityId : id,
					activityType : type
				},
				async : false,
				success : function(data) {
					message = data.message
				},
				error : function(data) {},
				dataType : "json"
			})
			return message
		}
	
		function deleteActivity(id) {
			var message = 0
			$.ajax({
				url : 'http://localhost:8080/WFZY_Backstage/deleteActivity.action',
				data : {
					activityId : id
				},
				success : function(data) {
					message = data.message
				},
				error : function(data) {},
				dataType : "json"
			})
			return message
		}
	
	
		/*活动-下架*/
		function product_stop(obj, id) {
			layer.confirm('确认要下架吗？', function(index) {
				var message = updateType(id, 0)
				if (message == 1) {
					$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_start(this,'+id+')" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
					$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
					$(obj).remove();
					layer.msg('已下架!', {
						icon : 6,
						time : 1000
					});
				} else {
					layer.msg('下架失败!', {
						icon : 5,
						time : 1000
					});
				}
			});
		}
	
		/*活动-发布*/
		function product_start(obj, id) {
			layer.confirm('确认要发布吗？', function(index) {
				var message = updateType(id, 1)
				if (message == 1) {
					$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="product_stop(this,'+id+')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
					$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
					$(obj).remove();
					layer.msg('已发布!', {
						icon : 6,
						time : 1000
					});
				} else {
					layer.msg('发布失败!', {
						icon : 5,
						time : 1000
					});
				}
			});
		}
	
		/*活动-编辑*/
		function product_edit(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url+"?activityId="+id
			});
		 layer.full(index)
		}
		/*活动-删除*/
		function product_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				var message = deleteActivity(id)
				if (message == 1) {
					$(obj).parents("tr").remove();
					layer.msg('已删除!', {
						icon : 1,
						time : 1000
					});
				} else {
					layer.msg('删除失败!', {
						icon : 5,
						time : 1000
					});
				}
			});
		}
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>