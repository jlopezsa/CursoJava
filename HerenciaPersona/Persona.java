package HerenciaPersona;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;

    // Constructores
    public Persona(){
        
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void infoPersona(){
        System.out.println("La persona " + nombre + " tiene " + edad + " años.");
    }

    // Uno o más métodos abstractos

    public void guardarImplementos(){               // Método que va a ser sobreescrito (Polimorfismo)
        System.out.println("Cuidado, las personans deben guardar sus implementos!");
        //
        //
        //
    }
}
