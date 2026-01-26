package TipoDeDados;

public class Array_2D {
    public static void main(String[] args) {

        /*ARRAY 2D como matriz (3x3) : Array{Array[array()]]}*/
        /* 0 1 2
           3 4 5         >>> Array 2D
           6 7 8 */

        String [] ninjas = new String[3];
        ninjas [0] = "Naruto Uzumaki";
        ninjas [1] = "Sasuke Uchiha";
        ninjas [2] = "Sakura Haruno";

        System.out.println(ninjas[0]);

        for (int i =0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }
    /*Acima Array normal ^^^^^^*/

        String [][] ninjasEAldeia = new String[3][3];

        ninjasEAldeia[0][0] = "Konoha"; /* []> 1ra linha [] 1ra coluna*/
        ninjasEAldeia[0][1] = "Naruto Uzumaki";
        ninjasEAldeia[0][2] = "Sasuke Uchiha";

        ninjasEAldeia[1][0] = "Nevoa";
        ninjasEAldeia[1][1] = "Zabuza";
        ninjasEAldeia[1][2] = "Haku";

        ninjasEAldeia[2][0] = "Deserto";
        ninjasEAldeia[2][1] = "Gaara";
        ninjasEAldeia[2][2] = "Temari";

        for (int i =0; i < ninjasEAldeia.length; i++) {
            System.out.println(ninjasEAldeia[i][0] +"");

    /*Array multi-dimensionais ^^^^*/
        }
    }
}
