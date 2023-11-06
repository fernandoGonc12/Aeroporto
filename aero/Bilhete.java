package aero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bilhete<T extends Comparable<T>> {
	private T numBilhete;
	private List<Passagem> listPassagem = new ArrayList<Passagem>();
	private double preco;
	private CompanhiaAerea compAerea;
	
	public Bilhete(T numBilhete, List<Passagem> listPassagem, double preco, CompanhiaAerea compAerea) {
		this.numBilhete = numBilhete;
		this.listPassagem = listPassagem;
		this.preco = preco;
		this.compAerea = compAerea;
		Collections.sort(this.listPassagem);
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
