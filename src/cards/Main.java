package cards;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] suits = {
                "clubs", "diamonds", "spades", "hearts"
        };
        String[] ranks = {
                "ace", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "jack", "queen", "king"
        };

        Scanner scanner = new Scanner(System.in);
        Card[] cards = new Card[52];
        int times = 0;

        for(int x = 0; x < suits.length; x++){

            for(int y = 0; y < ranks.length; y++){
                cards[times] = new Card(suits[x],ranks[y]);
                times++;
            }
        }

        int cardCount = 6;

        while(cardCount > 5) {
            System.out.print("How many cards would you like? (1..5) ");
            cardCount = scanner.nextInt();
            if (cardCount > 5) {
                System.out.println("That is not a valid amount");
            }
        }

        Card[] selectCards = new Card[cardCount];
            for(int x = 0; x < cardCount; x++){
                Random random = new Random();
                selectCards[x] = cards[random.nextInt(cards.length)];
                System.out.println(selectCards[x]);

            }
    }
}
