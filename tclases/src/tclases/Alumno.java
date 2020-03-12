package tclases;

public class Alumno implements Persona{

	private int id;
	private String nombre;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public Alumno() {
	}

	@Override
	public void show() {
		System.out.println("Alumno Id     : " + id);
		System.out.println("Alumno Nombre : " + nombre);
		System.out.println("-------------------------------");		
	}
	
}
