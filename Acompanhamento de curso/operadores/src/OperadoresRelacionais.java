public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "Carlos";
        String nomeDois = new String("Carlos");

        System.out.println(nomeUm == nomeDois); // false: nomeDois é um objeto diferente
        System.out.println(nomeUm.equals(nomeDois)); //true:  Quando comparar textos ou objetos, utilizasse 'equals'


        /*
            int numero1 = 1;
            int numero2 = 2;

            boolean simNao = numero1 == numero2;

            System.out.println("numero1 é igual a numero2? " + simNao);

            simNao = numero1 != numero2;

            System.out.println("numero1 é diferente a numero2? " + simNao);

            simNao = numero1 > numero2;

            System.out.println("numero1 é maior que numero2? " + simNao);
        
            simNao = numero1 < numero2;

            System.out.println("numero1 é menor que numero2? " + simNao);

        */
    }

}
