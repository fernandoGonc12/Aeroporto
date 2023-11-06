package aero;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public abstract class Pessoa implements Verificavel{
	private String nome;
	private String cpf;
	private String rg;
	protected Endereco endereco;
	private String celular;
	private String dataNascimento;
	
	
	public Pessoa(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setRg(rg);
		this.setEndereco(endereco);
		this.setCelular(celular);
		this.setDataNascimento(dataNascimento);
	}
	
	@Override
	public boolean validar(String s) {
		return s.length() == 11 ? true : false;
	}
	
	@Override
	public void solicitarNovo() {
		System.out.printf("CPF invalido\nDigite novamente:");
	}
	
	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getCpf() {
		return cpf;
	}
	
	private void setCpf(String cpf) {
		Scanner sc = new Scanner(System.in);
		while(!validar(cpf)) {
			solicitarNovo();
			cpf = sc.nextLine();
		}
		this.cpf = cpf;
		sc.close();
	}
	
	protected String getRg() {
		return rg;
	}

	private void setRg(String rg) {
		this.rg = rg;
	}

	private Endereco getEndereco() {
		return endereco;
	}

	private void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	private String getCelular() {
		return celular;
	}

	private void setCelular(String celular) {
		this.celular = celular;
	}

	private String getDataNascimento() {
		return dataNascimento;
	}

	private void setDataNascimento(String dataNascimento) {
        String regex = "^(0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[0-2])/(\\d{4})$"; //Expressão regular para o formato de data dd/mm/aaaa
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dataNascimento);
		this.dataNascimento = matcher.matches() ? dataNascimento : null;
	}
	
}
