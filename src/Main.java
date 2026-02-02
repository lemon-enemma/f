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
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        int numFiveKind = 0;
        int numFullHouse = 0;
        int numFourKind = 0;
        int numThreeKind = 0;
        int numTwoPair = 0;
        int numOnePair = 0;
        int numHighCard = 0;
        String[] lines = fileData.split("\n");
        for (String line : lines) {
            int maxMatchingCards = 0;
            String[] labels = line.split(" ");
            for (int i = 0; i < labels.length; i++){
                int numMatches = 0;
                String currentLabel = labels[i];
                for (int j = 0; j < labels.length; j++){
                    if (j != i){
                        if (currentLabel.equals(labels[j])){
                            numMatches ++;
                        }
                    }
                }
                if (numMatches > maxMatchingCards){
                    maxMatchingCards = numMatches;
                }
            }
            if (maxMatchingCards == 4){
                numFiveKind++;
            } else if (maxMatchingCards == 3) {
                numFourKind++;
            } else if (maxMatchingCards == 2) {
                int minMatch = 0;
                for (int i = 0; i < labels.length; i++){
                    int numMatch = 0;
                    String currentLabel = labels[i];
                    for (int j = 0; j < labels.length; j++){
                        if (j != i){
                            if (currentLabel.equals(labels[j])){
                                numMatch++;
                            }
                        }

                    }
                    if (numMatch < minMatch){
                        minMatch = numMatch;
                    }
            }
                if (minMatch == 1){
                    numFullHouse++;
                } else {
                    numThreeKind++;
                }

                }
            }
    }
}