package application;

public class Aeroporto {
	private String codAeroporto;
	private Endereco endereco;
	
	public Aeroporto(String codAeroporto, Endereco endereco) {
		this.setCodAeroporto(codAeroporto);
		this.setEndereco(endereco);
	}

	private String getCodAeroporto() {
		return codAeroporto;
	}

	private void setCodAeroporto(String codAeroporto) {
		this.codAeroporto = codAeroporto;
	}

	private Endereco getEndereco() {
		return endereco;
	}

	private void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aeroporto [codAeroporto=" + codAeroporto + ", endereco=" + endereco + "]";
	}
	
	
	
}
