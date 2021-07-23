/**Programa: Tratamiento de Excepciones en la división entre dos números enteros
 * Los objetivos del programa son:
 * 1- Tratamiento de excepciones cuando el el denominador es 0
 * 2- Evitar que el programa finalice abruptamente cuando es identificada una excepción.
 */
import java.util.Scanner;

public class EjerDivEnterosExcepcion {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        int numerador;                              // Declaración de variable numerador como tipo int. Guarda dato ingresado por usuario
        int denominador;                            // Declaración de variable numerador como tipo int. Guarda dato ingresado por usuario
        int resultado;                              // Declaración de variable numerador como tipo int. Guarda resultado de la división
        boolean flagError = false;                  // Declaración de variable tipo Boolean (true or false). Sirve como señalización cuando es identificada una excepcion de división por 0

        System.out.print("Ingrese numerador: ");
        numerador = datoConsola.nextInt();          // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.
        System.out.print("Ingrese denominador: ");
        denominador = datoConsola.nextInt();        // Entrada de dato por consola. Se utiliza nextInt() porque deseamos recibir el dato de consola como un entero.

        try{                                        // Estructura para tratamiento de excepciones
            resultado = numerador/denominador;      // Como resultado es de tipo int entonces la division mostrará unicamente la parte entera. 
        }catch(ArithmeticException err){            // Entra al CATCH solamente si fué identificada una Excepción. 
            System.out.println("Error " + err.getMessage());    // Imprime un mensaje de error. getMessage() es una funcíon de la excepción "ArithmeticException"
            flagError = true;                       // Variable booleana que es verdadera (TRUE) indicando que hay un error
            resultado = 0;                          // Atribución de valor a resultado. Esto se pone ya que la división resultado = numerador/denominador; no fue completada
        }

        if(flagError)   // Si error es verdadero (falgError = true) se imprime el mensaje "No puede completarse la division"
            System.out.println("No puede completarse la division");
        else            // Si error es falso (flagError = false) se imprime el resultado
            System.out.print("La division entre "+ numerador + " y " + denominador + " es " + resultado + " (solo muestra la parte entera)\n");

        System.out.println("... Fin del programa ...");

        datoConsola.close();                        // Función que cierra el Scanner
    }
}
