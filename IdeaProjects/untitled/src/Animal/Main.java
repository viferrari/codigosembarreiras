package Animal;

public static void main(String[] args) {
        Animal animal = new Animal(
        "Cavalo",
        3f,
        4,
        "Marron",
        "Aras",
        100);

        animal.dados();


        Animal peixe = new Peixe(
        "Beta",
        5f,
        0,
        "Vermelha",
        "Água",
        10,
        "Peixe bonitinho de aquário");


        peixe.dados();
        // peixe.dadosPeixe();

        if (peixe instanceof Peixe) {
        Peixe peixeRealmentePeixe = (Peixe) peixe;
        peixeRealmentePeixe.dadosPeixe();

        Animal peixeConvertidoParaAnimal = peixeRealmentePeixe;
        }




        }

        }