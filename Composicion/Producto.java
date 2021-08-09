package Composicion;

public class Producto {
    private String nombre;
    private int valor;

    public Producto() {
    }
    public Producto(String nombre, int valor) {
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

    public void muestraInfoProducto(){
        System.out.println("El producto "+nombre+" tiene un costo de "+valor+" pesos");
    }
    
}
