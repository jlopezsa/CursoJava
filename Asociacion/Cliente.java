/**Clase Cliente
 * Ejemplo de clase con ASOCIACION a la clase Producto
 * Multiplicidad: Uno   para  0 o muchos
 * Cliente 1 --------------- 0..* Producto
 */
package Asociacion;

import java.util.ArrayList;

public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private ArrayList<Producto> listaProductos; // Atributo "listaProductos" de tipo ArrayList Producto. En esta declaración se crea la ASOCIACIÓN

    // Metodos
    public Cliente(){   // Constructor sin arumentos
    }

    public Cliente(String nombre, int edad){    // Constructor con argumentos
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setListaProducto(ArrayList<Producto> listaProductos){   // Metodo utilizado para asinar un valor al atributo "listaProductos"
        this.listaProductos = listaProductos;
    }
    public ArrayList<Producto> getListaProducto(){ // Metodo para capturar el atributo "listaProductos"
        return listaProductos;
    }

    public void muestraInfoCliente(){   // Metodo utilizado únicamente para mostrar los atributos en consola.
        System.out.println("El ciente "+nombre+" tiene "+edad+" anhos y tiene los suiguientes productos asociados: ");
        
        // Esta estructura de repetición se utiliza para imprimir los valores de la lista en consola
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre() + " y su valor es "+listaProductos.get(i).getValor());
        }
    }
}
