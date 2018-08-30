<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 基础 datatable 引入文件 -->
<link rel="stylesheet" type="text/css"  href="${pageContext.request.contextPath }/css/jquery.dataTables.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/dataTables.bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/dataTables.bootstrap.min.css"/>
<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath }/js/jquery.dataTables.js"></script>
<script type="text/javascript" charset="UTF-8" src="${pageContext.request.contextPath }/js/dataTables.bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/chushi.css">

<!-- 生成Escel引入文件  -->
<script type="text/javascript" charset='UTF-8' src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript" charset='UTF-8' src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" charset='UTF-8' src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" charset='UTF-8' src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script type="text/javascript" charset='UTF-8' src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.html5.min.js"></script>
<link rel="stylesheet" type="text/css"  href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
<link rel="stylesheet" type="text/css"  href="https://cdn.datatables.net/buttons/1.5.1/css/buttons.dataTables.min.css">

<style type="text/css">
	tbody{
		text-align: center;
	}
</style>


<script type="text/javascript" charset='UTF-8' src="${pageContext.request.contextPath }/js2/tabledata.js"></script>
</head>
<body>
<div style="width:500px;height:60px;">
	<table id="table" class="display dataTable" cellspacing="0" width="100%" >
	<thead>
		<tr>
			<th>姓名</th>
			<th>年龄</th>
			<th>性别</th>
		</tr>
	</thead>
	</table>
	<a href="${pageContext.request.contextPath }/jsp/jt.jsp">静态页</a>
</div>
</body>
</html>
