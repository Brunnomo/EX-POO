// IPI e ICMS possuem aliquotas de 5% e 10% (valoresfict�cios) respectivamente.

public enum ImpostoEnum {
	
 IPI (1.05), ICMS(1.10);
	
	private double valorImposto;

	private ImpostoEnum(double valorImposto) {
		this.valorImposto = valorImposto;
	}
	
	public double getImposto() {
		return valorImposto;
	}
}
