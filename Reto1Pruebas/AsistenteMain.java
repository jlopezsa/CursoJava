/**Prorama: Template para implementar Reto1
 * 
 */
package Reto1Pruebas;

public class AsistenteMain {

    public static void main(String[] args) {

        Asistente persona1 = new Asistente(0, "Pedro", 14, "");
        Asistente persona2 = new Asistente(1, "Helena", 27, "");
        Asistente persona3 = new Asistente(2, "Selena", 30, "");

        Asistente vector_personas[] = new Asistente[3];

        vector_personas[0] = persona1;
        vector_personas[1] = persona2;
        vector_personas[2] = persona3;

        Asistente persona_prueba = new Asistente(); 

        vector_personas = persona_prueba.premioMayor(vector_personas);

        System.out.println("El asistente " + vector_personas[0].getId_asistente() +
                            " tiene acceso a el premio " + vector_personas[0].getPremio());
        
    }   
}
