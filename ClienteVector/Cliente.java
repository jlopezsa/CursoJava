package ClienteVector;

public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private boolean mayor_edad;
    
    // Metodos
    public Cliente(){           // Constructor con valores por defecto. Si creo 50 objetos, todos se crean cons esos valores
        //nombre = "";
        //edad = 0;
        //mayor_edad = false; 
    }
    // Constructor que inicializa los atributos del objeto con valores específicos. Cada vez que se crea un objeto puede ser inicializado con valores diferentes
    public Cliente(String nombre, int edad, boolean mayor_edad){    
        this.nombre = nombre;
        this.edad = edad;
        this.mayor_edad = mayor_edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMayorEdad(boolean mayor_edad){
        this.mayor_edad = mayor_edad;
    }

    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean isMayorEdad(){
        return mayor_edad;
    }

    public void consultaMayor(){
        if(edad >= 18)
            mayor_edad = true;
        else
            mayor_edad = false;
    }
}
