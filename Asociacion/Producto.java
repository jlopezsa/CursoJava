/**Clase Producto
 * Ejemplo de clase con ASOCIACION a la clase Cliente
 * Multiplicidad: Uno   para  0 o muchos
 * Cliente 1 --------------- 0..* Producto
 */
package Asociacion;

public class Producto {
    // Atributos
    private String nombre;
    private int valor;

    // Metodos
    public Producto() {     // Constructor sin parametros
    }
    public Producto(String nombre, int valor) { // Constructor con parametros
        this.nombre = nombre;
        this.valor = valor;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }

    public void muestraInfoProducto(){  // Metodo utilizado unicamente para imprimir los valores de los atributos en consola
        System.out.println("El producto "+nombre+" tiene un costo de "+valor+" pesos");
    }
    
}
