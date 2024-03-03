package kyu_7.rock_paper_scissors_spock;

public class spock {
    public static String rpsls(String player1, String player2){
        if(player1.equals(player2)) return "Draw!";
        if(player1.equals("scissors") && player2.equals("paper")) return "Player 1 Won!";
        if(player1.equals("paper") && player2.equals("rock")) return "Player 1 Won!";
        if(player1.equals("rock") && player2.equals("lizard")) return "Player 1 Won!";
        if(player1.equals("lizard") && player2.equals("spock")) return "Player 1 Won!";
        if(player1.equals("spock") && player2.equals("scissors")) return "Player 1 Won!";
        if(player1.equals("scissors") && player2.equals("lizard")) return "Player 1 Won!";
        if(player1.equals("lizard") && player2.equals("paper")) return "Player 1 Won!";
        if(player1.equals("paper") && player2.equals("spock")) return "Player 1 Won!";
        if(player1.equals("spock") && player2.equals("rock")) return "Player 1 Won!";
        if(player1.equals("rock") && player2.equals("scissors")) return "Player 1 Won!";
        return "Player 2 Won!";
      }
}
