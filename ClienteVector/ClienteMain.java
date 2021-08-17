/**Prorama: Ejemplo vector de objetos
 * 1- Formas de crear un vector de objetos.
 * Cada posición del vector es un objeto de la clase respectiva,
 * en el ejemplo, de la clase Cliente
 * 2- Forma de utilizar una clase que utiliza dos Constructores, uno sin arumentos y otro con argumentos.
*/
package ClienteVector;
//import java.util.Scanner;

public class ClienteMain {
    public static void main(String[] args) {

        //Scanner datoConsola = new Scanner(System.in);

        Cliente vectorCliente[] = new Cliente[4];               // Crea el vector de tipo Cliente.


        for (int i = 0; i < vectorCliente.length; i++) {
            vectorCliente[i] = new Cliente();                   // Crea el objeto en cada posición del vector
        }

        vectorCliente[0].setNombre("Carlos");                   // Modificando el atributo nombre del objeto en la posición 0
        vectorCliente[0].setEdad(26);                           // Modificando el atributo edad del objeto en la posición 0
        vectorCliente[0].consultaMayor();                       // Invocando el método para verficar si la persona es mayor o menor de edad

        vectorCliente[1].setNombre("Marcela");                  // Repitiendo el procedimeinto de forma manual
        vectorCliente[1].setEdad(16);
        vectorCliente[1].consultaMayor();

        vectorCliente[2].setNombre("Hector");
        vectorCliente[2].setEdad(45);
        vectorCliente[2].consultaMayor();
                                                                // Los atributos del vector en la posición [3] no se modificaron para ver cuales son sus valores por defecto

        for (int i = 0; i < vectorCliente.length; i++) {        // Imprimiendo los atributos de los objetos del vector
            System.out.println("La persona " + vectorCliente[i].getNombre() +
                        " de edad "+ vectorCliente[i].getEdad() + " anhos, " +
                        "es mayor de edad? " + vectorCliente[i].isMayorEdad());
        }


        System.out.println("---Vector con constructor(atributos)---");  // Iniciando el ejemplo de como crear objetos con Constructor(atributos)


        Cliente cliente[] = {new Cliente("Jaime",45,false),     // Vector de objetos con valores iniciales
                            new Cliente("Armando",17,false), 
                            new Cliente("Raul",12,false)};

        for (int i = 0; i < cliente.length; i++) {              // Ciclo de repetición para imprimir los valores de los atributos en consola
            cliente[i].consultaMayor();                         // Invocando al método que calcula si la persona es mayor de edad.
            System.out.println("La persona " + cliente[i].getNombre() +
                        " de edad "+ cliente[i].getEdad() + " anhos, " +
                        "es mayor de edad? " + cliente[i].isMayorEdad());
        }

        Cliente variosClientes[] = new Cliente[50];             // Creando un vector de objetos, en el cual se almacenarán 50 objetos de tipo Cliente

        for (int i = 0; i < variosClientes.length; i++) {
            variosClientes[i] = new Cliente();                  // Creando los objetos con un Constructor sin argumentos.
        }

        System.out.println("Fin programa.");
    }
}