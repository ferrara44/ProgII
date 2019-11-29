package tfi02;

import java.util.*;

public class Facultad implements Informacion{
    
   String nombre;
   TreeSet<Carrera> carreras;   
   
   void agregarCarrera(Carrera carrera){
       this.carreras.add(carrera);
   }
   
   void quitarCarrera(Carrera carrera){
       this.carreras.remove(carrera);
   }
   
   @Override
    public int verCantidad(){
        return this.carreras.size();
    }
    
    @Override
    public String listarContenidos(){
        Iterator<Carrera> iterator = carreras.iterator();
        List contenidos = new ArrayList();
        
        while (iterator.hasNext()){
            contenidos.add(iterator.next());
            contenidos.add("\n");
        }
        
        return contenidos.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TreeSet<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(TreeSet<Carrera> carreras) {
        this.carreras = carreras;
    }

    public void eliminarEstudiante(Estudiante estudiante){
        Iterator<Carrera> iteradorCarreras = carreras.iterator();
        
        while (iteradorCarreras.hasNext()){
            Carrera carreraActual = iteradorCarreras.next();
            Iterator<Materia> iteradorMaterias = carreraActual.materias.iterator();
            while (iteradorMaterias.hasNext()){
                Materia materiaActual = iteradorMaterias.next();
                Iterator<Estudiante> iteradorEstudiantes = materiaActual.estudiantes.iterator();
                while (iteradorEstudiantes.hasNext()){
                    if (estudiante.equals(iteradorEstudiantes.next())){
                        materiaActual.eliminarEstudiante(estudiante);
                    }
                }
            }
        }
    }
}
