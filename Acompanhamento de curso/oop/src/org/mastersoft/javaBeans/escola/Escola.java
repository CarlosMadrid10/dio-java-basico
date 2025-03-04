package org.mastersoft.javaBeans.escola;

//Set: define ou modifica o valor de um atributo
//Get: captura o valor de um atributo
//Getters e Setters devem ser públicos.
//É comum utilizar getters e setters em classes que possuam atributos privados.

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");		
	}
}
