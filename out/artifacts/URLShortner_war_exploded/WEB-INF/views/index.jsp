<%--
  Created by IntelliJ IDEA.
  User: mateus
  Date: 04/02/2020
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
  <head>
    <title>Link Compressor</title>
   <link href="/resources/css/bootstrap.css" rel="stylesheet">
    <link href="/resources/css/custom.css" rel="stylesheet">
      <link href="https://fonts.googleapis.com/css?family=Quicksand&display=swap" rel="stylesheet">
  </head>
  <body>
  <div class="d-flex flex-column h-100">
  <nav class="nav bg-info" style="background: #C8293F!important;">
      <a class="nav-link active text-white" href="login">Login</a>
      <a class="nav-link text-white" href="register">Register</a>
      <a class="nav-link text-white" href="#">Link</a>
      <a class="nav-link  text-white disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
  </nav>
      <div class="main-container">
          <img src="/resources/images/wallpaper.jpg" class="background-image"/>
          <c:choose>
              <c:when test="${false}">
                  <div>lala</div>
              </c:when>
        <c:when test="${true}">
        <div class="url-input">
            <form>
                <div class="link-tip text-center">Insira seu link abaixo</div>
                <div class="form-padding">
                    <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Example input placeholder">
                </div>
                <div class="d-flex justify-content-center">
                    <button type="button" class="btn btn-primary btn-lg convert-button" >Me Encurte!</button>
                </div>
            </form>
        </div>
        </c:when>
          </c:choose>


      </div>

  </div>

  <script src="/resources/js/jquery.js"></script>
  <script src="/resources/js/bootstrap.js"></script>
  </body>
</html>
