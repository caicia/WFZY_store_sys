<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!--_meta 作为公共模版分离出去-->
<<jsp:include page="../_meta.jsp"></jsp:include>
<!--/meta 作为公共模版分离出去-->

<title>活动管理</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/lib/zTree/v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
</head>

<body>
	<div class="pd-20">
		<div class="cl pd-5 bg-1 bk-gray mt-20">
			<span class="l"><a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					批量删除</a> <a class="btn btn-primary radius"
				onclick="product_add('活动商品','${pageContext.request.contextPath}/product/product_toAddGoods.action')"
				href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加商品</a></span> <span
				class="r">共有数据：<strong>54</strong> 条
			</span>
		</div>
		<div class="mt-20">
				<table
					class="table table-border table-bordered table-bg table-hover table-sort">
					<thead>
						<tr class="text-c">
							<th width="40"><input name="" type="checkbox" value=""></th>
							<th width="40">ID</th>
							<th width="100">商品图片</th>
							<th width="100">商品名称</th>
							<th>商品详情</th>
							<th width="80">商品状态</th>
							<th width="80">是否上架</th>
							<th width="80">是否推荐</th>
							<th width="60">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${goodsList }" var="g">
							<tr class="text-c va-m">
								<td><input name="" type="checkbox" value=""></td>
								<td>${g.goodsid }</td>
								<td><img width="100" class="product-thumb"
									src="${g.goodsimg}"></td>
								<td class="text-l">${g.goodsname }</td>
								<td class="td-status"><span
									class="label label-success radius"> <a
										style="text-decoration:none"
										onClick="product_show('商品详情','${pageContext.request.contextPath }/product/product_showGoodsDetails.action',${g.goodsid })"
										href="javascript:;">商品详情</a></span></td>
								<td class="td-status"><c:if test="${g.goodsstatus ==1 }">
										<span class="label label-success radius">已审核</span>
									</c:if> <c:if test="${g.goodsstatus ==0 }">
										<span class="label label-failure radius">未审核</span>
									</c:if></td>
								<td class="td-status"><c:if test="${g.issale ==1 }">
										<span class="label label-success radius">已上架</span>
									</c:if> <c:if test="${g.issale ==0 }">
										<span class="label label-failure radius">未上架</span>
									</c:if></td>
								<td class="td-status"><c:if test="${g.isrecom ==1 }">
										<span class="label label-success radius">已推荐</span>
									</c:if> <c:if test="${g.isrecom ==0 }">
										<span class="label label-failure radius">未推荐</span>
									</c:if></td>
								<td class="td-manage"><a style="text-decoration:none"
									class="ml-5"
									onClick="product_edit('产品编辑','${pageContext.request.contextPath }/product/product_toUpdateGoods.action',${g.goodsid })"
									href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a>
									<a style="text-decoration:none" class="ml-5"
									onClick="product_del(this,${g.goodsid })" href="javascript:;"
									title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		</div>
	</div>


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
				content : url+"?goodsid="+id
			});
			layer.full(index);
		}
	
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ], //默认第几个排序
				"bStateSave" : true, //状态保存
				"aoColumnDefs" : [
					//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
					{
						"orderable" : false,
						"aTargets" : [ 0, 8 ]
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
	
		/*活动-编辑*/
		function product_edit(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url+"?goodsid="+id
			});
		 layer.full(index)
		}
		/*产品-删除*/
		function deleteGoods(id) {
			var message = 0;
			$.ajax({
				url : '${pageContext.request.contextPath }/product/product_toDeleteGoods.action',
				data : {
					goodsid : id
				},
				dataType : "json",
				async : false,
				success : function(data) {
					message = data.message;
				},
				error : function(data) {},
			})
			alert(message);
			return message;
		}
		function product_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
			
				var message = deleteGoods(id);
				alert("===========deleteGoods(id)============");
				if (message == 1) {
					$(obj).parents("tr").remove();
					alert("删除成功...");
					window.location = "${pageContext.request.contextPath }/product/product_list.action"
				} else {
					alert("删除失败!!!");
					window.location = "${pageContext.request.contextPath }/product/product_list.action"
				}
			});
		}
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>