/**Clase: Estudiante
 * Clase derivada de la SUPERCLASE Persona
 */
package ClaseAbstractaEjemplo;

public class Estudiante extends Persona{
    private String pre_grado;
    private int semestre;

    public Estudiante() {   
    }
    public Estudiante(String pre_grado, int semestre){
        this.pre_grado = pre_grado;
        this.semestre = semestre;
    }

    public void setPre_grado(String pre_grado) {
        this.pre_grado = pre_grado;
    }
    public String getPre_grado() {
        return pre_grado;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public int getSemestre() {
        return semestre;
    }
    public void infoEstudiante(){
        System.out.println("El estudiante "+ this.getNombre()+" tiene "+ this.getEdad()+
                            " años " + " y cursa el pre-grado de "+pre_grado + 
                            " en el semestre " + semestre);
    }

    public void guardarImplementos(){               // Método sobreescrito (Polimorfismo)
        System.out.println("Estudiantes, guardar sus implementos en los casilleros!");
        //
        //
    }

}
