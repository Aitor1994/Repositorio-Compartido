/*Crear una función flecha que escriba por pantalla el factorial de un número. El programa debe solicitar al
usuario un número mayor o igual que cero. Comprobar que el número es válido.
Ejemplo: factorial(5) devuelve 120.*/

let factorial = (n) => {
    let valor = 1;

    for (let i = 1; i <= n; i++) {
        valor *= i;
    }

    return valor;
};

console.log(factorial(5));