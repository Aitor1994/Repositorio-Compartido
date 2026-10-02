/* Como vamos a trabajar con ventanas, primero hemos de crear una variable donde la guardaremos con
el Objeto Window. */
let ventana;

function abrirVentana(){
    ventana = window.open("index_2.html","Abre ventana vacia.","height = 500, width = 500");
}

function moverVentana(){
    ventana.moveBy(200,100);
}

function moverVentana2(){
    ventana.moveTo(500, 200);
}

function aumentarTamaño(){
    ventana.resizeBy(100,100);
}
function tamañoFijo(){
    ventana.resizeTo(100,150);
}

function cambiarColor(){
    document.body.style.backgroundColor = "green";
}

function colorVentanaPadre(){
    //El opener es el que indica la ventana padre, lo que cambiemos cambiara en esa ventana.
    window.opener.document.body.style.backgroundColor = "red";
}

function cerrarVentanaHija(){
    ventana.close();
}

function cerrarVentana(){
    window.close();
}

function cerrarTodo(){
    window.close();
    window.opener.close();
}
/*Botón 1: pondrá el fondo de la ventana secundaria de color verde.
▪ Botón 2: pondrá el fondo de la ventana principal de color rojo.
▪ Botón 3. Cerrar la ventana segunda.html.
▪ Botón 4: cerrará la ventana secundaria y a continuación la ventana principa*/