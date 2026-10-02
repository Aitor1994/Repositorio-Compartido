/*. Crear una función que se llame cuadrado. Que reciba un parámetro y devuelva el cuadrado del número.
1. Con funciones tradicionales
2. Con función anónima
3. Con función flecha.
4. Invocar a las funciones con ejemplos*/

//1:
function cuadrado(n){
    return n**2
}
console.log(cuadrado(2));

//2:
let cuadrado2 = function cuadrado(n){return n**2};
console.log(cuadrado2(3));
//3:
let cuadrado3 = (n)=>{return n**2};

console.log(cuadrado3(4));