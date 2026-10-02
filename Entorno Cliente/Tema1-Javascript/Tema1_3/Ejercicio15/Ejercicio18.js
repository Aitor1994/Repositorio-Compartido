/*Vamos a utilizar temporizadores: Crear una pagina y que cada segundo cambie de color el fondo: naranja /
azul hasta pulsar un botón Detener.*/
let temporizador = setInterval(cambiarColor,1000);

/*Tambien podemos coger el color guardarlo en una variable y usar esa variable*/
function cambiarColor(){
    //let color = window.document.body.style.backgroundColor;
    
    if(window.document.body.style.backgroundColor == "blue"){
        window.document.body.style.backgroundColor="red";
    }else{
        window.document.body.style.backgroundColor="blue";
    }
}


function pararTemporizador(){
    clearInterval(temporizador);
}