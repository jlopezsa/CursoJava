/**Programa: Ejemplo de Herencia y sobrecarga 
 * Este programa se utiliza para describir los dos conceptos Herencia y Sobrecarga (de métodos y constructores)
 */
package PersonaHerencia;

public class PersonaMain {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Raul", 56); // Objeto de la SUPERCLASE
        persona1.infoPersona();
        persona1.mensajesVarios();              // Ejemplo de sobrecarga del método mensajesVarios(). No se envian argumentos
        persona1.mensajesVarios(35);            // Ejemplo de sobrecarga del método mensajesVarios(). Se envia como argumento un entero
        persona1.mensajesVarios("Agosto");      // Ejemplo de sobrecarga del método mensajesVarios(). Se envia como argumento un String

        System.out.println("-------------------------");

        Estudiante estudiante_manhana = new Estudiante();       // Objeto de la Subclase
        estudiante_manhana.setNombre("Maria Camila");
        estudiante_manhana.setEdad(19);
        estudiante_manhana.setPre_grado("Ingenieria de Sistemas");
        estudiante_manhana.setSemestre(3);
        estudiante_manhana.infoPersona();
        estudiante_manhana.infoEstudiante();

        Empleado empleado_nocturno = new Empleado("Medico");    // Objeto de la Subclase
        empleado_nocturno.setNombre("Fernando");
        empleado_nocturno.setEdad(46);
        empleado_nocturno.infoPersona();
        empleado_nocturno.infoEmpleado();
    }   
}