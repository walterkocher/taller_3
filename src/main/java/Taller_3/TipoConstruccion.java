package Taller_3;

public enum TipoConstruccion {
	MADERA("madera"),
	CEMENTO("cemento"),
	HORMIGON("hormigon"),
	ALUMINIO("aluminio");
	private String tipoConstruccion;

	private TipoConstruccion(String tipoConstruccion) {
		tipoConstruccion=tipoConstruccion;
	}

	public String getTipoConstruccion() {
		return this.tipoConstruccion;
	}
}