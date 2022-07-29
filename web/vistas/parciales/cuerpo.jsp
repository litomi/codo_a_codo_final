<%-- 
    Document   : cuerpo
    Created on : 27 jul. 2022, 13:45:20
    Author     : Lisandro
--%>


<!-- ======= Oradores ======= -->
<section class="row">
    <div class="row">
        <p>
        <h6 class="text-center">CONOCE A LAS</h6>
        <h3 class="text-center ">ORADORES</h3>
        </p>


    </div>
    <div class="row d-flex justify-content-center g-0">
        <div class="card col-md-3 m-2">
            <img src="img/steve.jpg" class="card-img-top img-fluid" alt="...">
            <div class="card-body">

                <span class="badge bg-warning text-wrap text-dark">
                    JavaScript
                </span>
                <span class="badge bg-primary text-wrap">
                    React
                </span>

                <h4 class="card-title fs-3">
                    Steve Jobs
                </h4>

                <p class="card-text fs-6 mt-4">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Obcaecati laborum dignissimos fuga
                    blanditiis cum aspernatur, ea ipsum cupiditate minima doloribus!
                </p>

            </div>
        </div>

        <div class="card col-md-3 m-2">
            <img src="img/bill.jpg" class="card-img-top img-fluid" alt="...">
            <div class="card-body">

                <span class="badge bg-warning text-wrap text-dark">
                    JavaScript
                </span>

                <span class="badge bg-primary text-wrap">
                    React
                </span>

                <h4 class="card-title fs-3">
                    Bill Gates
                </h4>

                <p class="card-text fs-6 mt-4">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Obcaecati laborum dignissimos fuga
                    blanditiis cum aspernatur, ea ipsum cupiditate minima doloribus!
                </p>

            </div>
        </div>

        <div class="card col-md-3 m-2">
            <img src="img//ada.jpeg" class="card-img-top img-fluid" alt="...">
            <div class="card-body">

                <span class="badge bg-secondary text-wrap text-white">
                    Negocios
                </span>
                <span class="badge bg-danger text-wrap text-white">
                    Startups
                </span>

                <h4 class="card-title fs-3">
                    Ada Lovelace
                </h4>

                <p class="card-text fs-6 mt-4">
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Obcaecati laborum dignissimos fuga
                    blanditiis cum aspernatur, ea ipsum cupiditate minima doloribus!
                </p>

            </div>
        </div>
    </div>

</section><!-- Fin - Oradores -->

<!-- ======= Media ======= -->
<section class="row">
    <div class="card mb-12 mt-5">
        <div class="row g-0">
            <div class="col-md-6 border border-white">
                <img src="img/honolulu.jpg" class="img-fluid rounded-start" alt="...">
            </div>
            <div class="col-md-6 color-navbar border border-white">
                <div class="card-body text-white">
                    <h3 class="card-title">Card title</h3>
                    <p class="card-text">This is a wider card with supporting text below as a natural lead-in to
                        additional content. This content is a little bit longer.</p>
                    <a href="#" class="mybutton">Conoc� m�s</a>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- ======= Formulario ======= -->
<div class="row">
    <p>
    <h6 class="text-center">CONVI�RTE EN</h6>
    <h3 class="text-center ">ORADORES</h3>
</p>
<p class="text-center">
    Anotate como orador para dar una charla ignite. �Cu�ntanos de que quieres hablar!
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
                              placeholder="�Sobre qu� quieres hablar?" name="tema" required></textarea>
                </div>
            </div>

            <div class="row">
                <div class="form-text">Recuerda incluir un t�tulo en tu charla.</div>
                <div class="row g-0">
                    <div class="col m-3">
                        <button type="submit" class="btn btn-primary bg-verde w-100">Enviar</button>
                    </div>
                </div>
            </div>
        </form>
    </div>

</section>