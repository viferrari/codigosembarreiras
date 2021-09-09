package Encapsolamento;

public  class  ContaBancaria {

    saldo duplo privado =  0,0 ;

    public  ContaBancaria () {
    }

    @Sobrepor
    public  String  toString () {
        retornar  " ContaBancaria { "  +
                " saldo = "  + saldo +
                ' } ' ;
    }

    private  boolean  verificaLimiteAntesDaTransacao ( Double  valorDoSaque ) {
        if (valorDoSaque >  this . saldo) {
            Sistema . para fora . println ( " Você não tem limite! " );
            return  false ;
        }
        return  true ;
    }

    public  void  saque ( Double  valorDoSaque ) {
        if (verificaLimiteAntesDaTransacao (valorDoSaque)) {
            isso . saldo - = valorDoSaque;
        }
    }

    public  void  deposito ( Double  valorDeposito ) {
        isso . saldo + = valorDeposito;
    }
}