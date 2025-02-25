// class ExemploBreakContinue.java
public class ExemploBreakContinue {
    public static void main(String[] args) {

        // Uso de 'break'
        /*
         * for(int numero = 1; numero <=5; numero ++){
         * if(numero==3)
         * break; //Para a execução do loop
         * 
         * System.out.println(numero);
         * 
         * }
         */

        // Uso de 'continue'

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue; // Muda o fluxo da iteração, desconsiderando o 3 sem parar o loop

            System.out.println(numero);

        }

    }
}