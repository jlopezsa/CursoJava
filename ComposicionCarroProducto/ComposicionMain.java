package ComposicionCarroProducto;

import java.util.ArrayList;

public class ComposicionMain {
    
    public static void main(String[] args) {
        
        Producto fruta = new Producto();
        fruta.setNombre("Pera");
        fruta.setValor(1500);
        //
        Producto lacteo = new Producto("Queso",7800);
        Producto vegetal = new Producto("Lechuga",1100);
        Producto aseo = new Producto("Detergente",3800);

        ArrayList<Producto> listaCliente;
        listaCliente = new ArrayList<Producto>();
        
        listaCliente.add(fruta);
        listaCliente.add(lacteo);
        listaCliente.add(vegetal);
        listaCliente.add(aseo);

        Cliente cliente1 = new Cliente("Carlos",54);

        cliente1.setListaProductos(listaCliente);
        cliente1.muestraInfoCliente();
        

    }
}
