<%-- 
    Document   : header
    Created on : 27 jul. 2022, 13:31:19
    Author     : Lisandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./css/estilos.css">
        <link rel="stylesheet" href="./css/bootstrap.min.css">
        <title>Codo a codo</title>
    </head>

    <body>
        <header>
            <nav class="navbar navbar-expand-lg navbar-dark color-navbar color-navbar-text py-1 px-5">
                <a class="navbar-brand" href="<%= request.getRequestURI()%>">
                    <img src="img/codoacodo.png" width="120" class="img-fluid" alt="">
                    <span class="fs-3">
                        Conf. Bs As
                    </span>
                </a>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">La Conferencia</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%= request.getRequestURI() %>?page=tabla_oradores#formulario-oradores">Los oradores</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="<%= request.getRequestURI() %>?page=form_orador#formulario-oradores">Conviérte en orador</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%= request.getRequestURI() %>?page=form_venta#formulario-tickets" >Comprar tickets</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<%= request.getRequestURI() %>?page=tabla_tickets">Inscriptos</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>
                    

        
        