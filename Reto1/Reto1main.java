package Reto1;
import java.util.Scanner;

public class Reto1main {
    public static void main(String[] args) {
        
        /*
        Asistente ass1 = new Asistente(0,"Pedro",14,"Null");
        Asistente ass2 = new Asistente(1,"Helena",27,"Null");
        Asistente ass3 = new Asistente(2,"Selena",30,"Null");
        System.out.println(asistente1.getNombre_asistente());
        */

        //Asistente listaAsistente [] = {new Asistente(0,"Pedro",14,"Null"), new Asistente(1,"Helena",27,"Null"), new Asistente(2,"Selena",30,"Null")};
        /*
        for(int i=0;i<listaAsistente.length;i++){
            System.out.println("El asistente "+listaAsistente[i].getId_asistente()+" tiene acceso a el premio "+listaAsistente[i].getPremio());
        }
        System.out.println("----------------------------------");
        for(int i=0;i<listaAsistente.length;i++){
            listaAsistente[i].premiMayor(listaAsistente);
            System.out.println("El asistente "+listaAsistente[i].getId_asistente()+" tiene acceso a el premio "+listaAsistente[i].getPremio());
        }
        */
        
        Scanner datoConsola = new Scanner(System.in);
        int id_num;
        String nom;
        int asien;
        Asistente vectorLista [] = new Asistente[3];        // Creo un vector lista de tipo Asistente
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

        System.out.println("----- Los asistentes son ----");
        for(int i=0;i<vectorLista.length;i++){
            System.out.println("El asistente "+vectorLista[i].getId_asistente()+" tiene acceso a el premio "+vectorLista[i].getPremio());
        }
        
        System.out.println("----- Los premios de los asistentes son ----");
        for(int i=0;i<vectorLista.length;i++){
            vectorLista[i].premioMayor(vectorLista);
            System.out.println("El asistente "+vectorLista[i].getId_asistente()+" tiene acceso a el premio "+vectorLista[i].getPremio());
        }
        datoConsola.close();
    }
}
