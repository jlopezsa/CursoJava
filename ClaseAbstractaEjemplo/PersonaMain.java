/**Programa: Ejemplo de Clase Abstracta 
 */
package ClaseAbstractaEjemplo;

import java.util.ArrayList;

public class PersonaMain {
    public static void main(String[] args) {
        
        //Persona persona1 = new Persona("Raul", 56);             // Objeto de la SUPERCLASE
        //persona1.infoPersona();
        //persona1.guardarImplementos();

        Estudiante estudiante_manhana = new Estudiante();       // Objeto de la Subclase
        estudiante_manhana.setNombre("Maria Camila");
        estudiante_manhana.setEdad(19);
        estudiante_manhana.setPre_grado("Ingenieria de Sistemas");
        estudiante_manhana.setSemestre(3);
        estudiante_manhana.infoEstudiante();
        estudiante_manhana.guardarImplementos();

        Empleado empleado_nocturno = new Empleado("Medico");    // Objeto de la Subclase
        empleado_nocturno.setNombre("Fernando");
        empleado_nocturno.setEdad(46);
        empleado_nocturno.infoEmpleado();
        empleado_nocturno.guardarImplementos();

        //Persona nueva_persona = new Persona();
        
        ArrayList<Persona> lista_personas = new ArrayList<Persona>();   // Ejemplo de lista de tipo Persona utilizada para almacenar 


        lista_personas.add(empleado_nocturno);  // Adicionando objetos a la lista
        lista_personas.add(estudiante_manhana);
        

        System.out.println("--------------------------------");

        for (int i = 0; i < lista_personas.size(); i++) {   // Invocando el método guardarImplementos() de los objetos de la lista 
            lista_personas.get(i).guardarImplementos();     // con el método get(i) buscamos el objeto en la lista (en la posición i)
        }
    }   
}