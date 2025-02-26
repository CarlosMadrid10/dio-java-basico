public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatadoString = formatarCep("1848484");

            System.out.println(cepFormatadoString);

        } catch (CepInvalidoException e) {

            System.out.println("O CEP não corresponde com as regras de negóio.");

        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
