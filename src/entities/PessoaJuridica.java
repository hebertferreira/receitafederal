package entities;

public class PessoaJuridica  extends Contribuinte{

	private Integer numeroFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}



	public Integer getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(Integer numeroFunc) {
		this.numeroFunc = numeroFunc;
	}
	
	@Override
	public Double impostoArrecadado() {
		
		return null;
	}

	@Override
	public Double impostoPago() {
		double taxaImposto;
		
		if(numeroFunc > 10 ) {
			taxaImposto = 16;
		}else {
			taxaImposto= 14;
		}
		return getRendaAnual() * taxaImposto /100;
	}	

}
