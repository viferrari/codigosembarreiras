

    import java.util.Scanner;

    public class conteudo_09  {


        public static void resolucao1() {
            // Construa um algoritmo usando uma estrutura de repetição que
            // calcule o fatorial de um número.


            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o número que deseja saber o fatorial?");
            int numero = scanner.nextInt();

            long fatorial = 1;

            while (numero > 1) {
                fatorial = fatorial * numero;
                numero = numero - 1;
            }

            System.out.printf("O fatorial é %d", fatorial);

            scanner.close();
        }

        public static void resolucao2() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o número que deseja saber o fatorial?");
            int numero = scanner.nextInt();

            long fatorial = 1;

            for (; numero > 1; numero --) {
                fatorial = fatorial * numero;
            }

            System.out.printf("O fatorial é %d", fatorial);

            scanner.close();
        }

    }
