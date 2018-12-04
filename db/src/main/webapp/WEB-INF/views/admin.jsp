<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 

<!DOCTYPE html>

<html>

<head>
	<link href="${pageContext.request.contextPath}/resources/css/admin.css" rel="stylesheet">
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="UTF-8">
	<title>JSP</title>
</head>

<body>
    <!-- Bootstrap core JavaScript -->
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    

	<section id="videoBox">
		<video id="homeVideo" preload="auto" autoplay="true" loop="loop" muted="muted">
	     <source src="${pageContext.request.contextPath}/resources/file/home_main.mp4" type="video/mp4">	
		</video>
	</section>
	
	<div class="container" id="loginBox">
		<div class="d-flex justify-content-center">
			<span id="adminLogo"><h1>DB SUL ADMIN</h1></span>
		</div>
		<p>  
	<form action="signInAdmin.do" method="POST">
	 <div class="form-group">
	   <label for="exampleInputEmail1">ID</label>
	   <input type="text" class="form-control" name="id">
	 </div>
	 <div class="form-group">
	   <label for="exampleInputPassword1">Password</label>
	   <input type="password" class="form-control" name="password">
	 </div>
	 <button type="submit" class="btn btn-primary">로그인</button>
	</form>
	</div>
	
	
	<script src="${pageContext.request.contextPath}/resources/js/admin.js"></script>
	
</body>

</html>