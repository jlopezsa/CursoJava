/**Programa: Ejemplo de Interface
 */
package InterfaceEjemplo;

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
        empleado_nocturno.imprimeDescuento();

    }
}