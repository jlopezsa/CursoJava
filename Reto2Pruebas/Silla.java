/**Prorama: Template para implementar Reto2
 * Clase: Silla
 */

package Reto2Pruebas;       // Borrar esta linea cuando el documento sea enviado a la plataforma
public class Silla {
    private int id_silla;
    private int numero_silla;
    public Silla(){
    }
    public Silla(int id_silla, int numero_silla) {
        this.id_silla = id_silla;
        this.numero_silla = numero_silla;
    }
    public void setId_silla(int id_silla) {
        this.id_silla = id_silla;
    }
    public int getId_silla() {
        return id_silla;
    }
    public void setNumero_silla(int numero_silla) {
        this.numero_silla = numero_silla;
    }
    public int getNumero_silla() {
        return numero_silla;
    }
}
