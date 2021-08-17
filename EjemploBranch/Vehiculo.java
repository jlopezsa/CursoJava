package EjemploBranch;

public class Vehiculo {
    private int velocidad;
    private String marca;
    private boolean veloz;

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMarca(String marca) {
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
        " corre a " + velocidad + " kilometros por hora. Se considera veloz? "+veloz);
    }

    public Vehiculo[] isVeloz(Vehiculo[] rapidos){
        System.out.println("lonitud vector: "+rapidos.length);
        for (int i = 0; i < rapidos.length; i++) {
            if(rapidos[i].velocidad > 100)
                rapidos[i].veloz = true;
            else
                rapidos[i].veloz = false;
        }
        return rapidos;
    }
}
