package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
		}

	}
	
	
	static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		
		do {
			
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("O CONTATO FOI REALIZADO COM SUCESSO!");
			
			
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if (atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " tentativa.");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS (" + tentativasRealizadas + ") REALIZADAS");
	}
	
	static boolean atender () {
		return new Random().nextInt(3)==1;
	}
	
	
	static void imprimirSelecionados () {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos selecionados");
		
		for (String candidato : candidatos) {
			System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
		}
		
		
	}
	
	static void selecaoCandidatos () {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
	
		int candidatosSelecionados = 0;
		
		int candidatosAtual = 0;
		
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDADO COM UMA CONTRA-PROPOSTA");
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
			
	}

}
