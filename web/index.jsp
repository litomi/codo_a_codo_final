<%-- 
    Document   : index
    Created on : 27 jul. 2022, 13:17:17
    Author     : Lisandro
--%>


<!-- Cabeza -->
<%@include file="./vistas/parciales/header.jsp" %>


<!-- Cuerpo -->

<%
    String param = request.getParameter("page");
    param = (param != null) ? param : "";

    switch (param) {
        case "form_venta": {%>
<%@include file="./vistas/parciales/formulario_ticket.jsp" %>
<% }
        break;
        case "form_orador": {%>
<%@include file="./vistas/parciales/formulario_orador.jsp" %>
<%}
    break;
    case "tabla_tickets": {%>
<%@include file="./vistas/parciales/tabla_tickets.jsp" %>
<%   }
    break;
    case "tabla_oradores": {%>
<%@include file="./vistas/parciales/tabla_oradores.jsp" %>
<%  }
    break;
    default: {%>
<%@include file="./vistas/parciales/cartel.jsp" %>
<% }
    }%>



<!-- Pie -->
<%@include file="./vistas/parciales/footer.jsp" %>