/**Programa: Tratamiento de excepción en la entrada de datos
 * Objetivos:
 * 1- Solicitar al usuario un número INT
 * 2- Detectar excepcion si el usuario ingresa un número real o un caracter como letras.
 */
import java.util.Scanner;
import java.util.InputMismatchException;    // Paquete que trata la excepcion de entrada de datos "InputMismatchException"

public class ExcepcionEntradaDatos {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);       // Creación del scanner
        int datoUsuario;                                    // Variable que guarda el dato ingresado por el usuario
        System.out.println("Ingrese un numero entero: ");   
        try{                                                // Tratamiento de excepción
            datoUsuario = datoConsola.nextInt();            // Captura el dato ingresado por el usuario
            System.out.println("Su numero ingresado es: " + datoUsuario);   // Mensaje de salida en la consola         
        }catch(InputMismatchException errorEntrada){        // Entra aquí si y solamente si la excepción es detectada. El tipo de error es InputMismatchException
            System.out.println("Su dato ingresado no es un entero: " + errorEntrada.getMessage()); // Mensaje de salida en la consola indicando el tipo de error.
        }
        System.out.println("... Fin del programa ...");    
        datoConsola.close();
    }
}