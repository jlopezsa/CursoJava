/**Programa: Ejemplo de Polimorfismo 
 * El método guardarImplementos() es un ejemplo de polimorfismo.
 * El método guardarImplementos() está tando en la SUPERCLASE como en las Subclases, solo que cada Subclase lo sobreescribe de la forma que es necesária en cada clase.
 */
package PolimorfismoSobreescritura;

import java.util.ArrayList;

public class PersonaMain {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Raul", 56);             // Objeto de la SUPERCLASE
        persona1.infoPersona();
        persona1.guardarImplementos();

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

        ArrayList<Persona> lista_personas = new ArrayList<Persona>();   // Ejemplo de lista de tipo Persona utilizada para almacenar cualcuquier objeto creados de la herencia

        lista_personas.add(empleado_nocturno);  // Adicionando objetos a la lista
        lista_personas.add(persona1);
        lista_personas.add(estudiante_manhana);
        

        System.out.println("--------------------------------");

        for (int i = 0; i < lista_personas.size(); i++) {   // Invocando el método guardarImplementos() de los objetos de la lista 
            lista_personas.get(i).guardarImplementos();     // con el método get(i) buscamos el objeto en la lista (en la posición i)
        }

        System.out.println(lista_personas.size());

        /* Ejemplo de como recorrer una lista al reves
        for (int i = lista_personas.size()-1; i >= 0; i--) {
            lista_personas.get(i).guardarImplementos();
        }
        */
    }   
}