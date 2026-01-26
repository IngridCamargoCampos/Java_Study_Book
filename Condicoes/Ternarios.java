package Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /* Ternários: Maneira de reduzir o código, If-Else Premium
        *
        * Estrutura:   var = (condição) ? printIftrue : printIfFalse
         */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse Ninja está com mais de 10 missões " : "Esse ninja tem menos de 10 missões ";
        System.out.println(numeroDeMissoes);
    }
}
