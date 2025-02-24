package edu.carlosmadrid.primeirasemana;

//Java usa o padrão CamelCase
//Classes devem ser inicializadas com letra maiúscula
//O nome do arquivo deve possuir o nome da classe
//variareis devem ser possuir as iniciais minusculas.
//Quando uma variável for maiúscula, pressupõe-se que seja 'final', uma constante.
//os nomes das constantes (finals) devem ser escritas em snake_case
//Os caracteres permitidos são preferencialmente do alfabeto, números de 0 a 9, _ (underline) e $ (dollar)

public class MinhaClasse {

    // Exemplos de constantes (finals): São imutáveis.
    final String BR = "Brasil";
    final double PI = 3.14;
    final int ESTADOS_BRASILEIROS = 27;
    final int ANO_2000 = 2000;

    //Variávies
    String meuNome = "Carlos";
    int anoFabricacao = 2002;
    boolean verdadeiro = false;


    //Métodos
    // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
    }

    //Método de inicialização
    public static void main(String[] args) {

        String primeiroNome = "Carlos";
        String segundoNome = "Madrid";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }
}
