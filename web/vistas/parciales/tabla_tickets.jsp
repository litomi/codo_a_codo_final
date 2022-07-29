<%-- 
    Document   : tabla_tickets
    Created on : 29 jul. 2022, 02:52:36
    Author     : Lisandro
--%>
<%@page import="java.util.List"%>
<%@page import="modelo.VistaTicketModelo"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modelo.GestorTicket"%>
<%
    GestorTicket gestorTicket = new GestorTicket();
    List<VistaTicketModelo> lista = gestorTicket.listarDetalle();
%>
<div class="row  gy-3">
    <div class="col-12 col-md-8 px-5 mb-1 mx-auto">
        <% if(lista.size() != 0){ %>
        <table class="table table-hover table-light">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Nombre y apellido</th>
                    <th scope="col">Categoría</th>
                    <th scope="col">Cantidad</th>
                    <th scope="col">Precio unitario</th>
                    <th scope="col">Total</th>
                    <th scope="col">&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <% for (VistaTicketModelo v : lista) {
                        out.print("<tr>");
                        out.print("<td>" + v.getId() + "</td>");
                        out.print("<td>" + v.getNombre_apellido() + "</td>");
                        out.print("<td>" + v.getCategoría() + "</td>");
                        out.print("<td>" + v.getCantidad() + "</td>");
                        out.print("<td> $" + v.getPrecio() + "</td>");
                        out.print("<td> $" + v.getTotal() + "</td>");
                        out.print("<td> <button class='btn btn-success'>X</button> </td>");
                        out.print("</tr>");
                    }
                %>

            </tbody>
        </table>
         <% }else{ %>
         <div class="d-block bg-warning text-center text-white form-control p-2 my-5"> 
             <h4 class="">No hay registros que mostrar.</h4>
         </div>
         
           <% }%>
    </div>
</div>
