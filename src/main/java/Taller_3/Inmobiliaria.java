package Taller_3;

import java.util.*;

public class Inmobiliaria {
	public ArrayList<Venta> venta = new ArrayList<Venta>();
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	public ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
	}

	public void agregarVendedores(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	public void agregarInmueble(Inmueble inmueble) {
		inmuebles.add(inmueble);
	}

	public void eliminarInmueble(Inmueble inmueble) {
		inmuebles.remove(inmueble);
	}

	public List<Inmueble> buscarInmueblePorPrecio(int precio) {
		ArrayList<Inmueble> inmueblesIgualPrecio = new ArrayList<Inmueble>();
		for(Inmueble inmueble:this.inmuebles){
			if(inmueble.getPrecio()==precio){
				inmueblesIgualPrecio.add(inmueble);
			}
		}
		return inmueblesIgualPrecio;
	}

	public List<Inmueble> buscarInmueblePorTipoDeConstruccion(String tipoConstruccion) {
		ArrayList<Inmueble> inmueblesIgualTipo = new ArrayList<Inmueble>();
		for(Inmueble inmueble:this.inmuebles){
			if(inmueble.getTipoConstruccion().equals(tipoConstruccion)){
				inmueblesIgualTipo.add(inmueble);
			}
		}
		return inmueblesIgualTipo;
	}
}