<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <!-- Contact Section -->
    <section id="contact">
      <div class="container">
        <h2 class="text-center text-uppercase text-secondary mb-0">회원 가입</h2>
        <hr class="star-dark mb-5">
        <div class="row">
          <div class="col-lg-8 mx-auto">
            <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
            <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
            <form name="employee" action="signUp.do" method="post" novalidate="novalidate">
              <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>직원명</label>
                  <input class="form-control" name="empNm" type="text" placeholder="직원명" required="required" data-validation-required-message="직원명을 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>ID</label>
                  <input class="form-control" name="empId" type="text" placeholder="아이디" required="required" data-validation-required-message="이메일을 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>비밀번호</label>
                  <input class="form-control" name="empPwd" type="password" placeholder="비밀번호" required="required" data-validation-required-message="비밀번호를 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
               <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>직무코드</label>
                  <input class="form-control" name="positionCode" type="text" placeholder="직무코드" required="required" data-validation-required-message="부서번호를 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>주민등록번호</label>
                  <input class="form-control" name="empRrn" type="text" placeholder="주민등록번호" required="required" data-validation-required-message="주민등록번호를 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                  <label>최종학력</label>
                  <input class="form-control" name="empEdulevel" type="text" placeholder="최종학력" required="required" data-validation-required-message="최종학력을 입력해 주세요">
                  <p class="help-block text-danger"></p>
                </div>
              </div>
              <br>
              <div id="success"></div>
              <div class="form-group">
                <button type="submit" class="btn btn-primary btn-xl" id="signUpBtn">가입하기</button>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
</html>