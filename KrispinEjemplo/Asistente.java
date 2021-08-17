package KrispinEjemplo;

public class Asistente {
    private int id_asistente;
    private String nombre_asistente;
    private int numero_asiento;
    private String premio;

    public Asistente(){
    }
    public Asistente(int id_asistente, String nombre_asistente, int numero_asiento, String premio){
    }
    public Asistente[] premioMayor(Asistente[] asistente){
        return asistente;
    }
    int getId_asistente(){
        return id_asistente;
    }
    void setId_asistente(int id_asistente){
        this.id_asistente =id_asistente;
    }
    String getNombre_asistente(){
        return nombre_asistente;
    }
    void setNOmnre_asistente(String nombre_asistente){
        this.nombre_asistente = nombre_asistente;
    }
    int getNumero_asiento(){
        return numero_asiento;
    }
    void setNumero_asiento(int numero_asiento){
        this.numero_asiento = numero_asiento;
    }
    String getPremio(){
        return premio;
    }
}
