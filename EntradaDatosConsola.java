/**Prorama ejemplo de entrada de datos
 * Solicita al usuário ingresar datos y luego los imprime en consola.
 */

import java.util.Scanner;                       // importando el paquete de la clase Scanner

public class EntradaDatosConsola {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);    // Creando un objeto in de la clase Scanner
        String textoUsuario;                    // Declarando una variable de tipo String
        System.out.print("Digite una frase: "); // Salida de datos para indicar lo que el usuário debe hacer
        textoUsuario = in.nextLine();           // Atribuyendo valor a la variable textoUsuario. Lo que el usuário digitá será almacenado en esa variable.
                                                // El método .nextLine() es utilizado cuando el valor introduzido es String.
        System.out.println("La frase que ingresa es: " + textoUsuario);
    }
}
