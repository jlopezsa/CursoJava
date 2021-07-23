/**Programa: División entre dos números enteros que se ingresan por Ventana
 * Los objetivos del programa son:
 * 1- Entrar datos por ventana, procesarlos e imprimir el resultado por la consola.
 * 2- Realizar la conversión de String (dato ingresado por la ventana) a double.
 * 3- Realizar la división entre números double.
 */
import javax.swing.* ;

public class EjerDivEnterosVentana {
    public static void main(String[] args){

        //String mensaje = "Ingrese un número";   
        String numeradorString;                                                         // Creando variable para almazenar los datos del usuário  
        String denominadorString;                                                       // Creando variable para almazenar los datos del usuário 
        double resultado;                                                               // Variable double que guarda el resultado de la división
        double numeradorReal;                                                           // Creando variable tipo double para convertir un String a double.
        double denominadorReal;                                                         // Creando variable tipo double para convertir un String a double.

        numeradorString = JOptionPane.showInputDialog(null,"Ingrese numerador");        // Metodo que: 1) imprime el mensaje en la ventana, y 2) almazena el dato del usuario en una variable String 
        denominadorString = JOptionPane.showInputDialog(null,"Ingrese denominador");    // Metodo que: 1) imprime el mensaje en la ventana, y 2) almazena el dato del usuario en una variable String 
        
        numeradorReal = Double.parseDouble(numeradorString);                            // Realizando el cambio de String para double
        denominadorReal = Double.parseDouble(denominadorString);                        // Realizando el cambio de String para double

        resultado = numeradorReal/denominadorReal;
        
        System.out.print("La division entre "+ numeradorString + " y " + denominadorString + " es " + resultado + " (muestra el resultado real de la division)\n");
        

        System.out.println("... Fin del programa ...");
    }
}
