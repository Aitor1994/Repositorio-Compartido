var ventana;
var segundos;
var temporizador;
var numero;

function abrirVentana(){
    ventana = window.open("", "ventana", "width=400,height=400, top = 300, left = 3000");
    numero = parseInt(document.getElementById("contador").value);
    segundos = numero;
    setTimeout(cerrarVentana, numero * 1000);
    temporizador = setInterval(contadorVisual, 1000);
}

function cerrarVentana(){
    ventana.close();
}

function contadorVisual(){
    segundos = segundos - 1;
    document.getElementById("p1").innerHTML = "Quedan = " + segundos + " segundos.";
    //document.getElementById("div1").innerHTML = "Quedan = "+ segundos +" segundos.";


    if(segundos <= 0){
        segundos = 10;
        clearInterval(temporizador);
    }
}