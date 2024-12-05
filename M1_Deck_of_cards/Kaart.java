public class Kaart {
    Kleur kleur;
    Waarde waarde;

    public enum Waarde {
        AAS, TWEE, DRIE, VIER, VIJF, ZES, ZEVEN, ACHT, NEGEN, TIEN, BOER, DAME, HEER
    }

    public enum Kleur {
        HARTEN, RUITEN, SCHOPPEN, KLAVEREN
    }

    public Kaart(int kleurIndex, int waardeIndex) {
        Kleur kleur = Kleur.values()[kleurIndex];
        Waarde waarde = Waarde.values()[waardeIndex];
        this.kleur = kleur;
        this.waarde = waarde;
    }

    public void show() {
       System.out.println("Kleur: " + this.kleur.toString());
       System.out.println("Waarde: " + this.waarde.toString());
    }
}