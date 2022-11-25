package Taller_3;

public class Vendedor extends Personas {
	private String titulo;
	private String estCivil;
	public Inmobiliaria inmobiliaria;
	private EstCivil estado_civil;

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEstCivil() {
		return this.estCivil;
	}

	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}

	public Vendedor(String nombre, String rut, String direccion, String titulo, String estCivil) {
		super(nombre, rut, direccion);
		this.titulo=titulo;
		this.estCivil=estCivil;
	}

	public String toString() {
		return this.nombre+","+this.rut+","+this.direccion+","+this.titulo+","+this.estCivil;
	}

	public String getTipo() {
		return "vendedor";
	}
}