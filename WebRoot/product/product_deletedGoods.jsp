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
	<br>

	<section class="Hui-article-box">
		<nav class="breadcrumb">
			<i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span>
			商品管理 <span class="c-gray en">&gt;</span> 已删除失效商品 <a
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
						<span class="r">共有数据：<strong>54</strong> 条
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
									<th width="60">操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${deletedGoodsList }" var="g">
									<tr class="text-c va-m">
										<td><input name="" type="checkbox" value=""></td>
										<td id="goodsidTd">${g.goodsid }</td>
										<td><img width="100"
												class="product-thumb" src="${g.goodsimg}"></td>
										<td class="text-l"> ${g.goodsname }</td>
										<td class="td-status"><span
											class="label label-success radius"
											onClick="product_show('商品详情','${pageContext.request.contextPath }/product/product_showGoodsDetails.action',${g.goodsid })">
												商品详情</span></td>
										<td class="td-status"><c:if test="${g.dataflag == 1 }">
												<span class="label label-success radius">有效</span>
											</c:if> <c:if test="${g.dataflag == -1 }">
												<span class="label label-defaunt radius">已删除</span>
											</c:if></td>
										<td class="td-manage"><a style="text-decoration:none"
											class="ml-5"
											onClick="product_recoverDeletedGoods(this,${g.goodsid})"
											href="javascript:;" title="恢复"><i class="Hui-iconfont">&#xe6df;</i></a>
											</td>
									</tr>
								</c:forEach>
							</tbody>
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
	
		$(function() {
			$('.table-sort').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ], //默认第几个排序
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
	
	
		/*商品详情*/
		function product_show(title, url, id) {
			var index = layer.open({
				type : 2,
				title : title,
				content : url + "?goodsid=" + id
			});
			layer.full(index);
		}
	
	
		/*产品恢复*/
		function recoverDeletedGoods(id) {
			var message = 0;
			$.ajax({
				url : "${pageContext.request.contextPath }/product/product_recoverDeletedGoods.action",
				data : {
					goodsid : id
				},
				contentType:'application/json;charset=utf-8', 
				async : false,
				success : function(data) {
					message = data.message;
				},
				error : function(data) {},
				dataType : "json"
			})
			return message;
		}
		function product_recoverDeletedGoods(obj, id) {
		    layer.confirm('确认要恢复已删除失效的产品吗？', function(index) {
				var message = recoverDeletedGoods(id);
				if (message == 1) {
					$(obj).parents("tr").remove();
					alert("恢复成功...");
					window.location = "${pageContext.request.contextPath }/product/product_deletedGoods.action"
				} else {
					alert("恢复失败!!!");
					window.location = "${pageContext.request.contextPath }/product/product_deletedGoods.action"
				}
			});
		}
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>