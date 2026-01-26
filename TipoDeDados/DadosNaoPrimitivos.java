package TipoDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // dados NÃO PRIMITVOS podem receber MÉTODOS

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir métodos ao ninja.
         */

        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); // ToUppercase turns all CAPSLOCK
        // -> Declaração d Var <- //
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeToUpperCase);
        System.out.println(nome);
        // -> Print() das var <-   //

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaEmMinusculo = aldeia.toLowerCase(); // to MINUSCULO
        System.out.println(aldeiaEmMinusculo);





    }
}
