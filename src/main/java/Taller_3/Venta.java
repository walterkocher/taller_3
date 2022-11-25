package Taller_3;

public class Venta {
    public Cliente cliente;
    public Inmueble inmueble;
    public Vendedor vendedor;

    public Venta( Cliente cliente, Inmueble inmueble, Vendedor vendedor){
        this.cliente=cliente;
        this.vendedor=vendedor;
        this.inmueble=inmueble;
    }

}