package dados;

public abstract class Cliente {

	private int codigo;

	private String nome;

	private double valorLocacao;

	public abstract double calculaDesconto(int quantidadeRobos, double valorLocacao);

}
