package dados;

public class Individual extends Cliente {

	private String cpf;

	public Individual(){
		this.cpf = cpf;
	}

	public String getCpf(){
		return cpf;
	}

	@Override
	public double calculaDesconto(int quantidadeRobos, double valorLocacao) {
		if( quantidadeRobos > 1) {
			return valorLocacao * 0.05;
		}
		return 0;
	}
}
