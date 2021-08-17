package InterfaceEjemplo;

public interface Banco {
    public static final double DESCUENTO_PENSIONADO = 0.05; // valor de descuento
    public static final double DESCUENTO_EMPLEADO = 0.09; // valor de descuento

    public abstract void imprimeDescuento();    // Clase abstracta

}

