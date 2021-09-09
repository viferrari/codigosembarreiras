package parte_02._06_associacao.agregacao;


import java.util.ArrayList;
import java.util.List;

    public class Time {

        private List<Atleta> atletas = new ArrayList<>();

        void adicionarAtleta(Atleta atleta) {
            this.atletas.add(atleta);
        }

        @Override
        public String toString() {
            return "Time{" +
                    "atletas=" + atletas +
                    '}';
        }
    }
}
