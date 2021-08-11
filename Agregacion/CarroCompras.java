/**Clase: CarroCompras
 * La CLase CarroCompras agrega a la clase Factura.
 * Aqui en CarroCompras no se utiliza NEW cuando se declara el atributo tipo Factura.
 */
package Agregacion;

public class CarroCompras {
    // Atributos
    private int id;
    private Factura factura;                        // Objeto factura. En una Agregación se reserva un espacio en memória, no se crea el objeto. Recordar que el objeto se crea utilizando NEW. Y es en la Composición donde se usa NEW para crear el objeto dentro de la clase. 

    // Constructores
    //
    public CarroCompras(){
    }

    public CarroCompras(int id, Factura factura){ // factura recibe como parametro de referencia un objeto que ya fue creado
        this.id = id;
        this.factura = factura;                     
    }

    // Metodos
    //
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setFactura(Factura factura) {       // factura recibe como parametro de referencia un objeto que ya fue creado y es almacenado en el atrbuto factura de esta clase 
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void muestraInfoCarro(){    // Metodo utilizado únicamente para imprimir los valores de los atributos en consola.
        System.out.println("Al carro con ID: " + id +
                            " le fue agregada una factura con ID: "+ factura.getIdFactura());
    }
}