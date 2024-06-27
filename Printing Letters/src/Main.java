import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please type a text: ");
        String text = s.nextLine();
        for(int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == ' ') // if it's a space, skip
                continue;
                System.out.println( i + ". " + "letter = " + letter);
        }
    }
}


