package aula0809;

public class Elevador {
    public  class  Elevador {

        AndarAtual inteiro =  0 ;

        Integer totalDeAndares;

        Capacidade inteira ;

        Inteiro ocupcaoAtual =  0 ;

        Elevador público ( Integer  totalDeAndares , Integer  capacidade ) {
            isso . totalDeAndares = totalDeAndares;
            isso . capacidade = capacidade;
        }

        void  entrar () {
            if ( this . ocupcaoAtual <  this . capacidade) {
                isso . ocupcaoAtual ++ ;
            } else {
                Sistema . para fora . println ( " Elevador na capacidade máxima. Vá de escada. " );
            }
        }

        void  sair () {
            if ( this . ocupcaoAtual >  0 ) {
                isso . ocupcaoAtual - ;
            }
        }

        void  subir () {
            if ( this . andarAtual <  this . totalDeAndares) {
                isso . andarAtual ++ ;
            }
        }

        void  descer () {
            if ( this . andarAtual >  0 ) {
                isso . andarAtual - ;
            }
        }

        @Sobrepor
        public  String  toString () {
            voltar  " Elevador { "  +
                    " andarAtual = "  + andarAtual +
                    " , totalDeAndares = "  + totalDeAndares +
                    " , capacidade = "  + capacidade +
                    " , ocupcaoAtual = "  + ocupcaoAtual +
                    ' } ' ;
        }


    }
 69  src / parte_02 / _02_classes_e_objetos / exercicio03 / Main.java
    @@ -0,0 +1,69 @@
            package  parte_02._02_classes_e_objetos.exercicio03 ;

    public  class  Main {

        public  static  void  main ( String [] args ) {
            var elevador1 =  novo  Elevador ( 35 , 18 );


            para ( int i =  0 ; i <  40 ; i ++ ) {
                elevador1 . entrar ();
            }


            Sistema . para fora . println (elevador1);

            para ( int i =  0 ; i <  20 ; i ++ ) {
                elevador1 . subir ();
            }

            Sistema . para fora . println (elevador1);

            para ( int i =  0 ; i <  20 ; i ++ ) {
                elevador1 . subir ();
            }

            Sistema . para fora . println (elevador1);

            elevador1 . descer ();
            elevador1 . descer ();

            para ( int i =  0 ; i <  100 ; i ++ ) {
                elevador1 . sair ();
            }

            Sistema . para fora . println (elevador1);

            Sistema . para fora . println ( " --Fim elevador 1-- " );

            var elevador2 =  novo  Elevador ( 18 , 8 );

            Sistema . para fora . println (elevador2);
            elevador2 . entrar ();
            elevador2 . entrar ();
            elevador2 . entrar ();

            elevador2 . subir ();
            elevador2 . subir ();
            Sistema . para fora . println (elevador2);

            Sistema . para fora . println ( " --Fim elevador 2-- " );

            var elevador3 =  novo  Elevador ( 10 , 6 );

            Sistema . para fora . println (elevador3);

            elevador3 . subir ();
            elevador3 . subir ();

            elevador3 . descer ();
            elevador3 . descer ();
            elevador3 . descer ();
            elevador3 . descer ();

            Sistema . para fora . println (elevador3);

            Sistema . para fora . println ( " --Fim elevador 3-- " );
        }

    }
}
