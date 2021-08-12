/**Clase: Persona
 * Es una SUPERCLASE
 * 
 */
package PolimorfismoSobreescritura;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(){
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
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

    public void guardarImplementos(){               // Método que va a ser sobreescrito (Polimorfismo)
        System.out.println("Cuidado, las personans deben guardar sus implementos!");
        //
        //
        //
    }
}
