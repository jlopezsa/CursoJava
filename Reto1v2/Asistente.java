package Reto1v2;
public class Asistente {
    private int id_asistente;
    private String nombre_asistente;
    private int numero_asiento;
    private String premio;

    public Asistente(){
    }

    public Asistente(int id_asistente, String nombre_asistente, int numero_asiento, String premio){
        this.id_asistente = id_asistente;
        this.nombre_asistente = nombre_asistente;
        this.numero_asiento = numero_asiento;
        this.premio = premio;
    }

    public Asistente[] premioMayor(Asistente[] asistente){
        for(int i=0;i<asistente.length;i++){
            if(asistente[i].numero_asiento % 2 == 0){
                asistente[i].premio = "mayor";
            }else{
                asistente[i].premio = "menor";                
            }
            System.out.println("El asistente "+asistente[i].id_asistente+" tiene acceso a el premio "+asistente[i].premio+".");
        }
        return asistente;
    }
    //--------- id_asistente
    int getId_asistente(){
        return id_asistente;
    }
    void setId_asistente(int id_asistente){
        this.id_asistente = id_asistente;
    }
    //--------- nombre_asistente
    String getNombre_asistente(){
        return nombre_asistente;
    }
    void setNombre_asistente(String nombre_asistente){
        this.nombre_asistente = nombre_asistente;

    }
    //--------- numero_asiento

    int getNumero_asiento(){
        return numero_asiento;
    }
    void setNumero_asiento(int numero_asiento){
        this.numero_asiento = numero_asiento;
    }
    //--------- premio
    String getPremio(){
        return premio;
    }
}
