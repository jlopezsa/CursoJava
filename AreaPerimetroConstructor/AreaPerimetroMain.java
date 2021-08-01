/**Prorama: Calcula la área y el perímetro de un rectángulo. Se usa el método Constructor para ver como puede ser utilizado para inicializar los atributos
 * Objetivos:
 * 1- Crear una clase Rectanulo que implemente los métodos para calcula la área y el perímetro de un rectángulo
 * 2- Solicitar al usuário que ingrese los valores da base y altura para realizar los cálculos.
 * 3- En los métodos setBase y setAltura implementar una lóica para permitir valores reales en el rango (0,20)
 * 4- Ver uno de las aplicaciones de el método Constructor para inicializar los atributos de la Clase Rectangulo.
*/

package AreaPerimetroConstructor;
import java.util.Scanner;
public class AreaPerimetroMain {
    public static void main(String[] args) {

        Scanner datoConsola = new Scanner(System.in);   // Creando el objeto datoConsola

        System.out.println("-----------1er Objeto creado -------");
        Rectangulo rec1;                    // Reservando un espacio en memória para almacenar el objeto rec1 de la clase Rectangulo
        rec1 = new Rectangulo(0,0);         // Creando el objeto. Cuando se utiliza un método Constructor se deben enviar los argumentos para inicializar los atributos de la clase
        System.out.println("Los valores iniciales de base y altura son: "+ rec1.getBase() +" y "+rec1.getAltura()); // Mensaje que muestra los valores inicializados de los atributos
        System.out.println("Digite nuevos valores de base y altura.");
        System.out.print("Digite base: ");
        double num_base;
        num_base = datoConsola.nextDouble();    // Captura el valor real ingresado por el usuario en la variable num_usuario. Ese valor será atribuido al argumento base 
        rec1.setBase(num_base);                 // Envaindo la variable num_base como argumento para atribuir el valor al atributo
        System.out.print("Digite altura: ");
        rec1.setAltura(datoConsola.nextDouble()); // Enviando el valor que ingresa el usuario al método setAltura para atribuir un valor al atributo altura
        System.out.println("Los nuevos valores son: Base = " + rec1.getBase() + " y Altura ="+ rec1.getAltura()); // Imprimiendo los nuevos valores de los atributos del objeto rec1
        System.out.println("La area del rectangulo es: " + rec1.calculaArea());     // Imprimiendo el valor calculado por el método calculaArea
        System.out.println("El perimetro del rectangulo es: " + rec1.calculaPerimetro()); // Imprimiendo el valor calculado por el método calculaPerimetro

        //-- Creando un seundo objeto y realizando los mismos cálculos
        System.out.println("-----------2nd Objeto creado -------");

        Rectangulo rec2;       // Reservando un espacio en memória para almacenar el objeto rec2 de la clase Rectangulo. Nuevo objeto creado
        rec2 = new Rectangulo(3.6,6.8);     // Creando el objeto e inicializando los atributos base y altura con los valores de 3.6 y 6.8. Esto se hace con el método Constructor
        System.out.println("Los valores iniciales de base y altura son: "+ rec2.getBase() +" y "+rec2.getAltura());
        System.out.println("Digite nuevos valores de base y altura.");
        System.out.print("Digite base: ");
        double num_base2;
        num_base2 = datoConsola.nextDouble();
        rec2.setBase(num_base2);
        System.out.print("Digite altura: ");
        rec2.setAltura(datoConsola.nextDouble());
        System.out.println("Los nuevos valores son: Base = " + rec2.getBase() + " y Altura ="+ rec2.getAltura());
        System.out.println("La area del rectangulo es: " + rec2.calculaArea());
        System.out.println("El perimetro del rectangulo es: " + rec2.calculaPerimetro());

        datoConsola.close();

    }
}
