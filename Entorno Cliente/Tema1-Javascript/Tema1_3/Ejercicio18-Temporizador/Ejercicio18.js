/*Vamos a utilizar temporizadores: Crear una pagina y que cada segundo cambie de color el fondo: naranja /
azul hasta pulsar un botón Detener.*/

//Creamos el temporizador
let temporizador = setInterval(cambiarColor,1000);

function cambiarColor(){ 
    if (document.body.style.backgroundColor == "orange") {
        document.body.style.backgroundColor = "blue";
    } else {
        document.body.style.backgroundColor = "orange";
    }
}

function stop(){
    clearInterval(temporizador);
}

