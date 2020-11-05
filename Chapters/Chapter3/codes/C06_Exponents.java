// C06_Exponents.java

// "e" means "10 to the power"


public class C06_Exponents {
    public static void main(String[] args) {
        // Both uppercase and lowercase 'e' are the same
        float expFloat = 1.39e-43f; // 'f' suffix is not optional
        /* the compiler normally takes exponential numbers as doubles, 
         * so without the trailing f, it will give you an error telling you 
         * that you must use a cast to convert double to float.
         */
        double expDouble = 47e47d;  // 'd' suffix is optional
        System.out.println(expFloat);
        System.out.println(expDouble);
    }
}

/* output:
 * 1.39E-43
 *4.7E48
 */
