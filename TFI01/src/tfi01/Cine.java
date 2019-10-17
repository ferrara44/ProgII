package tfi01;

import java.util.Scanner;

/**
 *
 * @author kartdei
 */

public class Cine {
    
    Scanner scan = new Scanner(System.in);
    
    
    public void cargarEspectadores (){
        System.out.println("Nombre:");
        String nombre = scan.next();
        System.out.println("Edad:");
        int edad = scan.nextInt();
        System.out.println("Fila:");
        String fila = scan.next();
        System.out.println("Silla:");
        int silla = scan.nextInt();
        
        Espectadores Espectador = new Espectadores(nombre,edad, fila, silla);
    }
}
