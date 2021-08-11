/**Programa: Ejemplo de AGREGACIÓN entre clases 
 * Clase CarroCompras agrega a la clase Factura
 * 
*/
package Agregacion;

public class AgregacionMain {
    public static void main(String[] args) {
        
        Factura nueva_factura = new Factura();  // Creando el objeto nueva_factura.
        nueva_factura.setIdFactura(11123);

        CarroCompras carro_tarde = new CarroCompras(); // Creando el objeto carro_tarde
        carro_tarde.setId(22123);
        carro_tarde.setFactura(nueva_factura); // Enviando el objeto nueva_factura al CarroCompras. Como el objeto nueva_factura es creado aquí en el núcleo del programa en la clase CarroCompras no es encesário crearlo. Ese es el concepto de la AREGACION

        System.out.println("ID factura: "+carro_tarde.getFactura().getIdFactura());

        carro_tarde.muestraInfoCarro();
    }   
}