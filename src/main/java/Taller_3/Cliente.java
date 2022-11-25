package Taller_3;


public class Cliente extends Personas {

    public Cliente(String nombre, String rut, String direccion) {
        super(nombre,rut,direccion);
    }

    public String toString() {
        return this.nombre+","+this.rut+","+this.direccion;
    }

    public String getTipo() {
        return "cliente";
    }
}