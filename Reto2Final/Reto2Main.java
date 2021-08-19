package Reto2Final;

import java.util.Date;

public class Reto2Main {
    public static void main(String[] args) {
        Silla nueva_silla = new Silla(0, 3);

        Date fecha_actual = new Date();
        long fecha_actual_ms = fecha_actual.getTime();
        long dia_compra_ms = 86400000*12;

        Date fecha_compra = new Date();
        fecha_compra.setTime(fecha_actual_ms-dia_compra_ms);

        Boleta nueva_boleta = new Boleta(0, fecha_compra, nueva_silla);

        System.out.println(nueva_boleta.verificarBoleta());
        
    }
    
}
