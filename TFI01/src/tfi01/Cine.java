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
        //Al pedir nextInt, el programa finalizará si no recibe un entero.

        Espectadores Espectador = new Espectadores(nombre,edad, fila, silla);
    }
    

    
    Salas sala01 = new Salas(3,"sala01");
}