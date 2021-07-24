/**Prorama: Uso de la estructura de selección SWITCH...CASE
 * Objetivos:
 * 1- Usar la estructura de selección SWITCH ... CASE para mostrar en consola un menu de opciones
 * 
 */
import java.util.Scanner;
public class EstructuraSwitchCase {
    public static void main(String[] args) {
        Scanner datoConsola = new Scanner(System.in);
        
        int opcion;                                     //  Variable que almacena el dato que inresa el usuario.

        System.out.println("Menu de ingredientes:");    // Meno en consola que muestras las opciones posibles que el usuario puede ingresar.
        System.out.println("1 - cebolla ");
        System.out.println("2 - pepino ");
        System.out.println("3 - tomate ");
        System.out.print("Seleccione ingrediente: ");
        opcion = datoConsola.nextInt();                 // opcion captura el número ingresado por el usuario.

        switch(opcion){                                 // Estructura SWITCH
            case 1:                                     // Si opcion == 1 se ejecutan las líneas siguientes antes del break
                System.out.println("Perfecto!");
                System.out.println("Su opcion es cebolla");
                //...
                //...
                break;
            case 2:                                     // Si opcion == 2 se ejecutan las líneas siguientes antes del break
                System.out.println("Perfecto!");
                System.out.println("Su opcion es pepino");
                break;
            case 3:                                     // Si opcion == 3 se ejecutan las líneas siguientes antes del break
                System.out.println("Perfecto!");
                System.out.println("Su opcion es tomate");
                break;
            default:                                    // Opcion por defecto. Entra acá si el usuario ingresa un número entero y diferente de 1, 2 y 3.
                System.out.println("Que mal");
                System.out.println("Su opcion no esta en el menu");
                break;
        }

        System.out.println("... Fin programa ...");
        datoConsola.close();
    }
}
