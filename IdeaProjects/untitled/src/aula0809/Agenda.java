package aula0809;

public class Agenda {


import  aula0809.Pessoa ;

    public  class  Agenda {

        Pessoa [] pessoas =  nova  Pessoa [ 10 ];

        String nomeDaAgenda;

        Agenda pública ( String  nomeDaAgenda ) {
            isso . nomeDaAgenda = nomeDaAgenda;
        }

        private  int  bucarOhProximoIndiceVazio () {
            for ( int i =  0 ; i <  this . pessoas . comprimento; i ++ ) {
                if ( this . pessoas [i] ==  null ) {
                    return i;
                }
            }
            retorno  - 1 ;
        }

        void  armazenaPessoa ( String  nome , int  anoNascimento , float  altura ) {
            var indiceParaGravarAhNovaPessoa =  isso . bucarOhProximoIndiceVazio ();

            if (indiceParaGravarAhNovaPessoa ==  - 1 ) {
                Sistema . para fora . printf ( " Você não pode armazenar mais do que 10 pessoas. Uma pessoa% s não foi adicionada.% n " , nome);
                retorno ;
            }

            var pessoa =  nova  Pessoa ();
            pessoa . nome = nome;
            pessoa . anoDeNascimento = anoNascimento;
            pessoa . altura = altura;
            isso . pessoas [indiceParaGravarAhNovaPessoa] = pessoa;
        }

        void  removePessoa ( nome da string  ) {
            var indiceDaPessoaARemover =  this . buscaPessoa (nome);
            if (indiceDaPessoaARemover >  - 1 ) {
                isso . pessoas [indiceDaPessoaARemover] =  null ;
                Sistema . para fora . printf ( " Uma pessoa% s foi removida com sucesso.% n " , nome);
            } else {
                Sistema . para fora . printf ( " Pessoa% s não encontrada.% n " , nome);
            }
        }

        int  buscaPessoa ( String  nome ) {
            for ( int i =  0 ; i <  this . pessoas . comprimento; i ++ ) {
                if (nome . equals ( this . pessoas [i] . nome)) {
                    return i;
                }
            }

            retorno  - 1 ;
        }

        void  imprimeAgenda () {
            for ( int i =  0 ; i <  this . pessoas . comprimento; i ++ ) {
                isso . imprimePessoa (i);
            }
        }

        void  imprimePessoa ( int  indice ) {
            Sistema . para fora . println ( este . pessoas [índice]);
        }
    }
}
