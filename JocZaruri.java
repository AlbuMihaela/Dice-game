package udemy_151ex.joc;

import java.util.Random;
import java.util.Scanner;

public class JocZaruri {
    public static void main(String[] args) {
        int myDice1;
        int myDice2;

        int opponentDice1;
        int opponentDice2;

        int myVictories = 0;
        int myOpponentVictories = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Ready to play? Your score " + myVictories + " / Opponnent score " + myOpponentVictories);
            String raspuns = scanner.nextLine();

            if (raspuns.equals("yes")) {
                myDice1 = random.nextInt(6) + 1;
                myDice2 = random.nextInt(6) + 1;
                opponentDice1 = random.nextInt(6) + 1;
                opponentDice2 = random.nextInt(6) + 1;

                System.out.println("Your dices : " + myDice1 + " " + myDice2);
                System.out.println("Opponent dices: " + opponentDice1 + " " + opponentDice2);

                int myScore = myDice1 + myDice2;
                int opponentScore = opponentDice1 + opponentDice2;

                if (myScore > opponentScore) {
                    myVictories++;
                    System.out.println("You win!");
                } else if (opponentScore > myScore) {
                    myOpponentVictories++;
                    System.out.println("You lose!");
                } else {
                    System.out.println("Game ended in a tie!");
                }

                if (myVictories==6){
                    System.out.println("You win the game1");
                    break;
                }else if (myOpponentVictories==6){
                    System.out.println("You lost the game!");
                    break;
                }
            } else if (raspuns.equals("no")) {
                System.out.println("Hope to see you again soon! ");
                break;
            } else {
                System.out.println("Your answer is not available. Please enter Yes or No .");
            }
        }
    }


}
