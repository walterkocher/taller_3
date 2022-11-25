package Taller_3;

public abstract class Personas {
	public String nombre;
	public String rut;
	public String direccion;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public abstract String getTipo();

	public Personas(String nombre, String rut, String direccion) {
		this.nombre=nombre;
		this.rut=rut;
		this.direccion=direccion;
	}
}