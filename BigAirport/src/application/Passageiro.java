package application;

public class Passageiro extends Pessoa{
	private String numPassaporte;
	
	public Passageiro(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento, String numPassaporte) {
		super(nome, cpf, rg, endereco, celular, dataNascimento);
		setNumPassaporte(numPassaporte);
	}

	public String getNumPassaporte() {
		return numPassaporte;
	}

	private void setNumPassaporte(String numPassaporte) {
		this.numPassaporte = numPassaporte;
	}

	@Override
	public String toString() {
		return "Passageiro [numPassaporte=" + numPassaporte + this.endereco.toString() +"]";
	}
	
	
}
