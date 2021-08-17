package KrispinEjemplo;

public class AsistenteMain {
    public static void main(String[] args) {
        Asistente Asistente_test=new Asistente();
        Asistente_test.setId_asistente(123400);
        Asistente_test.setNOmnre_asistente("Luis");
        Asistente_test.setNumero_asiento(23);
        
        System.out.println(Asistente_test.getNombre_asistente());

        Asistente Asistente_premio=new Asistente();
        System.out.println(" El asistente con id "+ Asistente_premio.getId_asistente() +" con nombre "+ Asistente_premio.getNombre_asistente() +" del numero de asiento "
                            + Asistente_premio.getNumero_asiento() + " participa por el premio "+ Asistente_premio.getPremio());
    }
}
