import java.util.Scanner;
public class EnsayosS5 {
    public static void main(String[] args) {
        Scanner datoUsuario = new Scanner(System.in);
        int opcion;
        menuOpciones();
        opcion = datoUsuario.nextInt();

        datoUsuario.close();
    }
    public static void menuOpciones(){
        System.out.println("Bienvenido al menu de opciones (operacion entre dos numeros)");
        System.out.println("1 - Suma de dos numeros");
        System.out.println("2 - Valor medio de dos números");
        System.out.print("Inrese opcion deseada");
    }
}
