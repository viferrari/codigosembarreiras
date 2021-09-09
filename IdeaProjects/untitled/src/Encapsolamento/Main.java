package Encapsolamento;


public  class  Main {

    public  static  void  main ( String [] args ) {
        var conta1 =  nova  ContaBancaria ();
        Sistema . para fora . println (conta1);
        conta1 . deposito ( 500,00 );
        Sistema . para fora . println (conta1);
        conta1 . saque ( 100,00 );
        Sistema . para fora . println (conta1);
        conta1 . deposito ( 50,0 );
        Sistema . para fora . println (conta1);
        conta1 . saque ( 1000,0 );
        Sistema . para fora . println (conta1);

    }

}