package Animal;

public class Peixe extends Animal {

    String caracteristica;

    public Peixe(String nome,
                 float comprimento,
                 int numeroDePatas,
                 String cor,
                 String ambiente,
                 float velocidadeMedia,
                 String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe() {
        System.out.println(this);
    }

    @Override
    public void dados() {
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numeroDePatas=" + numeroDePatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMedia=" + velocidadeMedia +
                ", caracteristica='" + caracteristica + '\'' +
                '}';
    }
}}
