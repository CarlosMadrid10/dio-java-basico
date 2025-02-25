// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        // Array: conjunto de elementos de um tipo correspondente
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma Padrão
        /*
         * for (int x=0; x<alunos.length; x++) {
         * System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
         * }
         */

        // ForEach
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}