/**Programa: División entre dos números enteros
 * Los objetivos del programa son:
 * 1- Entrar datos por la consola, procesarlos e imprimir el resultado por la consola.
 * 2- Mostrar como la division de dos números enteros (int) da como resultado la parte entera unicamente
 * 3- Realizar cambio de tipos de datos (int para double) usando Typecasting. De esa forma se muestra el resultado de la division en números Reales
 * 4- Ver como se finaliza el programa abruptamente cuando sucede una Excepción de división por 0 (usuario ingresa 0 para el denominador)
 */
import java.util.Scanner;

public class EjerDivEnteros {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        int numerador;
        int denominador;
        int resultado;
        double resultadoReal;   

        System.out.print("Ingrese numerador: ");
        numerador = datoConsola.nextInt();          // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.
        System.out.print("Ingrese denominador: ");
        denominador = datoConsola.nextInt();        // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.

        resultado = numerador/denominador;          // División entre dos números enteros. Como resultado es de tipo int entonces la division mostrará unicamente la parte entera

        System.out.print("La division entre "+ numerador + " y " + denominador + " es " + resultado + " (solo muestra la parte entera)\n");

        resultadoReal = (double) numerador/denominador; // typecasting: (double) realiza la conversion de numerador y denominador para double y el resultado de la división es guardado en una variable tipo double

        System.out.print("La division entre "+ numerador + " y " + denominador + " es " + resultadoReal + " (muestra el resultado real de la division)\n");

        System.out.println("... Fin del programa ...");

        datoConsola.close();                        // Función que cierra el Scanner
    }
}
