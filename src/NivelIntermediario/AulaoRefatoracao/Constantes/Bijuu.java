package NivelIntermediario.AulaoRefatoracao.Constantes;

public enum Bijuu {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    String nomeBijuu;
    String jinchuriki;
    int numeroCaldas;

    Bijuu() {
    }

    Bijuu(String nomeBijuu, String jinchuriki, int numeroCaldas) {
        this.nomeBijuu = nomeBijuu;
        this.numeroCaldas = numeroCaldas;
        this.jinchuriki = jinchuriki;
    }

    @Override
    public String toString() {
        return "Nome Bijuu: " + nomeBijuu + '\n' +
                "Jinchuriki: " + jinchuriki + '\n' +
                "Numero de caldas: " + numeroCaldas;
    }
}
