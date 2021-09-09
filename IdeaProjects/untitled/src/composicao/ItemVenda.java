package composicao;

public class ItemVenda {

    Integer codigo;

    String nome;

    Double valor;

    @Override
    public String toString() {
        return "ItemVenda{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
 19  src/parte_02/_06_associacao/composicao/Main.java
@@ -0,0 +1,19 @@
        package parte_02._06_associacao.composicao;

public class Main {

    public static void main(String[] args) {
        var venda = new Venda();

        venda.adicionarItem(123, "Cubo mágico", 50.0);
        venda.adicionarItem(234, "Cubo mágico tower", 80.0);

        System.out.println(venda);

        venda = null;

        System.out.println(venda);

    }

}
}
