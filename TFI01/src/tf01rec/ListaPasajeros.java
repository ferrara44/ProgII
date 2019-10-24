
package tf01rec;

import java.util.ArrayList;
/**
 *
 * @author kartdei
 */
public class ListaPasajeros extends Personas{
    
    int cantidad;
    ArrayList<Object> ListaPasajeros;

    public ListaPasajeros(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setListaPasajeros(ArrayList<Object> ListaPasajeros) {
        this.ListaPasajeros = ListaPasajeros;
    }
    
    ArrayList<Object> getListaPasajeros() {
        return ListaPasajeros;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
}
