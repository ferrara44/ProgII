
package tf01rec;

/**
 *
 * @author kartdei
 */
public class Lugares implements ParaMostrar{
    String nombre;
    String direccion;

    @Override
    public String toString() {
        return "Lugares{" + "nombre=" + nombre + ", direccion=" + direccion + '}';
    }
    
    @Override
    public String getNombre(){
       return this.getClass().getName();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}