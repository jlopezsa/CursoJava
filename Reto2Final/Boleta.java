package Reto2Final;
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
        Date fecha_actual = new Date();
        long fecha_actual_ms = fecha_actual.getTime();
        long fecha_compra_ms = fecha_compra.getTime();  // fecha de compra en ms
        long dias_ms = 86400000*14;                     // 14 dias en ms
        long dias_entre_fechas = fecha_actual_ms - fecha_compra_ms;  // fecha de vencimiento en ms
        Date fecha_vencimiento = new Date(fecha_actual_ms-dias_ms);
        setFecha_vencimiento(fecha_vencimiento);
        String mensaje="";
        
        if(  ){
            mensaje = "mensaje ";
        }
        if( ){
            mensaje = " ";
        }
        if ( ) {
            mensaje = " ";
        }
        if(   ){
            mensaje = " ";
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
        Silla prueba_silla = new Silla(0,3); //id_silla, numero_silla
        Date fecha_actual = new Date();
        Date fecha_compra = new Date();
        long dias_ms = 86400000*14;
        long fecha_actual_ms = fecha_actual.getTime();
        long fecha_compra_ms = fecha_actual_ms - dias_ms;
        fecha_compra.setTime(fecha_compra_ms);

        Boleta compra_boleta = new Boleta(0,fecha_compra,prueba_silla);
        
        System.out.println(compra_boleta.verificarBoleta());
        
    }
}


