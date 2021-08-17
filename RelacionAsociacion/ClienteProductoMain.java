package RelacionAsociacion;

public class ClienteProductoMain {
    public static void main(String[] args) {
        
        Cliente clienteA = new Cliente();
        System.out.println("Valores: " + clienteA.getNombre() +" | "+ clienteA.getEdad());

        Producto producto1 = new Producto("Naranjas", 1500,clienteA);
        Producto producto2 = new Producto("Peras", 1600,clienteA);
        Producto producto3 = new Producto("Mangos", 2700,clienteA);

        clienteA.setNombre("Julio");
        clienteA.setEdad(56);
        clienteA.adicionaProducto(producto1);
        clienteA.adicionaProducto(producto2);
        clienteA.adicionaProducto(producto3);

        clienteA.muestraDatos();
        producto1.muestraCliente();

    }
    
}
