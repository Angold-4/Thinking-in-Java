// C10_Casting.java

/* Java will automatically change one type of data into another when appropriate. 
 * For instance, if you assign an integral value to a floating point variable, 
 * the compiler will automatically convert the int to a float.
 *
 * Casting allows you to make this type conversion explicit, 
 * or to force it when it wouldn't normally happen.
 */


public class C10_Casting {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        long lng = (long)i;
        lng = i; // "Widening," so cast not really required
        long lng2 = Long.MAX_VALUE;
        // A "narrowing conversion":
        short j = (short)lng2; // Cast required

        System.out.println("int i: " +  i); 
        System.out.println("int i(binary): " + Integer.toBinaryString(i)); 
        System.out.println("long i: " +  lng); 
        System.out.println("long i(binary): " + Long.toBinaryString(lng)); 
        System.out.println();
        System.out.println("long lng2: " + lng2);
        System.out.println("long lng2(binary): " + Long.toBinaryString(lng2));
        System.out.println("short j: " + j); // May losing messages
    }

/* output:
 * int i: 2147483647
 * int i(binary): 1111111111111111111111111111111
 * long i: 2147483647
 * long i(binary): 1111111111111111111111111111111
 *
 * long lng2: 9223372036854775807
 * long lng2(binary): 111111111111111111111111111111111111111111111111111111111111111
 * short j: -1
 */
}

/* Notice:
 * In Java, casting is safe, with the exception that when you perform a so-called 
 * narrowing conversion (that is, when you go from a data type that can hold more 
 * information to one that doesn't hold as much), you run the risk of losing information. 
 * Here the compiler forces you to use a cast, in effect saying, 
 * "This can be a dangerous thing to do-if you want me to do it anyway you must make the cast explicit."
 */
