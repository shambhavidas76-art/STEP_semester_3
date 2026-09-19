import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors"))
                || (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock"))
                || (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        int wins = 0, losses = 0, draws = 0;
        System.out.println("Play 5 rounds. Enter Rock, Paper, or Scissors.");
        System.out.println("Round | Player | Computer | Result");
        for (int round = 1; round <= 5; round++) {
            System.out.print("Round " + round + " move: ");
            String player = scanner.nextLine();
            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
            System.out.println(round + " | " + player + " | " + computer + " | " + result);
        }
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", wins, losses, draws, wins * 100.0 / 5);
        scanner.close();
    }
}
