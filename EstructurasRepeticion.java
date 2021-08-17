public class EstructurasRepeticion {
    public static void main(String[] args){
        int i = 0;
        boolean condicion = false;
        boolean modificador_de_la_condicion = false;

        while(condicion){
            // ...
            // ...
            condicion = modificador_de_la_condicion;
        }
        

        for(int contador=0; contador<10; contador++){
            // ...
            // ...
            System.out.println("Repeticion numero " + contador);
        }
        System.out.println("---------------------------");
        for(int contador=9; contador>=0; contador--){
            // ...
            // ...
            System.out.println("Repeticion numero " + contador);
        }
    }
}
