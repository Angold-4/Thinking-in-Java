// C08_BitwiseOperators.java


/* The bitwise operators come from C's low-level orientation.
 * Where you often manipulate hardware directly and must set 
 * the bits in hardware registers. Java was originally designed 
 * to be embedded in TV set-top boxes, so this low-level orientation 
 * still made sense. However, you probably won't use the bitwise operators much.
 */

public class C08_BitwiseOperators {
    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("~i2 = " + Integer.toBinaryString(~i2));
        System.out.println("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
        System.out.println("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 ^ i1 = " + Integer.toBinaryString(i1 ^ i1)); // exclusive-or
        System.out.println("i1 & i2 = " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
    }
}

/* output:
 * i1 = 10101010101010101010101010101010
 * i2 = 1010101010101010101010101010101
 * ~i1 = 1010101010101010101010101010101
 * ~i2 = 10101010101010101010101010101010
 * i1 & i1 = 10101010101010101010101010101010
 * i1 | i1 = 10101010101010101010101010101010
 * i1 ^ i1 = 0
 * i1 & i2 = 0
 * i1 | i2 = 11111111111111111111111111111111
 * i1 ^ i2 = 11111111111111111111111111111111
 */
