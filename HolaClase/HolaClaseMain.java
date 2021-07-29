/**Programa: Primer programa en el cual creamos una clase y la instanciamos cuando creamos un objeto
 * Objetivos: 
 * 1 - Crear una primera clase
 * 2 - Instanciar la clase desde el núcleo del prorama, es decir, desde el método MAIN
 * 3 - Accesar a los atributos de la clase, ya sea para atribuirles un valor o consultar su contenido 
 */
package HolaClase;
public class HolaClaseMain {
    public static void main(String[] args) {

        GalletasPersona galletaAlien = new GalletasPersona();   // Reservando espacion en memória e instanciando la clase (creando un objeto)
        System.out.println(galletaAlien.getNombre());           // Capturando el atributo privado "nombre" por medio del método público "getNombre".
                                                                // Acá mismo estamos imprimiendo el "nombre" para mostrar que está vacio (null)

        galletaAlien.setNombre("Alien");                        // Usando el método público "setNombre" para atribuir un valor al atributo "nombre"

        System.out.println(galletaAlien.getNombre());           // Capturando el atributo privado "nombre" por medio del método público "getNombre".
                                                                // Imprimiendo el atributo "nombre"
    }
    
}
