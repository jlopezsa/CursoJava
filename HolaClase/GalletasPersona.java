/** Clase cuyo nombre es GalletasPersona 
 * 
*/
package HolaClase;
public class GalletasPersona {                  // Nombre de la Clase
    //-------- Atributos ------------------
    private String nombre;                      // Atributo privado tipo String. Los atributos privados puden ser accesados únicamente por medio de los métodos.
    private int precio;
    private float peso;
    private boolean disponibilidad;
    //--------- Metodos -------------------
    public void setNombre(String nombre) {      // Método para poder accesar al atributo "nombre" y atribuirle un valor. 
        this.nombre = nombre;                   // Usamos THIS porque el arumento de la funcion es igual al atributo de la clase, es decir "nombre"
    }
    public String getNombre(){                  // Método que retorna el contenido del atributo "nombre". 
        return nombre;
    }
}
