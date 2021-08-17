//package Reto2v1;

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
        /*
        if(dias_entre_fechas>dias_ms & silla.getNumero_silla()%2==0){
            mensaje = "La boleta no está permitida, ya que tanto la fecha de vencimiento como el número de silla son inválidos";
        }else{
            if(dias_entre_fechas<=dias_ms & silla.getNumero_silla()%2==0){
                mensaje = "La boleta es invalida, ya que el número de silla no está permitido";
            }
            else{
                if (dias_entre_fechas>dias_ms & silla.getNumero_silla()%2==1) {
                    mensaje = "La boleta no está permitida, ya que la fecha de vencimiento es inválida";
                }else{
                    mensaje = "La boleta es válida, el usuario puede acceder al estadio";
                }
            }
        }
        */

        if(dias_entre_fechas>dias_ms & silla.getNumero_silla()%2==0){
            mensaje = "La boleta no está permitida, ya que tanto la fecha de vencimiento como el número de silla son inválidos";
        }
        if(dias_entre_fechas<=dias_ms & silla.getNumero_silla()%2==0){
            mensaje = "La boleta es inválida, ya que el número de silla no está permitido";
        }
        if (dias_entre_fechas>dias_ms & silla.getNumero_silla()%2==1) {
            mensaje = "La boleta no está permitida, ya que la fecha de vencimiento es inválida";
        }
        if(dias_entre_fechas<=dias_ms & silla.getNumero_silla()%2==1){
            mensaje = "La boleta es válida, el usuario puede acceder al estadio";
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
        //System.out.println("Fecha actual: \t" + fecha_actual);
        //System.out.println("Fecha compra: \t" + fecha_compra);
        //SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        //formatter.format(fecha_compra);
        //System.out.println(formatter.format(fecha_compra));
        //String dataFormatada = formatter.format(fecha_compra);


        Boleta compra_boleta = new Boleta(0,fecha_compra,prueba_silla);
        
        System.out.println(compra_boleta.verificarBoleta());
        
    }

}
