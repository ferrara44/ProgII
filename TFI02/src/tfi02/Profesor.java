package tfi02;

public class Profesor extends Persona {
    
    double basico;
    int antiguedad;
    
    double calcularSueldo(){
        double sueldo = basico + basico * 0.1 * antiguedad;
        return sueldo;
    }
    

    public Profesor(double basico, int antiguedad) {
        this.basico = basico;
        this.antiguedad = antiguedad;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

  
    
}
