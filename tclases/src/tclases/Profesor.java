package tclases;

public class Profesor implements Persona {
	
	private int rut;
	private String area;
	private boolean certificado;
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public boolean isCertificado() {
		return certificado;
	}
	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	public Profesor(int rut, String area, boolean certificado) {
		super();
		this.rut = rut;
		this.area = area;
		this.certificado = certificado;
	}
	public Profesor() {
	}
	@Override
	public void show() {
		System.out.println("Profesor rut         : " + rut);
		System.out.println("Profesor area        : " + area);
		System.out.println("Profesor certificado : " + certificado);
		System.out.println("******************************");
	}
}
