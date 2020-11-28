package entities;

public class PessoaFisica extends Contribuinte{
	
	private Double gastoSaude;
	
	public PessoaFisica() {
		
	}	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double impostoArrecadado() {
		
		return null;
	}

	@Override
	public Double impostoPago() {
		double taxaImposto;
		double valorTotalImpostos;
		if (getRendaAnual() <= 20000) {
			
			taxaImposto = 15;
			
		}else {
			
			taxaImposto = 25;	
		}
		if(gastoSaude > 0) {
			valorTotalImpostos =  (getRendaAnual() * taxaImposto /100) - (gastoSaude  * 50 /100); 
		}
		else {
			valorTotalImpostos = getRendaAnual() * taxaImposto /100; 
		}
		
		return valorTotalImpostos;
		
	}
}