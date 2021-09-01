import java.util.Scanner;

public class conteudo_03 {
    public static void main(String[] args) {
        // Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor.
        Scanner in = new Scanner(System.in);

        System.out.println("digite um número A");
        int A = in.nextInt();
        System.out.println("digite um número B");
        int B = in.nextInt();
        if (A > B) {
            System.out.println("número A maior");
        }
        else {
            System.out.println("número B maior ");

            in.close();
        }
    }
}
