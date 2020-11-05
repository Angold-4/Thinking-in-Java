// C09_ShiftOprators.java


/* Like in C and C++, there also have shift oprators in java (>> and <<)
 * which also manipulate bits.
 *
 * The signed right shift ">>" uses sign extension: 
 * If the value is positive, zeroes are inserted at the higher-order bits; 
 * if the value is negative, ones are inserted at the higher-order bits.
 *
 * Java has also added the unsigned right shift ">>>", 
 * which uses zero extension: Regardless of the sign, 
 * zeroes are inserted at the higher-order bits. This operator does not exist in C or C++.
 */


public class C09_ShiftOprators {
    public static void main(String[] args) {
        int i = 1;
        int j = -1;

        System.out.println("i :  " + Integer.toBinaryString(i));
        System.out.println("i >>> 10: " + Integer.toBinaryString(i >>> 10));
        System.out.println("i >> 10: " + Integer.toBinaryString(i >> 10));
        System.out.println("i << 10: " + Integer.toBinaryString(i << 10));
        System.out.println();
        System.out.println("j :  " + Integer.toBinaryString(j));
        System.out.println("j >>> 10: " + Integer.toBinaryString(j >>> 10));
        System.out.println("j >> 10: " + Integer.toBinaryString(j >> 10));
        System.out.println("j << 10: " + Integer.toBinaryString(j << 10));
    }
}


/* output:
 * i :  1
 * i >>> 10: 0
 * i >> 10: 0
 * i << 10: 10000000000
 * 
 * j :  11111111111111111111111111111111
 * j >>> 10: 1111111111111111111111
 * j >> 10: 11111111111111111111111111111111
 * j << 10: 11111111111111111111110000000000
 */
