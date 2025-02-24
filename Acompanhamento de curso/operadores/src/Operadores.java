//Importações
import java.util.Date;

public class Operadores {


    //Atribuição | '='
        //Exemplos:
            double soma = 10.5;
        //Atribuição de classes:
            Date data = new Date();
        


    //Aritméticos
    //-----------------
        //soma: + 
        //subtração: -
        //multiplicação: *
        //divisão: /
        //módulo: %    
    //-----------------
    // + realiza a concatenação em casos de textos

    
    public static void main(String[] args) throws Exception {

        //qual o resultado das expressoes abaixo?
            String concatenacao ="?";
            System.out.println(concatenacao);

            concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);

            concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);

            concatenacao = "1"+1+1+1;
            System.out.println(concatenacao);

            concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao);

        
    }
}
