package HerenciaPersona;

public class PersonansHerencia {
    public static void main(String[] args) {

        Persona persona = new Persona();

        Estudiante universitario = new Estudiante();
        universitario.setNombre("Mario Gonzales");
        universitario.setEdad(22);
        universitario.setCarrera("Ingenieria de Sistemas");
        universitario.muestraInfoEstudiante();
        
    }
    
}
