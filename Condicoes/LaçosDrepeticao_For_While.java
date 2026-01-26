package Condicoes;

public class LaçosDrepeticao_For_While {
    public static void main(String[] args) {

        /* Laços de Repetição:
        * Repetir infinitamente x ou até atingir o parâmetro desejado

        * WHILE - FOR
         */
      // ----------------------WHILE--------------------------
      // modelo:   while (condição) be T {tudo aqui vai acontecer}

        int numeroClones = 0;
        int numeroMaxClones = 40;

        while (numeroClones <= numeroMaxClones) {
            numeroClones ++; // var NumeroClones + 1 p/ n entrar em looping infinito
            System.out.println(" O naruto fez um clone das sombras" + numeroClones);
        }

        //    -------------------FOR----------------------------

        for (int i = 0; i <= numeroMaxClones; i++) { // While i < 40; será i +1 -- While PREMIUM
            System.out.println("O Naruto está se clonando e já se clonou" + i);
        }

    }
}
