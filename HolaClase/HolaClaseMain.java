/**Programa: Primer programa en el cual creamos una clase y la instanciamos cuando creamos un objeto
 * Objetivos: 
 * 1 - Crear una primera clase
 * 2 - Instanciar la clase desde el núcleo del prorama, es decir, desde el método MAIN
 * 3 - Accesar a los atributos de la clase, ya sea para atribuirles un valor o consultar su contenido 
 */
package HolaClase;
public class HolaClaseMain {
    public static void main(String[] args) {

        GalletasPersona galletaSalada = new GalletasPersona();

        System.out.println(galletaSalada.getNombre());

        galletaSalada.setNombre("crocanteSalada");
        System.out.println( galletaSalada.getNombre() );

        galletaSalada.setValor(250);
        System.out.println( galletaSalada.getValor() );


        
        

    }

}
