/**Programa: Ejemplo de uso de una estructura IF anidada
 * En este menu se muestra una menu de 3 opciones y el usuario selecciona una de ellas.
 * 
 */
import java.util.Scanner;

public class EstructuraSeleccionAnidada {
    public static void main(String[] args) {
        Scanner datoConsola = new Scanner(System.in);
        
        int opcion;                                     //  Variable que almacena el dato que ingresa el usuario.

        System.out.println("Menu de ingredientes:");    // Meno en consola que muestras las opciones posibles que el usuario puede ingresar.
        System.out.println("1 - cebolla ");
        System.out.println("2 - pepino ");
        System.out.println("3 - tomate ");
        System.out.print("Seleccione ingrediente: ");
        opcion = datoConsola.nextInt();                 // opcion captura el número ingresado por el usuario.

        // Estructura de seleccion anidada
        if(opcion == 1){
            System.out.println("Perfecto!");
            System.out.println("Su opcion es cebolla");
        }
        else{
            if(opcion == 2){
                System.out.println("Perfecto!");
                System.out.println("Su opcion es pepino");
            }
            else{
                if(opcion == 3){
                    System.out.println("Perfecto!");
                    System.out.println("Su opcion es tomate");
                }
                else{
                    System.out.println("Que mal");
                    System.out.println("Su opcion no esta en el menu");
                }
            }
        }
        
        System.out.println("... Fin Programa ...");
        datoConsola.close();
    }
}
