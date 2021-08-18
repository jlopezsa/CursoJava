/**Prorama: Template para implementar Reto1
 * Clase: Asistente
 */
package Reto1Pruebas;   // Comentar esta linea para enviar el reto

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
        // Logica del Reto1

        if(asistente[0].numero_asiento % 2 == 0){
            asistente[0].premio = "mayor";
        }else{
            asistente[0].premio = "menor";
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