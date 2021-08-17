package Revision1;
import java.util.Scanner;

public class SalarioMain {
    public static void main(String[] args) {
        Scanner datoConsola = new Scanner(System.in);
        menuSalario();

        String nombre;
        int formacion;
        int horas;
        int total_salario;

        System.out.print("Ingrese horas: ");
        horas = datoConsola.nextInt();
        datoConsola.nextLine();                 // Limpiar buffer
        System.out.print("Ingrese nombre: ");
        nombre = datoConsola.nextLine();
        System.out.print("Ingrese titulacion: ");
        try {
            formacion = datoConsola.nextInt();
        }catch(Exception e) {
            System.out.println("Error "+e.getMessage());
            formacion = 0;
        }
        
        switch(formacion){
            case 1:
                total_salario = calculaSalario(20000, horas);
                imprimeMensaje(nombre, "Tecnico", horas, total_salario);
                break;
            case 2:
                total_salario = calculaSalario(30000, horas);
                imprimeMensaje(nombre, "Tecnólogo", horas, total_salario);
                break;
            case 3:
                total_salario = calculaSalario(35000, horas);
                imprimeMensaje(nombre, "Ingeniero", horas, total_salario);
                break;
            case 4:
                total_salario = calculaSalario(40000, horas);
                imprimeMensaje(nombre, "Maestria", horas, total_salario);
                break;
            default:
                System.out.println("Titulación no declarada");
        }

        datoConsola.close();
    }

    public static void menuSalario(){
        System.out.println("1. Técnico \t $20000 hora");
        System.out.println("2. Tenólogo \t $30000 hora");
        System.out.println("3. Ingeniero \t $35000 hora");
        System.out.println("4. Maestria \t $40000 hora");
    }

    public static int calculaSalario(int valor_hora, int horas_trabajadas){
        if(horas_trabajadas > 8){
            horas_trabajadas = 8;
        }
        return valor_hora * horas_trabajadas;
    }

    public static void imprimeMensaje(String nombre, String titulacion, int horas, int total){
        System.out.println("La persona con nombre "+nombre+
                            " y titulación "+titulacion+
                            " trabajo "+horas+
                            " horas y su salario es de "+total+
                            " pesos en el día");
    }
    
}
