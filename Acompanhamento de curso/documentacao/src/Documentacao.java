public class Documentacao {

    //Código de terminal para gerar documentação em Java (Javadoc)
        //javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        int resultadoOperacao = calculadora.somar(1, 1);

        System.out.println("Resultado da operação: " + resultadoOperacao);
    }
}
