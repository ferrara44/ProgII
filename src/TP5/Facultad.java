package TP5;

import java.util.Scanner;
/*
 * Facultad, con los siguientes métodos
 *Constructor con nombre del colegio y cantidad máxima de estudiantes.
 *Agregar estudiantes a la Facultad. 
 *Listar todos los estudiantes que se encuentran en ella. 
 *Buscar un estudiante por medio de su nombre. 
 *Cada vez que se cree un estudiantes para la Facultad este tendrá un número de
 *estudiantes asignado que debe ser consecutivo y no repetitivo. 
 *Borrar Estudiantes.
 *Modificar la nota media de un Estudiante, ingresando su nombre y la nueva nota media.
 */

public class Facultad {

	private int id;
	private static int countId=1;
	private String collegeName;
	private int maxStudents;
	private Estudiantes[] students;
	
	public Facultad(String collegeName, int maxStudents) {
		this.id = this.countId;
		this.countId++;
		this.collegeName = collegeName;
		this.maxStudents = maxStudents;
		this.students = new Estudiantes[maxStudents];
	}
	
	public void CreateCollege() {
		
	}
	
	public void CargarAlumnos(){
		for (int i=0 ; i<students.length ; i++ ) {
			System.out.println("Please enter a name for the student");
			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			System.out.println("Please enter this student's average");
			double average = scan.nextDouble();
			students[i] = new Estudiantes(name, average);
		}
	}
}
