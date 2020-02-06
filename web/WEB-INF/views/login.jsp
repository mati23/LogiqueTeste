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
        <a class="nav-link active text-white" href="/index/">Home</a>
        <a class="nav-link active text-white" href="/login/">Login</a>
        <a class="nav-link text-white" href="/register/">Register</a>
    </nav>
    <div class="main-container">
        <img src="/resources/images/wallpaper.jpg" class="background-image"/>
        <div class="registration-input">
            <form action="/login/login" method="post" style="background: rgba(255,255,255,0.5); padding: 1em; margin: 1em 0 0 0; border-radius: 10px;">
                <h1 style="margin: 1em 0 0 0;">Login</h1>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" class="form-control" id="email"  name="email" aria-describedby="emailHelp">
                </div>

                <div class="form-group">
                    <label for="passwordHash">Senha</label>
                    <input type="password" class="form-control" id="passwordHash" name="passwordHash">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>

</div>

<script src="/resources/js/jquery.js"></script>
<script src="/resources/js/bootstrap.js"></script>
</body>
</html>
