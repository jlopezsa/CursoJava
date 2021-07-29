/**Programa: Template para implementar el programa de la calculadora
 * En este ejemplo se muestra el ignreso de datos por medio de la consola de la siguiente forma:
 * 1- Se crea un Scanner dentro de una función específica
 * 2- Se crea un Scanner en la función MAIN()
  */
import java.util.Scanner;

public class CalculadoraDosNumeros {
    public static void main(String[] args) {

        int res = capturaOpcion();                          // Ejemplo de función que captura una numero entero del usuario. Esta función crea un Scanner internamente
        System.out.println(res);


        Scanner numeroConsola = new Scanner(System.in);     // Scanner implementado en la función MAIN(). Luego se pasa como parametros en las funciones.
        
        // Solo se deben solicitar los operadores si la opción ingresada por el usuario es válida.
        // Implemetar la lógica para eso ...
        double operador1 = numeroUsuario(numeroConsola);    // Ejemplo de función que captura un operador (numero) del usuario. El Scanner se crea en main() y se pasa como argumento
                                                            // En este caso es importante cerrar el Scanner al final del programa, es decir adicionar numeroConsola.close();
        System.out.println("Operador: " + operador1);

        double operador2 = numeroUsuario(numeroConsola);    

        System.out.println("Operador: " + operador2);

        //----------------------------------------------------
        
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
        numeroConsola.close();                              // metodo que cierra el Scanner numeroConsola()
    }

    public static double numeroUsuario(Scanner numCos){
        double operador;                                    // variable que capturará el número ingresado por el usuario
        System.out.print("Digite un operador: ");
        operador = numCos.nextDouble();                     // atribuye valor a la variable operador
        return operador;                                    // retorno de la función
    }

    public static int capturaOpcion(){                          // Función para capturar la opción del usuario. Usa un Scanner interno
        Scanner datoConsola = new Scanner(System.in);           // Crea el scanner dentro de la función
        int opcion;
        System.out.print("Digite opcion: ");
        try {
            opcion = datoConsola.nextInt();
            if(opcion>0 && opcion<7){
                return opcion;
            }else{
                return 0;
            }  
        } catch (Exception e) {
            System.out .println("ERROR, usted no digito un numero entero");
            datoConsola.next();                                 // Es necesário adicionar este método del Scanner para borrar la entrada no válida de scanner.
            return 0;
        }
    }    
}
