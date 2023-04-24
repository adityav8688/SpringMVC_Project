<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="./base.jsp" %>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

	<div action="saved" class="container mt-3">
	
		<div calss="col-md-12">
		
			<h1 class="text-center mb-3">saved file</h1>
			
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Phone</th>
      <th scope="col">From</th>
      <th scope="col">To</th>
      <th scope="col">Date</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${aliens }" var="a">
    <tr>
      <th scope="row">${a.aid }</th>
      <td>${a.name }</td>
      <td>${a.email }</td>
      <td>${a.phone }</td>
      <td>${a.afrom }</td>
      <td>${a.desti }</td>
      <td>${a.date }</td>
      <td>
      	<a href = "delete/${a.aid }"><i class="fa-solid fa-trash-can text-danger"></i></a>
      	<a href = "update/${a.aid }"><i class="fa-solid fa-pen"></i></a>
      </td>
      
    </tr>
  </c:forEach>  
  </tbody>
</table>

<div class = "container text-center">

<a href="add-alien" class="btn btn-outline-success">Add Alien</a>

</div>
			
		</div>
	
	</div>

</body>
</html>