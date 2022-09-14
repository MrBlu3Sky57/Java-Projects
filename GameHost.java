import java.util.Random;

class GameHost {
    public static void main(String[] args) {
        Random random = new Random();

        int stayWinCount = 0;
        int switchWinCount = 0;

        for (int i = 0; i <= 1000; i++) {
            int car = random.nextInt(1, 3);
            int playerChoice = random.nextInt(1, 3);
            
            int host = 0;
            for (int j = 0; j <= 3; j++) {
                if (j != car && j != playerChoice) {
                    host = j;
                }
            }

        int playerStrategy = random.nextInt(0, 2);

        
            if (playerChoice == car) {
                stayWinCount++;
            } else {
            for(int k = 0; k <= 3; k++) {
                if (k != playerChoice && k != host) {
                    playerChoice = k;
                    if (playerChoice == car) {
                        switchWinCount++;
                    }
                }
            }
        }


        }
        System.out.println("Stay Wins: " + stayWinCount);
        System.out.println("Switch Wins: " + switchWinCount);

    }

}
