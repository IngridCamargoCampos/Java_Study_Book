package Condicoes;

import java.util.Scanner;

public class scannerInput {
    public static void main(String[] args) {
        // Scanner "input" de Python em Java

        // Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Conf. Nome Ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja =  caixaDeTexto.nextLine(); // guarda o nome do Ninja
        System.out.println("O nome do Ninja: " + nomeDoNinja); // printa o nome do Ninja
        //------------------------------------------------------------------------------

        //Conf. Idade Ninja
        System.out.println("Escreva a Idade de seu Ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do Ninjá é de " + idadeNinja + " anos");
        //------------------------------------------------------------------------------

        // Tratamento de dados
        if ( idadeNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e já pode realizar missoes fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de deixar a aldeia");
        }

        caixaDeTexto.close();
        //Fechar sempre o Scanner
    }
}
