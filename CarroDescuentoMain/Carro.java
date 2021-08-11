package CarroDescuentoMain;

public class Carro {
    private String marca;
    private String color;
    private int precio;
    private int numero_puertas;
    private String descuento;

    public Carro() {
    }
    public Carro(String marca, String color, int precio, int numero_puertas){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.numero_puertas = numero_puertas;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setPrecio(int precio){

        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setDescuento(String descuento){
        this.descuento = descuento;
    }
    public String getDescuento(){
        return descuento;
    }
    public void setNumeroPuertas(int numero_puertas){
        this.numero_puertas = numero_puertas;
    }
    public int getNumeroPuertas(){
        return numero_puertas;
    }

    public Carro[] calculaDescuento(Carro[] carro){

        // Utilizar una estructura de repetición para recorrer todo el vector que inresa. En este ejemplo solo se hizo para la posición 0

        if(carro[0].numero_puertas == 3){
            carro[0].descuento = "SI";
        }else{
            carro[0].descuento = "NO";
        }
        System.out.println("El carro "+carro[0].getMarca()+ " con " +
                    carro[0].getNumeroPuertas() + " puertas " +
                    carro[0].getDescuento() + " tiene descuento");

        // Fin de la estructura de repetición

        return carro;
    }
}
