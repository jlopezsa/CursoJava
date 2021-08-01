/**Prorama: Calcula la área y el perímetro de un rectángulo.
 * Objetivos:
 * 1- Crear un VECTOR de objetos
 * 2- Usar el método constructor para familiarizar con este recurso.
 * 3- Usar estructura de repeticion para crear varios objetos que son almacenados en un vector.
*/

package AreaPerimetroVectorObjetos;
import java.util.Scanner;
public class AreaPerimetroMain {
    public static void main(String[] args) {

        Scanner datoConsola = new Scanner(System.in);       // Creando el objeto datoConsola

        //[[[[[[[[[[[[[[  Vector de objetos paso a paso (Sin estructura de repetición)  ]]]]]]]]]]]]]]
        Rectangulo vec_rectangulos[] = new Rectangulo[3];   // Creando un vector de 3 elementos. Este vector almacenará los objetos creados de la clase Rectangulo
        vec_rectangulos[0] = new Rectangulo(0, 0);          // Creando el objeto en la posición [0] del vector. Los atributos del objeto son inicializados con 0 y 0
        vec_rectangulos[1] = new Rectangulo(3, 2);          // Creando el objeto en la posición [1] del vector. Los atributos del objeto son inicializados con 3 y 2
        vec_rectangulos[2] = new Rectangulo(5, 8);          // Creando el objeto en la posición [2] del vector. Los atributos del objeto son inicializados con 5 y 8
        
        // ---- Mostrando en consola los valores iniciales
        System.out.print("Los valores iniciales de base y altura para el objeto en la posicion "+ 0 +" son: ");
        System.out.println(vec_rectangulos[0].getBase() +" y "+vec_rectangulos[0].getAltura()); // Mensaje que muestra los valores inicializados del objeto en la posición 0 
        
        System.out.print("Los valores iniciales de base y altura para el objeto en la posicion "+ 1 +" son: ");
        System.out.println(vec_rectangulos[1].getBase() +" y "+vec_rectangulos[1].getAltura()); // Mensaje que muestra los valores inicializados del objeto en la posición 1

        System.out.print("Los valores iniciales de base y altura para el objeto en la posicion "+ 2 +" son: ");
        System.out.println(vec_rectangulos[2].getBase() +" y "+vec_rectangulos[2].getAltura()); // Mensaje que muestra los valores inicializados del objeto en la posición 2

        // ---- Cálculo de área y perímetro para los valores iniciales configurados
        System.out.println("La area y el perimetro del objeto "+ 0 +" es: "+ vec_rectangulos[0].calculaArea() +" y "+ vec_rectangulos[0].calculaPerimetro());
        System.out.println("La area y el perimetro del objeto "+ 1 +" es: "+ vec_rectangulos[1].calculaArea() +" y "+ vec_rectangulos[1].calculaPerimetro());
        System.out.println("La area y el perimetro del objeto "+ 2 +" es: "+ vec_rectangulos[2].calculaArea() +" y "+ vec_rectangulos[2].calculaPerimetro());


        //[[[[[[[[[[[[[[  Vector de objetos con estructura de repeticion y usuario ingresando parametros  ]]]]]]]]]]]]]]

        System.out.println("-------------------------");
        System.out.println("--- Ejemplo de vector de objetos y datos BASE y ALTURA ingresados por el usuario");

        Rectangulo vec_rec[] = new Rectangulo[3];           // Creando un vector de 3 elementos. Este vector almacenará los objetos creados de la clase Rectangulo

        for(int i = 0; i<vec_rec.length;i++){
            vec_rec[i] = new Rectangulo(0, 0);              // Creando el objeto en la posición [i] del vector. Los atributos de todos los objetos son inicializados con 0 y 0
            System.out.print("Digite base: ");              // Solicitando al usuario ingresar datos para metodo base
            vec_rec[i].setBase(datoConsola.nextDouble());   // El valor ingresado por el usuario es enviado en el argumento del método setBase
            System.out.print("Digite altura: ");            // Solicitando al usuario ingresar datos para metodo altura
            vec_rec[i].setAltura(datoConsola.nextDouble()); // El valor ingresado por el usuario es enviado en el argumento del método setArea
            System.out.println("La area y el perimetro del objeto "+ i +" es: "+ vec_rec[i].calculaArea() +" y "+ vec_rec[i].calculaPerimetro());
        }

        datoConsola.close();    // Cerrando scanner
    }
}
