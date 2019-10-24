
package tf01rec;


import java.util.Scanner;
/**
 *
 * @author kartdei
 */
public class GestionViajes {
    Scanner scan = new Scanner(System.in);
    Chofer chofer;
    Vehiculo vehiculo;
    ListaPasajeros lista;
    

    void CrearChofer() {
        System.out.println("Nombre:");
        String nombre = scan.next();
        System.out.println("DNI:");
        int DNI = scan.nextInt();
        chofer = new Chofer(nombre, DNI);
    }
    
    void crearVehiculo(){
        System.out.println("Matricula:");
        String matricula = scan.next();
        System.out.println("capacidad:");
        int capacidad = scan.nextInt();
        vehiculo = new Vehiculo(matricula, capacidad, lista);
    }
    
    void crearListaPasajeros(){
        System.out.println("Indique cuantos pasajeros desea cargar:");
        int cantidad = scan.nextInt();
        lista = new ListaPasajeros(cantidad);
    }
 
    void asignarChofer(){
        
    }
    
    void asignarLista(){
        
    }
    
    void asignarOrigen(){
        
    }
    
    void asignarDestino(String nombre, String direccion){
        
    }
}
