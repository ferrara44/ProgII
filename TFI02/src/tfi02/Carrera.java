package tfi02;

import java.util.*;

public class Carrera implements Informacion {
    
    String nombre;
    TreeSet<Materia> materias;
    
     void agregarEstudiante(Materia materia){
        materias.add(materia);
    }
    
    void eliminarEstudiante(Materia materia){
        materias.remove(materia);
    }
    
    @Override
    public int verCantidad(){
        return this.materias.size();
    }
    
    @Override
    public String listarContenidos(){
        Iterator<Materia> iterator = materias.iterator();
        List contenidos = new ArrayList();
        
        while (iterator.hasNext()){
            contenidos.add(iterator.next());
            contenidos.add("\n");
        }
        
        return contenidos.toString();
    }

    public Carrera(String nombre, TreeSet<Materia> materias) {
        this.nombre = nombre;
        this.materias = materias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(TreeSet<Materia> materias) {
        this.materias = materias;
    }
    
    public void encontrarMateria(String nombre){
        Iterator<Materia> iterator = materias.iterator();
        Scanner scan = new Scanner(System.in);
        int loop = 1;
        
        while (iterator.hasNext()){
            if (nombre.equals(iterator.next().getNombre())){
                Materia selection = iterator.next();
                System.out.println("Materia '" + nombre + "' encontrada. Desea Eliminarla? (Y/N)" );
                while (loop == 1){
                    String input = scan.next();
                    char answer = input.charAt(0);
                    switch (answer) {
                        case 'Y':
                        case 'y':
                            materias.remove(selection);
                            System.out.println("Materia eliminada." );
                            loop = 0;
                            break;
                        case 'N':
                        case 'n':
                            System.out.println("Se mantiene la materia en el plan." );
                            loop = 0;
                            break;
                        default:
                            System.out.println("Valor ingresado incorrecto, vuelva a intentar.");
                            loop = 1;
                            break;
                    }
                }
            }
        }
    }
    
}
