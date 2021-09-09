package parte_02._06_associacao.agregacao;

public class Main {
    public static void main(String[] args) {
        var time1 = new Time();
        var time2 = new Time();
        var time3 = new Time();

        var marta = new Atleta("Marta");
        var neymar = new Atleta("Neymar");
        var gabigol = new Atleta("Gabigol");

        time1.adicionarAtleta(marta);
        time1.adicionarAtleta(neymar);
        time1.adicionarAtleta(gabigol);

        time2.adicionarAtleta(neymar);

        time3.adicionarAtleta(marta);
        time3.adicionarAtleta(gabigol);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println(marta);
        System.out.println(neymar);
        System.out.println(gabigol);

        time1 = null;
        time2 = null;
        time3 = null;

//        marta = null;
//        neymar = null;
//        gabigol = null;

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        System.out.println(marta);
        System.out.println(neymar);
        System.out.println(gabigol);
    }

}
}
