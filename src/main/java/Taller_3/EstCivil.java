package Taller_3;

public enum EstCivil {
	SOLTERO("soltero"),
	CASADO("casado"),
	VIUDO("viudo");

	private String estCivil;

	private EstCivil(String estCivil) {
		estCivil=estCivil;
	}

	public String getestCivil() {
		return this.estCivil;
	}
}