/**Clase Factura
 * Esta es la clase que vá a ser agregada a la clase CarroCompras.
 */
package Agregacion;

public class Factura {
    // Atributos
    //
    private int id_factura;      // identificación de la Factura

    // Constructores
    //
    public Factura(){
    }
    public Factura(int id_factura){
        this.id_factura = id_factura;
    }
    
    // Metodos
    //
    public void setIdFactura(int id_factura) {
        this.id_factura = id_factura;
    }
    public int getIdFactura() {
        return id_factura;
    }

    public void muestraInfoFactura(){
        System.out.println("La factura tiene ID: " + id_factura);
    }
}
