/**Programa: Ejercício referencia para crear el Reto1
 * 
 */
package CarroDescuentoMain;

public class CarroMain {
    public static void main(String[] args) {
        
        // Creando un objeto de tipo Carro
        //
        Carro carro_test = new Carro();
        carro_test.setMarca("Renault");
        carro_test.setColor("Azul");
        carro_test.setNumeroPuertas(2);
        carro_test.setPrecio(28000000);

        // Creando un vector de objetos de tipo Carro
        //
        Carro vector_carro[] = new Carro[3];
        vector_carro[0] = new Carro("Fiat", "Verde", 29000000, 3);
        vector_carro[1] = new Carro("Mazda", "Azul", 39000000, 4);
        vector_carro[2] = new Carro("Kia", "Rojo", 32000000, 4);

        vector_carro[0].calculaDescuento(vector_carro);
      
    }
    
}
