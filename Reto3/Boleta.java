package Reto3;

import java.util.Date;
public class Boleta {
    private int idBoleta;
    private Date fecha_compra;
    private AsistentePartido[] asistentes;

    public Boleta(){

    }
    public Boleta(int idBoleta, Date fecha_comprDate, AsistentePartido[] asistentes){
        this.idBoleta = idBoleta;
        this.fecha_compra = fecha_comprDate;
        this.asistentes = asistentes;

    }

    public double boleteriaTotal(){
        double retorno = 0;

        // Logica del código

        return retorno; 
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }
    public int getIdBoleta() {
        return idBoleta;
    }
    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    public Date getFecha_compra() {
        return fecha_compra;
    }
    public void setAsistentes(AsistentePartido[] asistentes) {
        this.asistentes = asistentes;
    }
    public AsistentePartido[] getAsistentes() {
        return asistentes;
    }


}
