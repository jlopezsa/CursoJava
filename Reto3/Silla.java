package Reto3;

public class Silla {
    private int id_silla;
    private int numero;

    public Silla(){

    }
    public Silla(int id_silla, int numero){
        this.id_silla = id_silla;
        this.numero = numero;
    }
    
    public void setId_silla(int id_silla) {
        this.id_silla = id_silla;
    }
    public int getId_silla() {
        return id_silla;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}
