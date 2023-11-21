package application;

import java.util.Calendar;

public class Voo {
	private String numVoo;
	private Aeroporto origem;
	private Aeroporto destino;
	private Calendar dataHoraOrigem;
	private Calendar dataHoraDestino;
	private int capacidade;
	private int qtdPassageiros;
	
	public Voo(String numVoo, Aeroporto origem, Aeroporto destino, Calendar dataHoraOrigem, Calendar dataHoraDestino, int capacidade) {
		this.setNumVoo(numVoo);
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setDataHoraOrigem(dataHoraOrigem);
		this.setDataHoraDestino(dataHoraDestino);
		this.setCapacidade(capacidade);
		this.setQtdPassageiros(0);
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	private void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	private String getNumVoo() {
		return numVoo;
	}

	private void setNumVoo(String numVoo) {
		this.numVoo = numVoo;
	}

	private Aeroporto getOrigem() {
		return origem;
	}

	private void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}

	private Aeroporto getDestino() {
		return destino;
	}

	private void setDestino(Aeroporto destino) {
		this.destino = destino;
	}

	private Calendar getDataHoraOrigem() {
		return dataHoraOrigem;
	}

	private void setDataHoraOrigem(Calendar dataHoraOrigem) {
		this.dataHoraOrigem = dataHoraOrigem;
	}

	private Calendar getDataHoraDestino() {
		return dataHoraDestino;
	}

	private void setDataHoraDestino(Calendar dataHoraDestino) {
		this.dataHoraDestino = dataHoraDestino;
	}

	public int getCapacidade() {
		return capacidade;
	}

	private void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		return "Voo [numVoo=" + numVoo + ", origem=" + origem + ", destino=" + destino + ", dataHoraOrigem="
				+ dataHoraOrigem.getTime() + ", dataHoraDestino=" + dataHoraDestino.getTime() + ", capacidade=" + capacidade + "]";
	}
}
