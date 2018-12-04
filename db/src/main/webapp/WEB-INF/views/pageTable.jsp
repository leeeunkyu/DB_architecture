<%@page import="com.work.dto.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<%ArrayList<Employee> employeeList = (ArrayList) request.getAttribute("employeeList"); %>
<%if(employeeList == null){ employeeList = new ArrayList<Employee>(); }%>
<html>
<div class="tableScroll">
	<table class="table table-striped stateTable">
	  <thead>
	    <tr>
	      <th scope="col">직원 아이디</th>
	      <th scope="col">직원 이름</th>
	      <th scope="col">최종 학력</th>
	      <th scope="col">직원 경력</th>
	      <th scope="col">직무 코드</th>
	    </tr>
	  </thead>
	  <tbody>
	  	<%for(int i = 0; i < employeeList.size(); i++){ %>
	  	<tr id="index<%=i%>">
			<td class="empId"><%=employeeList.get(i).getEmpId() %></td>
			<td class="empNm"><%=employeeList.get(i).getEmpNm() %></td>
			<td class="empEdulevel"><%=employeeList.get(i).getEmpEdulevel() %></td>
			<td class="empExe"><%=employeeList.get(i).getEmpExe() %></td>
			<td class="positionCode"><%=employeeList.get(i).getPositionCode() %></td>
		  </tr>  
	  </tbody>
	  <%} %>
	</table>
	</div>
	<nav aria-label="Page navigation example">
	  <ul class="pagination justify-content-center">
	    <li class="page-item">
	      <a class="page-link" onclick="prePage($('#firstPage').html())" >Previous</a>
	    </li>
	    <li class="page-item"><a class="page-link" onclick="selectEmployeeList($('#firstPage').html())" id="firstPage">1</a></li>
	    <li class="page-item"><a class="page-link" onclick="selectEmployeeList($('#secondPage').html())" id="secondPage">2</a></li>
	    <li class="page-item"><a class="page-link" onclick="selectEmployeeList($('#thirdPage').html())" id="thirdPage">3</a></li>
	    <li class="page-item">
	      <a class="page-link" onclick="nextPage($('#thirdPage').html())">Next</a>
	    </li>
	  </ul>
	</nav>
	<link href="${pageContext.request.contextPath}/resources/css/pageTable.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/resources/js/pageTable.js"></script>
</html>