public class TiposVariaveis {

    //Tipos primitivos em Java

    //Tipo | Memória | Intervalo de valor
    //------Inteiros--------------------------------------------------------
    //byte | 1 byte | -128 ~ 128
    //short |2 bytes | -32.768 ~ 32.768
    //int | 4 bytes | -2.147.483.648 ~ 2.147.483.648
    //long | 8 bytes | -9.223.372.036.854.775.808 ~ 9.223.372.036.854.775.808
    //------Fracionados------------------------------------------------------
    //float | 4 bytes | -3,4028E + 38 ~ 3,4028E + 38
    //double | 8 bytes | -1,7976E + 308 ~ 1,7976E + 308

    //O tipo 'int' é o que se tem de mais comum entre os inteiros em Java.
    //O tipo 'double' é o que se tem de mais comum entre os fracionados em Java.


    public static void main(String[] args) throws Exception {

        byte idade = 123;
        short ano = 2021;
        int cep = 16547836; //Se começar com zero, talvez tenha-se que utilizar strings.
        long cpf = 16558647851L; //Se começar com zero, talvez tenha-se que utilizar strings.
        float pi = 3.14F;
        double salario = 1544.46;

        //Long deve possuir um 'L' ao final do número.
        //Float deve possuir um F ao final do número.


        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Processo de Casting

        //Processo de Casting: Possibilita a adaptação entre tipos. Não é comum que se adicione uma precisão menor a um número, mas caso ocorra, se estará ciente de que poderá ocorrer algum futuro erro.


        //Variáveis
        int numero = 5;
        numero = 10;
        
        //Constantes
        final int NUMERO = 5; //Não pode ser modificada


    }
}
