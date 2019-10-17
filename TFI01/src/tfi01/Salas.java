package tfi01;

import static java.lang.String.valueOf;
import java. util. Arrays;
/**
 *
 * @author kartdei
 */
public class Salas {
    int capacidad;
    String pelicula;
    String nombre;
    Espectadores espectadores[];
    
    public Salas(int capacidad, String nombre){
        this.nombre = nombre;
        this.capacidad = capacidad;
    }
    
    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }
    
    public String getPelicula(){
        return (this.pelicula);
    }
    
    public void setEspectadores(Espectadores espectadores[]){
        
        if (espectadores.length > capacidad){
            System.out.println("No pueden haber mas espectadores que la capacidad de la sala.");
            return;
        }
        else{
            this.espectadores = espectadores;
        }
    }
    
    public String getEspectadores(){
//        try{
//            return Arrays.toString(this.espectadores);
//        }
//        catch(Exception a){
//            return ("SIN ESPECTADORES CARGADOS");
//        }
// No hay una excepcion que capturar. El arreglo vacio devuelve 'null'.
        if (this.espectadores == null){
            return ("SIN ESPECTADORES CARGADOS");
        }
        else return Arrays.toString(this.espectadores);
    }
    
    public String toStr(){
        return valueOf(this);
    }
    
//    public static void main(String[] args){
//        Salas Stussy = new Salas(25, "Stussy");
//        Stussy.setPelicula("La Momia");
//        System.out.println(Stussy.toStr());
//        System.out.println(Stussy.getEspectadores());
//    }
}