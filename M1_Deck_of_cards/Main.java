public class Main {
    public static void main(String[] args) {
        Kaart[][] kaarten = new Kaart[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                kaarten[i][j] = new Kaart(i, j);
            }
        }
        kaarten[1][5].show();
    }
}
