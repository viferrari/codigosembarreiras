package Estaticos;

public class Main {



        public static void main(String[] args) {


            System.out.println(Calculadora.Estaticos.Calculadora.somar(1, 1));
            System.out.println(Calculadora.Estaticos.Calculadora.subtrair(10, 1));
            System.out.println(Calculadora.Estaticos.Calculadora.multiplicar(2, 9));
            System.out.println(Calculadora.Estaticos.Calculadora.dividir(100, 10));


            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;

            System.out.println(Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos);

            System.out.println(Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++);
            System.out.println(Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos);


            var contador1 = new Calculadora.Estaticos.ContadoraDeAcessos();
            contador1.adicionaContadorLocal();
            contador1.adicionaContadorLocal();
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            System.out.println(contador1);
            System.out.println(Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos);

            var contador2 = new Calculadora.Estaticos.ContadoraDeAcessos();
            contador2.adicionaContadorLocal();
            contador2.adicionaContadorLocal();
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos++;
            contador2.adicionaContadorLocal();
            System.out.println(contador2);
            System.out.println(Calculadora.Estaticos.ContadoraDeAcessos.quantidadeDeAcessos);

            // Calculadora.PI = 123.0; Não é possível alterar o valor de um atributo final


            final var pi = 3.1415;
}
