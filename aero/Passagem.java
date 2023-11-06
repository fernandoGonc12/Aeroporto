package aero;

public class Passagem implements Comparable<Passagem>{
	private String numero;
	private Voo vooIda;
	private Voo vooVolta;
	public Passageiro passageiro;
	private String assento;
	
	public Passagem(String numero, Voo vooIda, Voo vooVolta, Passageiro passageiro, String assento) {
		this.setNumero(numero);
		
		if(verificaCapacidade(vooIda)) {
			this.setVooIda(vooIda);
		}
		
		if(verificaCapacidade(vooVolta)) {
			this.setVooVolta(vooVolta);
		}
		
		this.setPassageiro(passageiro);
		this.setAssento(assento);
	}
	
	public Passagem(String numero, Voo vooIda, Passageiro passageiro, String assento) {
		this.setNumero(numero);
		this.setVooIda(vooIda);
		this.setPassageiro(passageiro);
		this.setAssento(assento);
	}
	
	public boolean verificaCapacidade(Voo v) {
		boolean g = v.getQtdPassageiros() < v.getCapacidade() ? true:false;
		if(!g) {System.out.println("Voo sem disponibilidade");}
		return g;
	}

	private String getNumero() {
		return numero;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	private Voo getVooIda() {
		return vooIda;
	}

	private void setVooIda(Voo vooIda) {
		this.vooIda = vooIda;
	}

	private Voo getVooVolta() {
		return vooVolta;
	}

	private void setVooVolta(Voo vooVolta) {
		this.vooVolta = vooVolta;
	}

	private Passageiro getPassageiro() {
		return passageiro;
	}

	private void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	private String getAssento() {
		return assento;
	}

	private void setAssento(String assento) {
		this.assento = assento;
	}
	
	@Override
	public int compareTo(Passagem p2) {
		return this.passageiro.getNome().compareTo(p2.passageiro.getNome());
	}
}
