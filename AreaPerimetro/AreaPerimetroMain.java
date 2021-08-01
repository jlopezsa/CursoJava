/**Prorama: Calcula la área y perímetro de un rectángulo 
 * Objetivos:
 * 1- Crear una clase Rectanulo que implemente los métodos para calcula la área y el perímetro de un rectángulo
 * 2- Solicitar al usuário que ingrese los valores da base y altura para realizar los cálculos.
 * 3- En los métodos setBase y setAltura implementar una lóica para permitir valores reales en el rango (0,20)
*/
package AreaPerimetro;
import java.util.Scanner;

public class AreaPerimetroMain {
    public static void main(String[] args) {
        Scanner datoConsola = new Scanner(System.in);           // Creando el objeto datoConsola

        Rectangulo rec1;                                        // Reservando un espacio en memória para almacenar el objeto rec1 de la clase Rectangulo
        rec1 = new Rectangulo();                                // Creando el objeto, inicializando el objeto

        System.out.print("Digite base: ");
        double num_base;                                        // Variable que almacenará el número que ingrese el usuario.
        num_base = datoConsola.nextDouble();                    // Metodo nextDouble() para capturar el dato ingresado por consola
        rec1.setBase(num_base);                                 // Usando el método setBase para atribuir un valor al atributo base de la clase Rectangulo. La variable num_base se envia como argumento

        System.out.print("Digite altura: ");
        rec1.setAltura(datoConsola.nextDouble());               // Usando el método setAltura para atribuir un valor al atributo altura de la clase Rectangulo. El arumento de la funcíon es directamente el método nextDouble()

        System.out.println("La area del rectangulo es: " + rec1.calculaArea()); // Usando el método calculaArea() para calcular la área y se imprime directamente ese valor en consola
        System.out.println("El perimetro del rectangulo es: " + rec1.calculaPerimetro()); // Usando el método calculaPerimetro() para calcular el perímetro y se imprime directamente ese valor en consola

        datoConsola.close();                                    // Cerrando el Scanner.
    }
}
