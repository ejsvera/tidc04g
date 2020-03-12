package tclases;

public class Prueba {

	public static void main(String[] args) {
		Alumno p1 = new Alumno();
		p1.setId(4);
		p1.setNombre("Alicia");
		
		Alumno p2 = new Alumno(7, "Bastian");

		p1.show();
		p2.show();
		
		
		Profesor m1 = new Profesor();
		m1.setRut(444444);
		m1.setArea("matematicas");
		m1.setCertificado(false);
		
		Profesor m2 = new Profesor(555555,"electricidad", true);
		
		m1.show();
		m2.show();
	}
	
}
