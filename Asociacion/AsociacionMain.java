/** Prorama: Ejemplo de ASOCIACIÓN entre clases
 * El método main() es utilizado únicamente para probar las clases y su relación de ASOCIACION
 */
package Asociacion;

import java.util.ArrayList;

public class AsociacionMain {
    public static void main(String[] args) {

        // Creando los objetos de tipo Producto
        //
        Producto fruta = new Producto("Pera", 1200);
        Producto aseo = new Producto();
        aseo.setNombre("Detergente");
        aseo.setValor(3800);
        Producto vegetales = new Producto("Lechuga", 900);

        // Creando un ArrayList de tipo Producto para adicionar los productos a la lista
        //
        ArrayList<Producto> listaCliente = new ArrayList<Producto>();
        listaCliente.add(fruta);
        listaCliente.add(aseo);
        listaCliente.add(vegetales);

        // Creando los objetos de tipo Cliente
        //
        Cliente cliente1 = new Cliente("Raul", 46);
        
        // Asinando la listaCliente al atrbuto listaProducto de la clase Cliente. 
        //
        cliente1.setListaProducto(listaCliente);

        // Imprimiendo los valores en consola 
        //
        cliente1.muestraInfoCliente();
        
    }
    
}
