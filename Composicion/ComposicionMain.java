/** Prorama: Ejemplo de COMPOSICION entre clases
 * El método main() es utilizado únicamente para probar las clases y su relación de COMPOSICION
 */

package Composicion;

public class ComposicionMain {
    public static void main(String[] args) {

        // Creando los objetos de tipo Producto
        //
        Producto fruta = new Producto("Naranjas",1600); 
        Producto lacteo = new Producto("Queso",7600);
        Producto aseo = new Producto("Crema",4500);
        Producto carnes = new Producto("Lomo",16000);

        // Creando el objeto de tipo Cliente
        //
        CarroCompras carro1;                // Reservando el espacio en memoria
        carro1 = new CarroCompras();        // Creando el objeto utilizando el constructor sin argumentos. También podría ser creado con el constructore que requiere arumentos. 
        carro1.setId(123);                  // Adicionando valores a los atributos
        carro1.adicionaProducto(lacteo);    // Adicionando el objeto producto a la lista del objeto carro1
        carro1.adicionaProducto(fruta);
        carro1.adicionaProducto(carnes);

        // Método para mostrar los datos en consola
        //
        carro1.muestraInfoCarro();
    }
}
