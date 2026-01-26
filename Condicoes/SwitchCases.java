package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        * SwitchCases: Serve para gerar casos específicos (condição de menu)
        * Objetivo: Dar opções de personagem, e a partir disso entregar x,y,z código
         */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println(" [1] Naruto Uzumaki");
        System.out.println(" [2] Sasuke Uchiha");
        System.out.println(" [3] Sakura Haruno");

        // Pedir p o U escolher um Char
        int escolhaDoUsuario = caixaDeTexto.nextInt();

        System.out.println("Você digitou o número: " +escolhaDoUsuario);

        //Reação escolha do personagem

        switch (escolhaDoUsuario) {
            case 1:
            System.out.println("Usuário escolheu o Naruto Uzumaki, o próximo Hokage");
                break;
            case 2:
                System.out.println("Usuário escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("Usuário escolheu a Sakura Haruno, a personagem mais legal");
                break;
            default:  // else de Swich Cases
                System.out.println("Resposta invalida, tente novamente!");
        }

        caixaDeTexto.close();
    }
}
