package Aulas1;

import java.util.Scanner;

public class conteudo_03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Integer numero = in.nextInt();
        System.out.println("O antecessor do número é : ");
        System.out.println(numero - 1);


        in.close();
    }
}
