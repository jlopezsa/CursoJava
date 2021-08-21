package Reto3;

public class Reto3Main {
    public static void main(String[] args) {

        Silla silla_persona1 = new Silla(0, 44);

        AsistentePartido persona1 = new AsistentePartido(0, "Juan Sebastian Zuluaga", 29, silla_persona1);

        

        //System.out.println("La silla de " + persona1.getNombre_asistente() + " corresponde al número " + silla_persona1.getNumero());
        //System.out.println("La silla de " + persona1.getNombre_asistente() + " corresponde al número " + persona1.getSilla().getNumero());

        
    }
    
}
