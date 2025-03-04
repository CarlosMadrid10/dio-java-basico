package org.mastersoft.construtores;

public class Pessoa {

	private String nome;
	private String cpf;
	private String endereco;
	
	
	//Em Java, é importante não abusar do uso de construtores. É comum e uma boa prática utilizá-los apenas com os atributos neceesários para a criação do objeto.
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?

}
