package RelacionAsociacion;
import java.util.ArrayList;
public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private ArrayList<Producto> lista_productos;
    
    // Metodos
    public Cliente(){           // Constructor con valores por defecto.
        lista_productos = new ArrayList<Producto>();
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }

    public void adicionaProducto(Producto nuevoProducto){
        lista_productos.add(nuevoProducto);
    }

    public void muestraDatos(){
        System.out.println("El cliente "+nombre+
                            " de "+edad+
                            " anhos tiene los siguientes productos: ");
        for (int i = 0; i < lista_productos.size(); i++) {
            String nombre_aux = lista_productos.get(i).getNombre();
            System.out.println(nombre_aux);
        }
    }
}