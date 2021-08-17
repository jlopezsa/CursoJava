/**Prorama: Ejemplo de Clase con Constructor 
 * 
*/
package ClienteConConstructor;
import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {

        Scanner datoConsola = new Scanner(System.in);

        Cliente persona = new Cliente();       // Creando un objeto con constructor, pero sin arumentos
        
        // Imprimiendo en consola para ver valores por defecto
        System.out.println("La persona " + persona.getNombre() +
                                        " de edad "+ persona.getEdad() + " anhos, " +
                                        "es mayor de edad? " + persona.isMayorEdad());

        Cliente personaNueva = new Cliente("Julian",20,true);    // Creando el objeto con Constructor y argumentos

        personaNueva.consultaMayor();   // Consultamos si la persona es mayor de edad. Este método actualiza el valor del atributo mayor_edad
        // Imprimimos en consola los atributos del objeto personaNueva
        System.out.println("La persona " + personaNueva.getNombre() +
                        " de edad "+ personaNueva.getEdad() + " anhos, " +
                        "es mayor de edad? " + personaNueva.isMayorEdad());

        System.out.println("-------Entrando datos por cosola.-----");
        System.out.print("Digite nombre: ");
        String nom = datoConsola.nextLine();
        personaNueva.setNombre(nom);
        System.out.print("Digite Edad: ");
        personaNueva.setEdad(datoConsola.nextInt());
        personaNueva.consultaMayor();
        System.out.println("La persona " + personaNueva.getNombre() +
                        " de edad "+ personaNueva.getEdad() + " anhos, " +
                        "es mayor de edad? " + personaNueva.isMayorEdad());

        datoConsola.close();
        System.out.println("Fin programa.");
    }
    
}
