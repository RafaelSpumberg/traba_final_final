package dados;

public class Domestico extends Robo {

	private int nivel;

	public Domestico (int nivel, int id, String modelo, double valorDiario){

		this.nivel = nivel;

		switch (nivel) {
			case 1:
				valorDiario = 10.0;
				break;
			case 2:
				valorDiario = 20.0;
				break;
			case 3:
				valorDiario = 50.0;
				break;
		}
	}

	public int getNivel(){
		return nivel;
	}

	@Override
	public double calculaLocacao(int dias, double valorDiario) {
		return dias * valorDiario;
	}
}
