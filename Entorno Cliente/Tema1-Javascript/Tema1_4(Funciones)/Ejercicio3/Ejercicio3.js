/*Escribir en una página web 500 números aleatorios del 1 al 10.000 y que al lado diga si es
par o no. Hacer una función flecha que dado un número devuelva “par” si es par o “impar” si es impar.*/

let aleatorio = () => {return parseInt(Math.random() * (10000)) + 1};

let par = (n) => {
    if(n%2 != 0){
    return "Impar";
    }else{
        return "par";
    };
    };

for(i = 0; i < 500; i++){
    let numerico = aleatorio();
    document.getElementById("numero").innerHTML += numerico + " " + par(numerico) + "<br>";
} 

