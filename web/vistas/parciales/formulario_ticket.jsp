<%@page import="java.util.List"%>
<%@ page import="modelo.*" %>
<%@ page import="controlador.*" %>

<% 
    
    List<Categoria> categorias = new GestorCategoria().listar();
    
    for(Categoria cat : categorias){
        System.out.println(cat.getNombre());
    }
%>
<!-- ======= Cuerpo ======= -->

<section>
    <div class="row" id="formulario-tickets">
        <p>
            <h5 class="text-center">venta</h5>
            <h3 class="text-center display-6 fw-bold">VALOR DE TICKET $200</h3>
        </p>
    </div>
    
    
    <div class="row  gy-3">
        <div class="col-12 col-md-8 px-5 mb-1 mx-auto">
            <div class="row my-3">
                <div class="col-md-4 col-ms-12 mb-1">
                    <div class="card text-center border-primary">
                        <div class="card-body">
                            <h6 class="card-title fw-bold">Estudiante</h6>
                            <p class="card-text">Tiene un descuento</p>
                            <p class="card-text fw-bold">80%</p>
                            <p class="card-text text-muted">*presentar documentación</p>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 col-ms-12 mb-1">
                    <div class="card text-center border-info">
                        <div class="card-body">
                            <h6 class="card-title fw-bold">Trainee</h6>
                            <p class="card-text">Tiene un descuento</p>
                            <p class="card-text fw-bold">50%</p>
                            <p class="card-text text-muted">*presentar documentación</p>
                        </div>
                    </div>
                </div>

                <div class="col-md-4 col-ms-12 mb-1">
                    <div class="card text-center border-warning">
                        <div class="card-body">
                            <h6 class="card-title fw-bold">Junior</h6>
                            <p class="card-text">Tiene un descuento</p>
                            <p class="card-text fw-bold">15%</p>
                            <p class="card-text text-muted">*presentar documentación</p>
                        </div>
                    </div>
                </div>

            </div>
            <!-- ========== Formulario ================-->
            <form name="formulario-tickets" action="TicketControlador" method="POST" id="formulario">
                <div class="row">
                    <div class="col-12 col-md-6 mb-2">
                        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" required>
                    </div>
                    <div class="col-12 col-md-6 mb-2">
                        <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Apellido" required>
                    </div>
                </div>
                <div class="row my-3">
                    <div class="col">
                        <input type="email" name="correo" class="form-control" id="correo" placeholder="Correo" required>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 col-md-6 mb-2">
                        <label for="Cantidad" class="form-label">Cantidad</label>
                        <input onChange="ejecutar()" type="number" name= "cantidad" class="form-control" id="cantidad" placeholder="Cantidad" required>
                    </div>
                    <div class="col-12 col-md-6 mb-2">
                        <label for="select-form" class="form-label" >Categoría</label>
                        <select onChange="ejecutar()" class="form-select" aria-label="" id="select-tipo" name="categoria">
                            <% for(Categoria c : categorias){ 
                                out.println("<option value=" + c.getId_categoria() + ">" + c.getNombre() + "</option>" );
                                }
                            %> 
                        </select>
                    </div>
                </div>

                <div class="row my-4">
                    <div class="col">
                        <div class="d-block bg-info total d-flex align-items-center form-control py-2">
                            Total a pagar: &nbsp; <span id="id-total"></span>
                        </div>
                    </div>
                </div>
                <div class="row my-3">
                    <div class="col-12 col-md-6 mb-2">
                        <button type="button" class="btn bg-verde w-100 text-white"
                                onclick="limpiarFormulario()">Borrar</button>
                    </div>
                    <div class="col-12 col-md-6 mb-2">
                        <button type="submit" class="btn bg-verde w-100 text-white">Resumen</button>
                    </div>
                </div>
            </form>
        </div>

        <!-- ========== fin de formulario ================-->

</section>

