
package tf01rec;

/**
 *
 * @author kartdei
 */
public class Vehiculo extends Automovil{

    @Override
    String verDatos(){
        return "Vehiculo{" + '}';
    }
    
    @Override
    void setChofer(Chofer chofer){
        this.chofer = chofer;
    }
        
    @Override
    void setDestino(Destino destino){
        this.destino = destino;
    }
    
    @Override
    void setListaPasajeros(ListaPasajeros[ ] pasajeros){
        this.listapasajeros = pasajeros;
    }

    public Vehiculo(String matricula, int capacidad, ListaPasajeros lista) {
        this.matricula = matricula;
        this.capacidad = capacidad;
    }
    
}
