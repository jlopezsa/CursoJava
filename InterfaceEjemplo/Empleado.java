/**Clase: Empleado
 * Clase derivada de la SUPERCLASE Persona
 */

package InterfaceEjemplo;

public class Empleado extends Persona implements Banco{
    private String profesion;

    public Empleado(){}
    public Empleado(String profesion){
        this.profesion = profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public String getProfesion() {
        return profesion;
    }

    public void infoEmpleado(){
        System.out.println("El empleado "+ this.getNombre()+" tiene "+ this.getEdad()+
                            " años y su profesion es " + profesion);
    }

    public void guardarImplementos(){           // Método sobreescrito (Polimorfismo)
        System.out.println("Empleados, guardar sus implementos en las oficinas!");
        //
        //
    }

    public void imprimeDescuento(){
        System.out.println("El descuento del banco es: " + DESCUENTO_EMPLEADO);
    }

}
