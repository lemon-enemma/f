import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String fileData = "";
        try {
            File f = new File("src/input");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                fileData += line + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        String[] decks = fileData.split("\n");
        int five = 0;
        int four = 0;
        int
        for (String deck: decks){
            String[] cards = deck.split(",");
            cards[4] = cards[4].substring(0, cards[4].lastIndexOf("|"));
            Deck d = new Deck(cards);
            d.findType();
                }
            }

        }