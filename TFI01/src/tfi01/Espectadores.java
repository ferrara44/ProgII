
package tfi01;

import static java.lang.String.valueOf;

/**
 *
 * @author kartdei
 */
class Espectadores extends Personas{
    
    String fila;
    int silla;
    
    @Override
    public String getTipo() {
        return ("Espectador");
    }

    @Override
    public String toStr() {
        return valueOf(this);
    }

    public Espectadores(String nombre, int edad, String fila, int silla) {
        this.nombre = nombre;
        this.edad = edad;
        this.fila = fila;
        this.silla = silla;
    }
    
    public String getButaca(){
        return (this.fila + ' ' + this.silla);
    }
    
//        public static void main(String[] args){
//            Espectadores Juan = new Espectadores("Juan", 20, "A", 42);
//            System.out.println(Juan.getButaca());
//            System.out.println(Juan.toStr());
//        }
}
