<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>JSP</title>

</head>

<body>
    <section class="bg-primary text-white mb-0" id="about">
      <div class="container">
        <h2 class="text-center text-uppercase text-white">로그인</h2>
        <hr class="star-light mb-5">
		<div class="control-group">
          <div class="form-group floating-label-form-group controls mb-0 pb-2">
            <label>직원번호</label>
            <input class="form-control" name="empId" id="empId" type="text" placeholder="직원명" required="required" data-validation-required-message="직원번호를 입력해 주세요">
            <p class="help-block text-danger"></p>
          </div>
        </div>
        <div class="control-group">
          <div class="form-group floating-label-form-group controls mb-0 pb-2">
            <label>비밀번호</label>
            <input class="form-control" name="pass" id="pass" type="password" placeholder="비밀번호" required="required" data-validation-required-message="비밀번호를 입력해 주세요">
            <p class="help-block text-danger"></p>
          </div>
        </div>
        <div class="text-center mt-4">
          <a class="btn btn-xl btn-outline-light" id="signInBtn" onclick="signIn()">
			로그인
          </a>
        </div>
      </div>
    </section>
</body>

</html>