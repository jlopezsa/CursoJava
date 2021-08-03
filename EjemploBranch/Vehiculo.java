package EjemploBranch;

public class Vehiculo {
    private int velocidad;
    private String marca;

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setNombre(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public void imprimeValores(){
        System.out.println("El carro " + marca + 
        " corre a " + velocidad + " kilometros por hora");
    }
}
