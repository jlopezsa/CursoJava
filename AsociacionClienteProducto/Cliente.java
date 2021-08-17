package AsociacionClienteProducto;

import java.util.ArrayList;

public class Cliente {
    // Atributos
    private String nombre;
    private int edad;
    private ArrayList<Producto> listaProductos; // Reservando un espacio en memoria
    
    // Metodos
    public Cliente(){
        // = new ArrayList<Producto>();
    }

    public Cliente(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        //listaProductos = new ArrayList<Producto>();
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
    public void setListaProductos(ArrayList<Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    public ArrayList<Producto> egtListaProductos(){
        return listaProductos;
    }
    public void muestraInfoCliente(){
        System.out.println("El Cliente " + nombre +
                            " compro los siguientes productos: ");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre() + 
                                " valor " + listaProductos.get(i).getValor());
        }
    }
}