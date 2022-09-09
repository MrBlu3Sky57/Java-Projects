import java.util.Scanner; //Scanner Import 

class main {
    
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);//Scanner Creation
        System.out.println("Enter Phone Number");
        String phoneNumber = keyboard.next();
        System.out.println("(" + phoneNumber.substring(0, 2) + ")" + " " + phoneNumber.substring(3, 5) + " - " + phoneNumber.substring(6, 9));

    }

}
