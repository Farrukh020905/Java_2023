import java.util.Scanner;
import java.util.Stack;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Стеки для карт игроков
        Stack<Integer> player1Stack = new Stack<>();
        Stack<Integer> player2Stack = new Stack<>();

        // Ввод карт игроков
        String[] player1Cards = scanner.next().split("");
        String[] player2Cards = scanner.next().split("");

        for (int i = 4; i >= 0; i--) {
            player1Stack.push(Integer.parseInt(player1Cards[i]));
            player2Stack.push(Integer.parseInt(player2Cards[i]));
        }

        int moves = 0;
        while (moves < 106) {
            int card1 = player1Stack.pop();
            int card2 = player2Stack.pop();

            if (card1 > card2) {
                player1Stack.add(0, card2);
                player1Stack.add(0, card1);
            } else {
                player2Stack.add(0, card1);
                player2Stack.add(0, card2);
            }

            moves++;

            if (player1Stack.isEmpty()) {
                System.out.println("first " + moves);
                return;
            } else if (player2Stack.isEmpty()) {
                System.out.println("second " + moves);
                return;
            }
        }

        System.out.println("botva");
    }
}
