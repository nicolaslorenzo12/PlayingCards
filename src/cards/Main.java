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
                times ++;
            }
        }

        times = 6;

        while(times > 5){
            System.out.print("How many cards would you like? (1..5) ");
            times = scanner.nextInt();
            if(times > 5){
                System.out.println("That is not a valid amount");
            }

            for(int x = 0; x < times; x++){
                Random random = new Random();
                int cardToPrint = random.nextInt(cards.length);
                System.out.println(cards[cardToPrint]);

            }
        }

    }
}
