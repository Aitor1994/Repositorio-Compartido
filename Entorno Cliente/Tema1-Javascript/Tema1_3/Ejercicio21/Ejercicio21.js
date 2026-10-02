/*Botón que abre dos ventanas: ventana1.html y ventana2.html, ambas de 300x200. La ventana1 en
la posición 100,300 y la ventana2 en la posición 500,300
◦ Botón que cierra las dos ventanas
◦ Botón para cambiar el fondo de la primera ventana a:#FFECA1
◦ Botón para cambiar el fondo de la segunda ventana a:#EFC3CA*/

//PARA ESTE EJERCICIO LAS VARIABLES HAN DE SER DECLARADAS CON *VAR YA QUE SINO NO SE TIENE LA PROPIEDAD WINDOW Y NO PODREMOS
//ACCEDER DE LA VENTANA 1 (HIJA) A LA VENTANA 2 (HIJA).
//INTENTAR USAR VAR PARA LAS VARIABLES A NOSER QUE SEAN PARA COSAS MUY ESPECIFICAS...
var ventana1;
var ventana2;


function abrirVentanas(){
    
    ventana1 = window.open("Ventana1.html", "ventana1",width = 300, height = 200 , top = 100, left = 300);
    ventana2 = window.open("Ventana2.html", "ventana2",width = 300, height = 200 , top = 500, left = 300);
}

function cerrarVentanas(){
    ventana1.close();
    ventana2.close();
}

function cambiarColor1(){
    ventana1.document.body.style.backgroundColor = "#FFECA1";
}

function cambiarColor2(){
    ventana2.document.body.style.backgroundColor = "#EFC3CA";
}

//USAMOS OPENER PARA LLEGAR AL PADRE INDEX Y DE AHI ACCEDER A VENTANA A LA HIJA VENTANA 2.
function enviarMensaje(){
    window.opener.ventana2.document.body.innerHTML += "<p>La ventana 1 te saluda.</p>";
}

function cambiarColor3(){
    window.opener.ventana2.document.body.style.backgroundColor = "#7DDA58";
}

function enviarMensaje2(){
    window.opener.ventana1.document.body.innerHTML += "La ventana 2 te saluda.";
}

function cambiarColor4(){
    window.opener.ventana1.document.body.style.backgroundColor = "#5DE2E7";
}

