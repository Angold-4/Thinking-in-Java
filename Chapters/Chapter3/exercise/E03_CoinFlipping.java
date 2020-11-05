// E03_CoinFlipping.java

/* Question:
 * Write a program that simulates coin-flipping.
 */

import java.util.Random;

public class E03_CoinFlipping {
    public static void main(String[] args) {
        Random rand = new Random(); 
        boolean flip = rand.nextBoolean();
        System.out.print("OUTCOME: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
