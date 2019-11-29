package tfi02;

import java.util.*;

public class Materia implements Informacion{
    
    String nombre;
    Profesor titular;
    TreeSet<Estudiante> estudiantes;
    
    void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    void eliminarEstudiante(Estudiante estudiante){
        estudiantes.remove(estudiante);
    }
    
    void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }
    
    @Override
    public int verCantidad(){
        return this.estudiantes.size();
    }
    
    @Override
    public String listarContenidos(){
        Iterator<Estudiante> iterator = estudiantes.iterator();
        List contenidos = new ArrayList();
        
        while (iterator.hasNext()){
            contenidos.add(iterator.next());
            contenidos.add("\n");
        }
        
        return contenidos.toString();
    }

    public Materia(String nombre, Profesor titular, TreeSet<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public TreeSet<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(TreeSet<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    
}
