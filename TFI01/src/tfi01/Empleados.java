
package tfi01;

import static java.lang.String.valueOf;

/**
 *
 * @author kartdei
 */
public class Empleados extends Personas{

    int sueldo;
    
    public Empleados(String nombre, int edad, int sueldo) {
        this.edad = edad;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String getTipo() {
        return ("Empleado");
    }

    @Override
    public String toStr() {
        return valueOf(this);
    }

}
