package dados;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Locacao {

	private int numero;
	private Status situacao;
	private Date dataInicio;
	private int dataFim;
	ArrayList<Robo> robos = new ArrayList<>();

	public Locacao(){
		this.numero = numero;
		this.situacao = situacao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.situacao = situacao;
	}

	public int getNumero() {
		return numero;
	}

	public Status getSituacao() {
		return situacao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void adicionarRobo(Robo robo) {
		robos.add(robo);
		if (situacao == Status.CADASTRADA) {
			situacao = Status.EXECUTANDO;
		}
	}

	public double calculaValorFinal() {

		//valor final da locação = valor da locaçõa de robo - desconto de cliente
		//int dias = dataFim - dataInicio;
		double valorLocacao = 0;

		return 0; // valorFinalDaLocacao;
	}

	public void finalizar() {
		if (situacao == Status.EXECUTANDO) {
			situacao = Status.FINALIZADA;
		}
	}

	public void cancelar() {
		situacao = Status.CANCELADA;
	}

}
