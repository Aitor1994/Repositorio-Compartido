/*Crear código JavaScript tal que al pulsar el botón, se abra una ventana emergente donde se muestre la cuenta atrás
de segundos que quedan para que se cierre automáticamente. El número de segundos vendrá en el campo cuyo id es
‘segundos’. Cuando se cierre, debe escribirse en la página principal, “Ya han pasado X segundos y se ha cerrado la
ventana emergente”.*/
var ventana;
var segundos;
var tiempo;
var temporizador;

function abrirVentana(){
    ventana = window.open("", "Ventana emergente"," width=300, height=300");
    tiempo = parseInt(document.getElementById("segundos").value);
    segundos = tiempo;
    temporizador = setInterval(cuentaAtras, 1000);
}

function cuentaAtras(){
    segundos--;
    ventana.document.body.innerHTML = "Quedan " + segundos + " segundos."

    if(segundos <= 0){
        clearInterval(temporizador);
        ventana.close();
        ventana.opener.document.body.innerHTML += "Ya han pasado " + tiempo + " segundos y se ha cerrado la ventana emergente";
    }

}