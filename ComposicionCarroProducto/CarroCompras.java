package ComposicionCarroProducto;

import java.util.ArrayList;

public class CarroCompras {
    // Atributos
    private int id;
    private ArrayList<Producto> listaProductos; // Reservando un espacio en memoria
    
    // Metodos
    public CarroCompras(){
        listaProductos = new ArrayList<Producto>();
    }

    public CarroCompras(int id){
        this.id = id;
        listaProductos = new ArrayList<Producto>();
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void adicionaProductoCarro(Producto nuevoProducto){
        listaProductos.add(nuevoProducto);
    }
    public void removerProductoCarro(int indice){
        listaProductos.remove(indice);
    }
    public void vaciarCarro(){
        listaProductos.clear();
    }
    public void muestraInfoCarro(){
        System.out.println("El carro con id " + id +
                            " tiene los siguientes productos: ");
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(listaProductos.get(i).getNombre() + 
                                " valor " + listaProductos.get(i).getValor());
        }
    }
}