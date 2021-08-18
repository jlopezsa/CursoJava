/**Prorama: Template para implementar Reto2
 * Clase Boleta
 * Sugerencias para trabajar con la Clase Date usando milisegundos
 */

package Reto2Pruebas;       // Borrar esta linea cuando el documento sea enviado a la plataforma
import java.util.Date;

public class Boleta {       
    private int id_boleta;
    private Date fecha_compra;
    Silla silla;
    
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
        //Date fecha_actual = new Date();
        
        System.out.println("Datos dentro de verificat boleta: " + fecha_compra);


        String mensaje = "";
        
        // Codigo 

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

        Silla nueva_silla = new Silla(0,3);

        Date fecha_actual = new Date();
        System.out.println(fecha_actual);
        long fecha_actual_ms = fecha_actual.getTime();
        long dias_ms = 86400000*12;

        Date fecha_compra = new Date(fecha_actual_ms-dias_ms);

        System.out.println(fecha_compra);

        Boleta nueva_boleta = new Boleta(0, fecha_compra, nueva_silla);

        nueva_boleta.verificarBoleta();



        
    }
}