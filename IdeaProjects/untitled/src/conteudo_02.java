import java.util.Scanner;

public class conteudo_02 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("numero digitado");
        int numero = in.nextInt();

        if (numero >= 5  && numero <= 7 ){
            System.out.println("Infantil A ");
        }
            else if (numero >= 8  && numero <= 11) {
            System.out.println("Infantil B");
        }
        else if (numero >= 12  && numero <= 13) {
            System.out.println("Juvenil A");
        }
        else if (numero >= 14  && numero <= 17) {
            System.out.println("Juvenil B");
        }

        else {
                System.out.println("Adulto");
        }

    }
}
