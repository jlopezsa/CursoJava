package HerenciaPersona;

public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(){
    }
    public Estudiante(String carrera, int semestre){
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public int getSemestre() {
        return semestre;
    }

    public void muestraInfoEstudiante(){
        System.out.println("El estudiante " + getNombre() +" con edad "+ getEdad()+
                            " años está estudiando "+ carrera);
    }
}
