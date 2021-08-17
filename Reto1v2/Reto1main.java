package Reto1v2;
import java.util.Scanner;

public class Reto1main {
    public static void main(String[] args) {
        
        Scanner datoConsola = new Scanner(System.in);

        //Asistente vectorLista [] = new Asistente[3];        // Creo un vector lista de tipo Asistente

        Asistente personas[] = {new Asistente(0,"Pedro",14,""),new Asistente(1,"Helena",27,""),new Asistente(2,"Selena",30,"")};
        
        Asistente asistente = new Asistente();
        //for (Asistente asistente : personas) {
        asistente.premioMayor(personas);
        //}
        //personas[0].premioMayor(personas);
        //personas[1].premioMayor(personas);
        //personas[2].premioMayor(personas);

        /*
        for(int i=0;i<vectorLista.length;i++){
            System.out.print("Ingrese el ID: ");
            id_num = datoConsola.nextInt();
            System.out.print("Ingrese el Nombre: ");
            nom = datoConsola.nextLine();
            datoConsola.next();                             // debe ser adicionado despues de capturar un String y la próxima captura es un número
            System.out.print("Ingrese el Asiento: ");
            asien = datoConsola.nextInt();
            
            Asistente auxAsistente = new Asistente(id_num, nom, asien, "null");     // Creo un objeto auxAsistente y envio los datos para inicializar el constructor
            vectorLista[i] = auxAsistente;
            System.out.println("----------------------------------");
        }
        */

        /*
        System.out.println("----- Los asistentes son ----");
        for(int i=0;i<vectorLista.length;i++){
            System.out.println("El asistente "+vectorLista[i].getId_asistente()+" tiene acceso a el premio "+vectorLista[i].getPremio());
        }
        
        System.out.println("----- Los premios de los asistentes son ----");
        */

        /*
        for(int i=0;i<vectorLista.length;i++){
            vectorLista[i].premioMayor(vectorLista);
            System.out.println("El asistente "+vectorLista[i].getId_asistente()+" tiene acceso a el premio "+vectorLista[i].getPremio()+".");
        }
        */
        datoConsola.close();
    }
}
