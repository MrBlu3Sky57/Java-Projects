import java.util.Scanner;
public class CheckPassword {   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Boolean passwordCheck = false;
        

        do {
            Boolean passwordNum = false;
            Boolean passwordLCase = false;
            Boolean passwordUCase = false;
            System.out.println("Enter your password.");
            String word = keyboard.next();
            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) < 91 && word.charAt(i) > 64) {
                    passwordUCase = true;
                } 
                if(word.charAt(i) > 96 && word.charAt(i) < 123) {
                    passwordLCase = true;
                } 
                if(word.charAt(i) > 47 && word.charAt(i) < 58) {
                    passwordNum = true;
                } 
                if (passwordUCase == true && passwordLCase == true && passwordNum == true) {
                    passwordCheck = true;
                    break;
                }
            }
            if (passwordUCase == false) {
                System.out.println("The Password did not contain an uppercase letter.");
            }
            if (passwordLCase == false) {
                System.out.println("The Password did not contain a lowercase letter.");
            }
            if (passwordNum == false) {
                System.out.println("The Password did not contain a number.");
            }
        } while (!passwordCheck); 
        System.out.println("Valid Password");
    }
}
