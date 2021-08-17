import java.util.ArrayList;

public class ArrayListEjemplo {
    public static void main(String[] args) {
        ArrayList listaNueva;
        listaNueva = new ArrayList(); 
        
        listaNueva.add(32);
        listaNueva.add(-5);
        listaNueva.add(3.55);
        listaNueva.add("Tripulantes");

        for (int i = 0; i < listaNueva.size(); i++) {
            System.out.println( listaNueva.get(i) );
        }

        System.out.println("--------------------");
        listaNueva.remove(1);
        for (int i = 0; i < listaNueva.size(); i++) {
            System.out.println( listaNueva.get(i) );
        }
        
        
    }
    
}
