package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilhete<T extends Comparable<T>> {
	private T numBilhete;
	private List<Passagem> listPassagem = new ArrayList<Passagem>();
	private double preco;
	private CompanhiaAerea compAerea;
	
	public Bilhete(T numBilhete, List<Passagem> listPassagem, double preco, CompanhiaAerea compAerea) {
		this.setNumBilhete(numBilhete);
		this.setListPassagem(listPassagem);
		this.setPreco(preco);
		this.setCompAerea(compAerea);
		Collections.sort(this.listPassagem);
	}

	public T getNumBilhete() {
		return numBilhete;
	}

	public void setNumBilhete(T numBilhete) {
		this.numBilhete = numBilhete;
	}

	public List<Passagem> getListPassagem() {
		return listPassagem;
	}

	public void setListPassagem(List<Passagem> listPassagem) {
		this.listPassagem = listPassagem;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public CompanhiaAerea getCompAerea() {
		return compAerea;
	}

	public void setCompAerea(CompanhiaAerea compAerea) {
		this.compAerea = compAerea;
	}

	@Override
	public String toString() {
		List<String> listaNomesPassageiros = new ArrayList<String>();
		
		for(Passagem p : this.listPassagem) {
			listaNomesPassageiros.add(p.passageiro.getNome());
		}
		
		return "Bilhete [numBilhete=" + numBilhete + ", listPassagem=" + listaNomesPassageiros.toString() + ", preco=" + preco
				+ ", compAerea=" + compAerea + "]";
	}
	
	
}
