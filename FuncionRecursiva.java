/**Programa: Función recursiva. Calculo del Factorial de un número */
public class FuncionRecursiva {
    public static void main(String[] args) {
        int numero = 5;                             // Número al cual se desea calcular el factorial
        long resultado;                             // LONG es un tipo de datos para números enteros, es de mayor capacidad que el tipo INT

        resultado = factorialNumero(numero);        // Invocación de la Funcion 
        System.out.println(resultado);
    }

    public static long factorialNumero(long num){   // Función que calcula el factorial
        if(num>0){
            return num*factorialNumero(num-1);      // Invocación de la misma función
        }else{
            return 1;                               // Condicion de finalización de la recursividad. Entra aquí cuando n es zero.
        }
    }
}
