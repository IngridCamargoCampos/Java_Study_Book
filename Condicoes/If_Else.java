package Condicoes;

public class If_Else {
    public static void main(String[] args) {

        // Iniciar VAR sem declarar valor>
        String rank;

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        //Estrutura de If-Java>>

        if (numeroDeMissoes >= 10 && idade > 15) { // && -> e também VAR(idade) + condicional
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennim");
        }
        // else-if >>> elif de python

    }
}

                /* Using If-lse
        * OBJETIVO: LevelUp Ninja as N.Mission *

     * <<<<<<<<<<<<<<<<< Estrutura de If/Else >>>>>>>>>>>>>>>

     * if ( var + condição ) {
     *      >'SOUT'<;
     *  } else {
     *      >'SOUT'<;
     * }
         */