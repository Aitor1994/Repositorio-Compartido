/* Crear una página html con un botón, tal que al pulsarlo, se abra una nueva ventana emergente de 400x200
con un mensaje. Esta ventana nueva debe cerrarse automáticamente tras 10 segundos. En la ventana
principal, se mostrará la cuenta atrás con los segundos que faltan para que la ventana emergente se cierre*/
var ventana;
var segundos = 11;
var temporizador;

function abrirVentana(){
    ventana = window.open("","nueva ventana","width = 400, height = 200");
    ventana.document.write("<h1>Ventana 1</h1>");
    temporizador = setInterval(cronometro,1000);
}

function cronometro(){
    let texto = window.document.getElementById("numero");
    segundos = segundos - 1;
    texto.innerHTML = "Cronómetro: " + segundos;

    if(segundos === 0){
        clearInterval(temporizador);
        ventana.close();
        segundos = 11;
    }

}