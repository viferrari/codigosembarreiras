package Aula2;

import java.util.Scanner;

public class conteudo_01 {

    public static void main(String[] args) {


        Scanner in = new Scanner (System.in);

        System.out.println("numero digitado");
        int numero = in.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        }
            else {
                System.out. println("Numero impar");

                in.close();

            }

    }
}