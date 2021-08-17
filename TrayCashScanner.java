import java.util.Scanner;
public class TrayCashScanner {
    public static void main(String[] args) {
        
        int res = capturaOpcion();

        System.out.println(res);
        
        switch (res) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
                break;
            case 5:
                System.out.println("Resto");
                break;
            case 6:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion incorrecta");
                break;
        }


    }

    public static int capturaOpcion(){
        Scanner datoConsola = new Scanner(System.in);
        int opcion;
        System.out.print("Digite opcion: ");
        try {
            opcion = datoConsola.nextInt();
            if(opcion>0 && opcion<7){
                return opcion;
            }else{
                System.out.println("Opcion no valida");
                return 0;
            }  
        } catch (Exception e) {
            System.out .println("ERROR, uted no digito un numero entero");
            return 0;
        }
    }    
}
