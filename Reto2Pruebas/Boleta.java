/**Prorama: Template para implementar Reto2
 * Clase Boleta
 * Sugerencias para trabajar con la Clase Date usando milisegundos
 * 
 */

package Reto2Pruebas;       // Borrar esta linea cuando el documento sea enviado a la plataforma
import java.util.Date;

public class Boleta {       
    private int id_boleta;
    private Date fecha_compra;
    Silla silla;
    private static final int DIA_ANTIGUEDAD = 14;    // opcional
    
    public Boleta(){
    }
    public Boleta(int id_boleta, Date fecha_compra, Silla silla){
        this.id_boleta = id_boleta;
        this.fecha_compra = fecha_compra;
        this.silla = silla;
    }
    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }
    public int getId_boleta() {
        return id_boleta;
    }
    //-----------------------------------------------
    public String verificarBoleta(){
        String mensaje = "";
        Date fecha_actual = new Date();
        long fecha_actual_ms = fecha_actual.getTime();
        long dia_limite_ms = 86400000*DIA_ANTIGUEDAD;

        long dia_vencimiento_ms = fecha_actual_ms - dia_limite_ms;

        //System.out.println("Fecha actual: " + fecha_actual);
        //System.out.println("Fecha compra: " + fecha_compra);
        //Date fecha_vencimiento = new Date(dia_vencimiento_ms);
        //System.out.println("Fecha vencim: " + fecha_vencimiento);

        if(fecha_compra.getTime() >= dia_vencimiento_ms && silla.getNumero_silla()%2==0){
            mensaje = "mensaje 1";
        }
        if(       false            ){
            mensaje = "mensaje 2";
        }
        if(        false           ){
            mensaje = "mensaje 3";
        }


        return mensaje;
    }
    //-----------------------------------------------
    public Date getFecha_vencimiento(){
        return fecha_compra;
    }
    public void setFecha_vencimiento(Date fecha_vencimiento){
        this.fecha_compra = fecha_vencimiento;
    }
    public static void main(String[] args) {

        Silla nueva_silla = new Silla(0,6);

        Date fecha_actual = new Date();
        long fecha_actual_ms = fecha_actual.getTime();
        long dias_ms = 86400000*7;

        Date fecha_compra = new Date(fecha_actual_ms-dias_ms);

        Boleta nueva_boleta = new Boleta(0, fecha_compra, nueva_silla);

        System.out.println(nueva_boleta.verificarBoleta());
    }
}