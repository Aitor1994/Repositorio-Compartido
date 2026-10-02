//Creamos el temporizador cada 2 segundos
let cronometro = setInterval(mensaje,2000);
let ventana;

function mensaje(){
    console.log("En un lugar de la mancha");
    
}

function stop(){
    clearInterval(cronometro);
}

function mostrarMensaje(){
    let cronometro2 = setTimeout(mensaje2,3000);
} 

function mensaje2(){
    console.log("Han pasado 3 segundos.");
}
/* O BIEN EN 1 SOLA : 
function mensaje2(){

    setTimeout(function(){
        console.log("Han pasado 3 segundos.");
    }, 3000);

} */
let temporizador;
function abrirVentana(){
    ventana = window.open("","nueva ventana","width = 300, height = 300")
    ventana.document.write("<p>ESTO ES UN TEXTO EN P</p>");
    temporizador = setInterval(reloj,1000);
    let temporizador2 = setTimeout(pararReloj,5000);
    let temporizador3 = setTimeout(cerrarVentana,10000);
}

function reloj() {
    let fecha = new Date();
    let hora = fecha.toLocaleTimeString();
    //Para el salto de linea se USAN etiquetas html <br> no \n.
    ventana.document.body.innerHTML += hora +"<br>";
}

function pararReloj(){
    clearInterval(temporizador);
}

function cerrarVentana(){
    ventana.close();
}
