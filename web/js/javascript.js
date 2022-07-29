var cantidad = 0;
var tipo;
var valor = 200;
var desc_estudiante = 0.8;
var desc_trainee = 0.5;
var desc_junior = 0.15;
var monto = 0;
var descuento = 0;

function capturaDatosFormulario() {
    cantidad = document.getElementById('cantidad').value;
    tipo = document.getElementById('select-tipo').value;
   
}

function determinarDescuento() {
     
    switch (tipo) {
        case '1':
            descuento = desc_estudiante;
            break;
        case '2':
            descuento = desc_trainee;
            break;
        case '3':
            descuento = desc_junior;
            break;
        default:
            break;
    }
}

function calcularMonto() {
    monto = redondear((parseInt(cantidad) * valor) * (1 - descuento));
}

function imprimir(){
    document.getElementById('id-total').innerHTML = '<b> $' + monto + '</b>';
}

function limpiarFormulario() {
    document.getElementById("formulario").reset();
    document.getElementById('id-total').innerHTML = "";
}

function redondear(num) {
    var m = Number((Math.abs(num) * 100).toPrecision(15));
    return Math.round(m) / 100 * Math.sign(num);
}

function ejecutar() {
    capturaDatosFormulario();    
    if (cantidad !== 0) {
        determinarDescuento();
        calcularMonto();
        imprimir();
    }
}