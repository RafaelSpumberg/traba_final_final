package dados;

public class Agricola extends Robo {

	private double area;

	private String uso;

	public Agricola(){
		this.area = area;
		this.uso = uso;
	}

	public double getArea(){
		return area;
	}

	public String getUso(){
		return uso;
	}

	@Override
	public double calculaLocacao(int dias, double valorDiario) {
		valorDiario = 10*getArea();

		return dias * valorDiario;
	}
}
