/**Programa: Template 2 para implementar el programa de la calculadora
 * Utiliza un único Scanner en la función main() y se envia como parametros a las funciones que 
 * realizan la captura de datos que el usuario ingresa por la consola.
 */
import java.util.Scanner;

public class CalculadoraDosNumerosV2 {
    public static void main(String[] args) {

        Scanner datoConsola = new Scanner(System.in);
        
        int res = capturaOpcion(datoConsola);               // Ejemplo de función que captura una numero entero del usuario. Esta función crea un Sscanner internamente
        System.out.println(res);

        
        double operador1 = numeroUsuario(datoConsola);      // Ejemplo de función que captura un operador (numero) del usuario. El Scanner se crea en main() y se pasa como argumento
                                                            // En este caso es importante cerrar el Scanner al final del programa, es decir adicionar numeroConsola.close();
        System.out.println("Operador: " + operador1);


        
        switch (res) {
            case 1:
                System.out.println("Suma");                 // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            case 2:
                System.out.println("Resta");                // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            case 3:
                System.out.println("Multiplicacion");       // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            case 4:
                System.out.println("Division");             // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            case 5:
                System.out.println("Resto");                // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            case 6:
                System.out.println("Salir");                // Mensaje opcional
                // invocar la función que realiza la suma
                break;
            default:            
                System.out.println("Opcion incorrecta");
                break;
        }
        datoConsola.close();                                // metodo que cierra el Scanner numeroConsola()
    }

    public static double numeroUsuario(Scanner numCos){
        double operador;                                    // variable que capturará el número ingresado por el usuario
        System.out.print("Digite un operador: ");
        operador = numCos.nextDouble();                     // atribuye valor a la variable operador
        return operador;                                    // retorno de la función

    }

    public static int capturaOpcion(Scanner consola){       // Función para capturar la opción del usuario. Usa un Scanner interno
        int opcion;
        System.out.print("Digite opcion: ");
        try {
            opcion = consola.nextInt();
            if(opcion>0 && opcion<7){
                return opcion;
            }else{
                return 0;
            }  
        } catch (Exception e) {
            System.out .println("ERROR, uted no digito un numero entero");
            consola.next();
            return 0;
        }
    }    
}
