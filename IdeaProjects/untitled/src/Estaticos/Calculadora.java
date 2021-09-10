package Estaticos;

public class Calculadora {


    public class Calculadora {

        public static final Double PI = 3.1415;


        private Calculadora() {}


        static int somar(int a, int b) {
            return a + b;
        }

        static int subtrair(int a, int b) {
            return a - b;
        }

        static int multiplicar(int a, int b) {
            return a * b;
        }

        static int dividir(int a, int b) {
            return a / b;
        }


    }
 11  src/parte_02/_07_estaticos/ClasseComClasseEstatica.java
    @@ -0,0 +1,11 @@
            package parte_02._07_estaticos;


    // TODO pesquisar um caso que isso realmente faça sentido e o porquê.
    public class ClasseComClasseEstatica {

        static class ClasseEstatica {

        }

    }
 9  src/parte_02/_07_estaticos/ClasseComMetodoFinal.java
    @@ -0,0 +1,9 @@
            package parte_02._07_estaticos;

    public class ClasseComMetodoFinal {

        final void executaAcaoX() {

        }

    }
 10  src/parte_02/_07_estaticos/ClasseFilhaDaClasseComMetodoFinal.java
    @@ -0,0 +1,10 @@
            package parte_02._07_estaticos;

    public class ClasseFilhaDaClasseComMetodoFinal extends ClasseComMetodoFinal {

    /* void executaAcaoX() {
       // Não é possível sobrescrever um método final
    }*/


    }
 6  src/parte_02/_07_estaticos/ClasseFilhaDeFinal.java
    @@ -0,0 +1,6 @@
            package parte_02._07_estaticos;

//public class ClasseFilhaDeFinal extends ClasseFinal {
//}

// Não é possível extender uma classe final
 4  src/parte_02/_07_estaticos/ClasseFinal.java
    @@ -0,0 +1,4 @@
            package parte_02._07_estaticos;

    final class ClasseFinal {
    }
 20  src/parte_02/_07_estaticos/ContadoraDeAcessos.java
    @@ -0,0 +1,20 @@
            package parte_02._07_estaticos;

    public class ContadoraDeAcessos {

        private long contadorDeAcessosLocal;

        public static long quantidadeDeAcessos = 0;


        void adicionaContadorLocal() {
            this.contadorDeAcessosLocal++;
        }

        @Override
        public String toString() {
            return "ContadoraDeAcessos{" +
                    "contadorDeAcessosLocal=" + contadorDeAcessosLocal +
                    '}';
        }
    }
 50  src/parte_02/_07_estaticos/Main.java
    @@ -0,0 +1,50 @@
            package parte_02._07_estaticos;


            // pi = 3.1413; Atributos e variáveis final não podem ser modificadas

        }

    }
 8  src/parte_02/_07_estaticos/MinhaString.java
    @@ -0,0 +1,8 @@
            package parte_02._07_estaticos;

//public class MinhaString extends String {
//}

// Demonstrando que não é possível extender uma classe final

// String é uma classe final.
}
