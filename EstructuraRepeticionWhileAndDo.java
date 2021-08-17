/**Programa: Estructuras de repetición WHILE y DO...WHILE 
 * NOTA: Cada estructura está dentro de un bloque de comentários /*...*/
/*       Para ver el funcionamiento de una de ellas, por favor borre el comentário del bloque que desea ensayar.
 * Objetivo:
 * 1 - Aprender el funcionamiento de las estructuras de repetición WHILE y DO...WHILE
 * 2 - Diferenciar entre una estructura de repetición controlada por contador y controlada por usuario.
*/

import java.util.Scanner;

public class EstructuraRepeticionWhileAndDo {
    public static void main(String[] ars) {

        Scanner datoConsola = new Scanner(System.in);   // Scanne utilizado para "repetición controlada por usuário"
        
        /*
        System.out.println("Ejemplo de WHILE controlado por contador");
        int contador = 0;                           // La variable debe ser iniciada para que sea aceptada por la <condición> del WHILE
        while(contador < 10){                       // Ejemplo de WHILE controlado por contador
            System.out.println("Repeticion numero: "+contador);
            contador++;                              // Modificador de la <condición>
        }
        */

        
        
        
        System.out.println("Ejemplo de WHILE controlado por USUARIO");
        int opcion = 0;
        while(opcion != 55){                        // Ejemplo de WHILE controlado por agente externo (Usuario)
            System.out.print("Ingrese cualquier dato (55 para finalizar): ");
            opcion = datoConsola.nextInt();         // Modificador de la <condición>
        };
        



        /*
        System.out.println("Ejemplo de DO controlado por USUARIO");
        int opcion;
        do{
            System.out.print("Ingrese cualquier dato (55 para finalizar): ");
            opcion = datoConsola.nextInt();         // Modificador de la <condición>
        }while(opcion != 55);                       // Condición, mientras la condición sea verdadera la estructura se repetirá
        */



        /*
        System.out.println("Ejemplo de DO controlado por USUARIO");
        int opcion2;
        do{
            System.out.println("Menu de ingredientes:");    // Meno en consola que muestras las opciones posibles que el usuario puede ingresar.
            System.out.println("1 - cebolla ");
            System.out.println("2 - pepino ");
            System.out.println("3 - tomate ");
            System.out.println("4 - Finalizar menu ");
            System.out.print("Seleccione ingrediente: ");
            opcion2 = datoConsola.nextInt();         // Modificador de la <condición>  
        }while(opcion2 != 4);
        */


        System.out.println("... Fin del programa ...");

        datoConsola.close();
    }
}