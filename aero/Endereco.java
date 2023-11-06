package aero;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String cep;
	
	public Endereco(String rua,int numero, String bairro, String cidade, String cep) {
		this.setRua(rua);
		this.setNumero(numero);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setCep(cep);
	}
	
	public Endereco(String cidade) {
		setCidade(cidade);
	}
	
	private String getRua() {
		return rua;
	}
	private void setRua(String rua) {
		this.rua = rua;
	}
	private int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero > 0 ? numero : null;
	}
	private String getBairro() {
		return bairro;
	}
	private void setBairro(String bairro) {
		this.bairro = bairro;
	}
	private String getCidade() {
		return cidade;
	}
	private void setCidade(String cidade) {
		this.cidade = cidade;
	}
	private String getCep() {
		return cep;
	}
	private void setCep(String cep) {
		this.cep = cep.length() == 8 ? cep:null;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", cep="
				+ cep + "]";
	}
	
}
