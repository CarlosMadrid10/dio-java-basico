import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

        
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

            terminal.close();
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior do que o primeiro e ambos parâmetros devem ser maiores do que zero.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

		if (parametroUm >= parametroDois && parametroUm >= 0 && parametroDois >= 0) throw new ParametrosInvalidosException();
        else {

            int contagem = parametroDois - parametroUm;

            System.out.println("Número de interações: " + contagem);

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i+1));
            }
    
        }
	}
}

