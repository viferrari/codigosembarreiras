package Aulas1;

import java.util.Scanner;

public class conteudo_05 {

    public static void main(String[] args) {



        //Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
        // nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
        Scanner in = new Scanner(System.in);

        System.out.println("quantidade total de eleitores");
        int totalEleitores = in.nextInt();

        System.out.println("quantidade total de brancos");
        int totalBrancos = in.nextInt();

        System.out.println("quantidade total de nulos");
        int totalNulos = in.nextInt();

        System.out.println("quantidade total de validos");
        int totalvalidos = in.nextInt();

        System.out.println("Porcentagem nulo :" + totalNulos * 100 / totalEleitores);
        System.out.println("Porcentagem brancos :" + totalBrancos * 100 / totalEleitores);
        System.out.println("Porcentagem validos :" + totalvalidos * 100 / totalEleitores);

        in.close();
    }
}
