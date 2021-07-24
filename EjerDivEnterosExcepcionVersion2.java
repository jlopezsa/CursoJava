/**Programa: Version 2 del tratamiento de Excepciones en la división entre dos números enteros
 * Los objetivos del programa son:
 * 1- Tratamiento de excepciones cuando el el denominador es 0
 * 2- Evitar que el programa finalice abruptamente cuando es identificada una excepción.
 * 3- A diferencia del prorama EjerDivEnterosExcepcion.java, en esta versión el metodo que imprime el resultado en la consola se pone dentro del TRY. 
 */
import java.util.Scanner;

public class EjerDivEnterosExcepcionVersion2 {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        int numerador;                              // Declaración de variable numerador como tipo int. Guarda dato ingresado por usuario
        int denominador;                            // Declaración de variable numerador como tipo int. Guarda dato ingresado por usuario
        int resultado;                              // Declaración de variable numerador como tipo int. Guarda resultado de la división

        System.out.print("Ingrese numerador: ");
        numerador = datoConsola.nextInt();          // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.
        System.out.print("Ingrese denominador: ");
        denominador = datoConsola.nextInt();        // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.

        try{                                        // Estructura para tratamiento de excepciones
            resultado = numerador/denominador;      // Como resultado es de tipo int entonces la division mostrará unicamente la parte entera. 
            System.out.print("La division entre "+ numerador + " y " + denominador + " es " + resultado + " (solo muestra la parte entera)\n");
        }catch(ArithmeticException err){            // Entra al CATCH solamente si fué identificada una Excepción. 
            System.out.println("Error " + err.getMessage());    // Imprime un mensaje de error. getMessage() es una funcíon de la excepción "ArithmeticException"
            System.out.println("No puede completarse la division");
        }           

        System.out.println("... Fin del programa ...");

        datoConsola.close();                        // Función que cierra el Scanner
    }
}
