/** Clase cuyo nombre es GalletasPersona 
 * 
*/
package HolaClase;
public class GalletasPersona {                  // Nombre de la Clase
    //----- Atributos ------
    private String nombre;
    private int valor;
    private double peso;
    //----- Metodos --------
    public void setNombre(String nom){
        nombre = nom;
    }

    public String getNombre(){
        return nombre;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }
    public void setPeso(double pes){
        peso = pes;
    }

    public double getPeso(){
        return peso;
    }
}
