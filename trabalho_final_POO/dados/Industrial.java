package dados;

public class Industrial extends Robo {

	private String setor;

	public Industrial(){
		this.setor = setor;
	}

	public String getSetor(){
		return setor;
	}

	@Override
	public double calculaLocacao(int dias,  double valorDiario) {
		valorDiario = 90;
		return dias * valorDiario;
	}
}
