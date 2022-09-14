import java.util.Scanner;
public class FindIfWordStartWithCapitalLetter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        char firstLetter = word.charAt(0);
        int num = firstLetter;
        if (firstLetter < 91 && firstLetter > 64 ) {
            System.out.println("Your word starts with capital letter.");
        } else {
            System.out.println("Your word does not start with a capital letter.");
        }
    }
}
