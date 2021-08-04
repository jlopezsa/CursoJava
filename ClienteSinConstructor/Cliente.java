package ClienteSinConstructor;

public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private boolean mayor_edad;
    
    // Metodos
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
