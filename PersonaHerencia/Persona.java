/**Clase: Persona
 * Es una SUPERCLASE
 * Al final de los métodos se muestra un ejemplo de Sobrecarga de un método
 */
package PersonaHerencia;

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

    // Sobrecarga
    //
    public void mensajesVarios(){
        System.out.println("Metodo sin argumentos");
    }
    public void mensajesVarios(String mensaje){
        System.out.println("Metodo con argumento String: " + mensaje);
    }
    public void mensajesVarios(int valor){
        System.out.println("Metodo con argumento entero: " +valor);
    }
    
}
