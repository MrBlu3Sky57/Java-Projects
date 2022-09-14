import java.util.Scanner; //Scanner Import 

class FormattingPhoneNumber {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);//Scanner Creation
        System.out.println("Enter a ten digit Phone Number");
        String phoneNumber = keyboard.next();
        System.out.println("(" + phoneNumber.substring(0, 3) + ")" + " " + phoneNumber.substring(3, 6) + " - " + phoneNumber.substring(6, 10));

    }

}
