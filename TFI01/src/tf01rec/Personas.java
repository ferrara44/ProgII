
package tf01rec;

/**
 *
 * @author kartdei
 */
public class Personas implements ParaMostrar{
    String nombre;
    int DNI;

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", DNI=" + DNI + '}';
    }
    
    @Override
    public String getNombre(){
       return this.getClass().getName();
    }

    int getDNI() {
        return DNI;
    }
}
