<%-- 
    Document   : index
    Created on : 27 jul. 2022, 13:17:17
    Author     : Lisandro
--%>

<!-- Cabeza -->
<%@include file="./vistas/parciales/header.jsp" %>

<!-- Cuerpo -->
<% if(request.getParameter("page") == null){ %>
<%@include file="./vistas/parciales/cartel.jsp" %>
<%@include file="./vistas/parciales/cuerpo.jsp" %>


<% }else { %>

<%@include file="./vistas/parciales/formulario_ticket.jsp" %>


<% }%>

<!-- Pie -->
<%@include file="./vistas/parciales/footer.jsp" %>