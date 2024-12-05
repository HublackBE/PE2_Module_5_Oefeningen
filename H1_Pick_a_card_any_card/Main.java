import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static String invoer;

    public static void main(String[] args) {
        do {
            int randomNummer = (int) (Math.random() * 13 + 1);
            spel(randomNummer);
            System.out.println("\nNog een spel?");
            invoer = in.nextLine();
        } while (invoer.equalsIgnoreCase("ja") || invoer.equalsIgnoreCase("yes") || invoer.equalsIgnoreCase("y"));
    }

    public static void spel(int vorigNummer) {
        while (true) {
            System.out.println("\n" + vorigNummer);
            System.out.println("Hoger of Lager?");
            invoer = in.nextLine();
            int randomNummer = (int) (Math.random() * 14);
            switch (invoer.toLowerCase()) {
                case "hoger":
                    if (vorigNummer < randomNummer) {
                        System.out.println(randomNummer + "!\nGoed gegokt!");
                        break;
                    } else if (vorigNummer > randomNummer) {
                        System.out.println(randomNummer + "!\nSpijtig! " + randomNummer + " is niet groter dan " + vorigNummer);
                        return;
                    } else {
                        System.out.println(randomNummer + "!\nZe zijn gelijk!\nJe mag verder spelen.");
                        break;
                    }
                case "lager":
                    if (vorigNummer > randomNummer) {
                        System.out.println(randomNummer + "!\nGoed gegokt!");
                        break;
                    } else if (vorigNummer < randomNummer) {
                        System.out.println(randomNummer + "!\nSpijtig! " + randomNummer + " is niet kleiner dan " + vorigNummer);
                        return;
                    } else {
                        System.out.println(randomNummer + "!\nZe zijn gelijk!\nJe mag verder spelen.");
                        break;
                    }
                default:
                    System.err.println("Ongeldige input!");
                    break;
            }
            vorigNummer = randomNummer;
        }
    }
}
