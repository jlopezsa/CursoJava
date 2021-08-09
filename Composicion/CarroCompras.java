/**Clase CarroCompras
 * Ejemplo de clase con COMPOSICION a la clase Producto
 * Multiplicidad: Uno   para  0 o muchos
 * CarroCompras 1 --------------- 0..* Producto
 */
package Composicion;

import java.util.ArrayList;
public class CarroCompras {
    // Atributos
    private int id;
    private ArrayList<Producto> listaCarro; // Atributo de ArrayList y tipo Producto. Aquí solamente se reserva un espacio en memória de la lista

    // Metodos
    public CarroCompras(){                          // Constructor sin parametros iniciales
        listaCarro = new ArrayList<Producto>();     // IMPORTANTE!!! En una COMPOSICIÓN debemos crear dentro del constructor de la clase el objeto de tipo Producto (en este caso crear el ArrayList) que va a almacenar los objetos de tipo Producto.  
    }

    public CarroCompras(int id){                    // Constructor con parametros iniciales
        this.id = id;
        listaCarro = new ArrayList<Producto>();     // IMPORTANTE!!! Aquín dentro del constructor de la Clase se debe crear el objeto de tipo ArrayList<Producto>
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void adicionaProducto(Producto nuevoProducto){   // Método que adiciona un objeto de tipo Producto a la lista creada
        listaCarro.add(nuevoProducto);                      // Adiciona el producto
    }

    public void muestraInfoCarro(){                         // Metodo utilizado únicamente para imprimir los valores de los atributos en consola.
        System.out.println("El carro tiene id " + id +" y los siguientes productos: ");
        for (int i = 0; i < listaCarro.size(); i++) {
            System.out.println(listaCarro.get(i).getNombre() +" de valor "+ listaCarro.get(i).getValor());
        }
    }
}
