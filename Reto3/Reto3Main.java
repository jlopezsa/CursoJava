package Reto3;

import java.util.Date;

public class Reto3Main {
    public static void main(String[] args) {

        Silla silla_persona1 = new Silla(0, 44);

        AsistentePartido persona1 = new AsistentePartido(0, "Juan Sebastian Zuluaga", 29, silla_persona1);

        Date fecha_compra = new Date();

        AsistentePartido vector_asistentes[] = new AsistentePartido[3];
        vector_asistentes[0] = persona1;


        Boleta boleta_total = new Boleta(0, fecha_compra, vector_asistentes);

        boleta_total.boleteriaTotal();
        
        //System.out.println("La silla de " + persona1.getNombre_asistente() + " corresponde al número " + silla_persona1.getNumero());
        //System.out.println("La silla de " + persona1.getNombre_asistente() + " corresponde al número " + persona1.getSilla().getNumero());

        
    }
    
}
