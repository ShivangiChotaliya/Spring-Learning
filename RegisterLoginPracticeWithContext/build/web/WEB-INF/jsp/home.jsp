<%-- 
    Document   : home
    Created on : Jan 24, 2022, 9:39:47 AM
    Author     : Shivangi
--%>
<%@ page language="java" contentType= "text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*,java.util.*,java.lang.*,java.io.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title><c:out value="${page}"></c:out></title>
  </head>
  <body>
      <div class="container mt-3">
          <h1> Welcome to todo manager</h1>
      <c:if test="${not empty msg}">
          <div class="alert alert-success" >
              <b><c:out value="${msg}"></c:out></b>
          </div>
      </c:if>
          <div class="row mt-5">
              <div class="col-md-2">
                  <h3 class="text-center">Options</h3>
                  <div class="list-group">
                   <button type="button" class="list-group-item list-group-item-action active ">Menu</button>

                    <a href='<c:url value='/add'></c:url>' class="list-group-item list-group-item-action ">Register</a>
                    <a href='<c:url value='/home'></c:url>' class="list-group-item list-group-item-action ">View Users</a>
                  </div>
              </div>
              <div class="col-md-10">
                <c:if test="${page=='home'}">
                    <h1 class="text-center">All Users</h1>
                    <c:forEach items="${userslist}" var="user">
                        <div class="card">
                        <div class="card-body">    
                        <h3><c:out value="${user.fullName}"></c:out></h3>
                        <p><c:out value="${user.email}"></c:out></p>
                        <p><c:out value="${user.address}"></c:out></p>
                        <p><c:out value="${user.phoneNumber}"></c:out></p>     
                        </div></div>
                    </c:forEach>
                    
                </c:if>
                    

                <c:if test="${page=='add'}">
                      <h1 class="text-center">Add TODO</h1>
                  
                      <form:form action="registerUser"   method="post" modelAttribute="user">
                        <div class="form-group">
                            <form:input path="fullName" cssClass="form-control" placeholder="Enter Fullname"/>
                        </div>
                        <div class="form-group">
                            <form:input path="email" cssClass="form-control" placeholder="Enter Email"/>
                        </div>
                         <div class="form-group">
                            <form:input path="address" cssClass="form-control" placeholder="Enter Address"/>
                        </div>
                         <div class="form-group">
                            <form:input path="phoneNumber" cssClass="form-control" placeholder="Enter PhoneNumber"/>
                        </div>
                        <div class="container text-center">
                            <button class="btn btn-outline-success">Register</button>
                        </div>
                      </form:form>
                  
                  </c:if>

              </div>
          </div>
      </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>