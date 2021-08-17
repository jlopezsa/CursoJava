import java.util.Scanner;

public class CalculadoraDosNumerosFinal {
    public static void main(String[] args) {
        
        int opcionMenu;
        double operador1=0;
        double operador2=0;
        Scanner datosUsuario = new Scanner(System.in);

        do{
            menuCalculadora();                                  // Función pra imprimir menu en consola

            opcionMenu = capturaOpcion(datosUsuario);
            if(opcionMenu>0 && opcionMenu<6){
                try {
                    operador1 = capturaOperador(datosUsuario);
                    operador2 = capturaOperador(datosUsuario);
                } catch (Exception e) {
                    System.out.println("Operador invalido, no es un número.");
                    opcionMenu = 6;
                }
                
            }

            switch (opcionMenu) {
                case 1:
                    suma(operador1, operador2);
                    break;
                case 2:
                    resta(operador1, operador2);
                    break;
                case 3:
                    multiplicacion(operador1, operador2);
                    break;
                case 4:
                    division(operador1, operador2);
                    break;
                case 5:
                    resto(operador1, operador2);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("...Opcion no esta en menu...");
                    break;
            }
        }while(opcionMenu!=6);
        System.out.println("...Fin del Programa...");
    }                                                           // Fin del main()

    public static void menuCalculadora(){
        System.out.println("Menu de opciones para calculadora");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("5 - Resto");
        System.out.println("6 - Salir");
    }

    public static int capturaOpcion(Scanner datosUsuario){               
        int opcion;
        System.out.print("Digite la opcion deseada: ");
        try {
            opcion = datosUsuario.nextInt();
            return opcion;
        } catch (Exception e) {
            System.out.println("Opcion no permitida: " + e.getMessage());
            datosUsuario.next();    // Es necesário adicionar este método del Scanner para borrar la entrada no válida de scanner.
            return -1;
        }
    }

    public static double capturaOperador(Scanner numeroUsuario){
        double operador;
        System.out.print("Digite el operador: ");
        operador = numeroUsuario.nextDouble();
        return operador;
    }

    public static void suma(double op1, double op2){
        double resul;
        resul = op1+op2;
        System.out.println("El resultado de la suma es: " + resul);
    }

    public static void resta(double op1, double op2){
        double resul;
        resul = op1-op2;
        System.out.println("El resultado de la resta es: " + resul);
    }

    public static void multiplicacion(double op1, double op2){
        double resul;
        resul = op1*op2;
        System.out.println("El resultado de la multiplicacion es: " + resul);
    }

    public static void division(double op1, double op2){
        double resul;
        resul = op1/op2;
        System.out.println("El resultado de la division es: " + resul);
    }

    public static void resto(double op1, double op2){
        double resul;
        resul = op1%op2;
        System.out.println("El resto de la division: " + resul);
    }
}           // Fin de clase
