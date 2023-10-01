package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private String email;
	private int idade;
	private double valorConsulta;
	private Endereco endereco; //classe e atributo (atributo de referência) cliente NÃO É endereço, ele TEM endereço
	//fazer get e set do endereço
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getValorConsulta() {
		return valorConsulta;
	}
	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	
	
}
