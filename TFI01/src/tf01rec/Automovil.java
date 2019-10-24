
package tf01rec;

/**
 *
 * @author kartdei
 */
abstract class Automovil implements ParaMostrar{
    
    Lugares origen;
    Lugares destino;
    Chofer chofer;
    ListaPasajeros listapasajeros[];
    String matricula;
    int capacidad;
    
    abstract String verDatos();
    abstract void setChofer(Chofer chofer);
    abstract void setDestino(Destino destino);
    abstract void setListaPasajeros(ListaPasajeros[ ] pasajeros);

    @Override
    public String toString() {
        return "Automovil{" + "origen=" + origen + ", destino=" + destino + ", chofer=" + chofer + ", listapasajeros=" + listapasajeros + ", matricula=" + matricula + ", capacidad=" + capacidad + '}';
    }

    @Override
    public String getNombre(){
       return this.getClass().getName();
    }
}
