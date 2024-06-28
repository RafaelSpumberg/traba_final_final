package dados;

public class Empresarial extends Cliente {

	private int ano;

	public Empresarial (){
		this.ano = ano;
	}

	public int getAno(){
		return ano;
	}

	@Override
	public double calculaDesconto(int quantidadeRobos, double valorLocacao) {
		if(quantidadeRobos >= 2 && quantidadeRobos <= 9){
			return valorLocacao*0.03;
		} else if (quantidadeRobos >= 10) {
			return valorLocacao*0.07;
		}
		return 0;
	}
}
