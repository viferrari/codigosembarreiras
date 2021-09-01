package Aulas1;

import java.util.Scanner;

public class conteudo_04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("vamos calcular a base do seu retangulo");

        System.out.println("digite o valor base do retangulo");
        double base = in.nextDouble();

        System.out.println("digite altura do rentangulo");
        double altura = in.nextDouble() ;

        System.out.println(" base do seu retnagulo é :" + base * altura);
    }
}
