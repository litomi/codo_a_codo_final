<%-- 
    Document   : formulario_orador
    Created on : 29 jul. 2022, 14:43:21
    Author     : Lisandro
--%>

<!-- ======= Formulario ======= -->
<div class="row">
    <p>
        <h6 class="text-center">CONVIÉRTE EN</h6>
        <h3 class="text-center ">ORADORES</h3>
    </p>
<p class="text-center">
    Anotate como orador para dar una charla ignite. ¡Cuéntanos de que quieres hablar!
</p>
</div>

<section class="row d-flex justify-content-center" id="formulario-oradores">

    <div class="col-8">
        <form method="POST" action="OradorControlador">
            <div class="row">
                <div class="col">
                    <input type="text" class="form-control" placeholder="Nombre" 
                           aria-label="Nombre" name="nombre" required>
                </div>
                <div class="col">
                    <input type="text" class="form-control" placeholder="Apellido" 
                           aria-label="Apellido" name="apellido" required>
                </div>
            </div>

            <div class="row">
                <div class="col mt-3">
                    <textarea class="form-control" id="comentarios" rows="3"
                              placeholder="¿Sobre qué quieres hablar?" name="tema" required></textarea>
                </div>
            </div>

            <div class="row">
                <div class="form-text">Recuerda incluir un título en tu charla.</div>
                <div class="row g-0">
                    <div class="col m-3">
                        <button type="submit" class="btn btn-primary bg-verde w-100">Enviar</button>
                    </div>
                </div>
            </div>
        </form>
    </div>

</section>