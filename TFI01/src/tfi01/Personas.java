
package tfi01;
/**
 *
 * @author kartdei
 */

public abstract class Personas {
    String nombre;
    int edad;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    abstract public String getTipo();

    abstract public String toStr();
}