
package tfi01;

/**
 *
 * @author kartdei
 */
public class Acomodadores extends Empleados implements ParaAcomodadores {
    
    Salas sala;
    
    public Acomodadores(String nombre, int edad, int sueldo) {
        super(nombre, edad, sueldo);
    }
    
    public Acomodadores(String nombre, int edad, int sueldo, Salas sala) {
        super(nombre, edad, sueldo);
        this.sala = sala;
    }
    
    @Override
    public Salas getSala(){
        return this.sala;
    }
    
    @Override
    public void setSala(Salas sala){
        this.sala = sala;
    }
}
