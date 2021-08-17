package RelacionAsociacion;
public class Producto {
    // Atributos
    private String nombre;
    private int precio;
    private Cliente cliente;

    // Metodos
    public Producto(String nombre, int precio, Cliente cliente){
        this.nombre = nombre;
        this.precio = precio;
        this.cliente = cliente;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public Cliente muestraCliente(){
        System.out.println("El producto "+nombre
                            + " pertenece al cliente "+cliente.getNombre());
        return cliente;
    }
    
}
