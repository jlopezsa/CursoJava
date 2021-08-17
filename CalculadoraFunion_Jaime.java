import java.util.Scanner;
public class CalculadoraFunion_Jaime {
    public static void main(String[] args){
        Scanner datoConsola = new Scanner(System.in);
        
        
        int opcion;
        System.out.println("OPCIONES DE MENU");  // Titulo Salida
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        System.out.println("5.Residuo");
        System.out.println("6.salir");           
        System.out.print("Ingrese un entero positivo en el rango  1 a 6 incluyendo 1 o 6 :  ");  
        opcion = datoConsola.nextInt();
        
        int x;   // Primera variable para las Operaciones del menu
        int y;   // Segunda variable para las Operaciones del menu                          
        int Suma;
        int Resta;
        int Multiplicacion;
        int Division;
        int Residuo;    
        
        switch(opcion){
            case 1:
                System.out.print("Usted ha seleccionado la opcion 1 que corresponde a la  suma  \n");
                System.out.print("Ingrese un primer  numero para suma  ");
                x=datoConsola.nextInt();
                System.out.print("Ingrese un segundo  numero para suma  ");
                y=datoConsola.nextInt();
                Suma=(x+y);
                System.out.print("La suma entre "+ x +  "  y  " + y + "   es   " + Suma + " \n");
                break;
            case 2:
                System.out.print("Usted ha seleccionado la opcion 2 que corresponde a la resta  \n");
                System.out.print("Ingrese un primer  numero para la resta  ");
                x=datoConsola.nextInt();
                System.out.print("Ingrese un segundo  numero para Resta  ");
                y=datoConsola.nextInt();
                Resta = (x-y);               
                System.out.print("La resta entre "+ x +  "  y  " + y + "   es   " + Resta + " \n");
                break;
            case 3:
                System.out.print("Usted ha seleccionado la opcion 3 que corresponde a la multiplicacion  \n");
                System.out.print("Ingrese un primer  numero para la multiplicacion  ");
                x=datoConsola.nextInt();
                System.out.print("Ingrese un segundo  numero para la multiplicacion    ");
                y=datoConsola.nextInt();
                Multiplicacion= (x*y);                                              
                System.out.print("La multiplicacion  "+ x +  "  y  " + y + "   es   " + Multiplicacion + " \n");
                break;
            case 4:
                System.out.print("Usted ha seleccionado la opcion 4 que corresponde a la division  \n");
                System.out.print("Ingrese un primer  numero numerador  para la division  ");
                x=datoConsola.nextInt();
                System.out.print("Ingrese un segundo  numero diferente a cero para denominador y completar  la division    ");
                y=datoConsola.nextInt();
                Division= (x/y);                   
                System.out.print("La division entre  "+ x +  "  y  " + y + "   es   " + Division + " \n");
                break;
            case 5:
                System.out.print("Usted ha seleccionado la opcion 5 que corresponde al residuo  \n");
                System.out.print("Ingrese un primer  numero como dividendo  ");
                x=datoConsola.nextInt();
                System.out.print("Ingrese un segundo  numero como divisor   ");
                y=datoConsola.nextInt();
                Residuo= (x%y);                     
                System.out.print("El residuo entre    "+ x +  "  y  " + y + "   es   " + Residuo + " \n");
                break;
            case 6:
                System.out.print("Usted ha seleccionado la opcion 6 \n");
                System.out.print(" salir del programa"); 
                break;
            default:
                System.out.print("Usted ha seleccionado una opcion incorrecta  ");
                break;
        }
        datoConsola.close();   
    }
}