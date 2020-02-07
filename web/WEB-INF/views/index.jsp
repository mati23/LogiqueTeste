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
      <a class="nav-link active text-white" href="/index/">Início</a>
      <c:choose>
          <c:when test="${login==null}">
              <a class="nav-link active text-white" href="/login/">Login</a>
              <a class="nav-link text-white" href="/register/">Registrar</a>
          </c:when>
          <c:when test="${login!=null}">
              <div class="nav-link active text-white">Olá, ${login}!</div>
              <a class="nav-link active text-white" href="/login/">Sair</a>
          </c:when>
      </c:choose>


  </nav>
      <div class="main-container">
          <img src="/resources/images/wallpaper.jpg" class="background-image"/>
          <c:choose>
              <c:when test="${login == null}">
                  <div class="login-message">
                      <div class="text-title text-white">Seja Bem-Vindo!</div>
                        <div class="text-message text-white">Para acessar a página precisamos de sua contribuição.</div> <br>
                        <div class="text-message text-white">Por favor, registre-se na nossa plataforma ou faça login se já for cadastrado!</div>
                      <div class="button-container">
                          <form action="/register/" method="get">
                              <button type="submit" class="btn btn-outline-danger">R E G I S T R A R</button>
                          </form>
                          <form action="/login/" method="get">
                            <button type="submit" class="btn btn-outline-danger">L O G I N</button>
                          </form>
                      </div>
                  </div>

              </c:when>
        <c:when test="${login!=null}">
        <div class="url-input">

            <form action="/index/compress" method="post" class="registration-form">
                <div class="link-tip text-center">Insira seu link abaixo</div>
                <div class="form-padding">
                    <input type="text" class="form-control"  id="url"  name="url"  placeholder="Cole sua URL aqui">
                </div>
                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-primary btn-lg convert-button" >Me Encurte!</button>
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
