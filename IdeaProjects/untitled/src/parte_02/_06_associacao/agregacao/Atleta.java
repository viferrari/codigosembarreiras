package parte_02._06_associacao.agregacao;


    public class Atleta {

        String nome;

        public Atleta(String nome) {
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Atleta{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }
}
