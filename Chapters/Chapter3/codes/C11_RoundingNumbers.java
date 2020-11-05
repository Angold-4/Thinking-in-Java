// C11_RoundingNumbers.java


public class C11_RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println("(int)above: " + (int)above);
        System.out.println("(int)below: " + (int)below);
        System.out.println("(int)fabove: " + (int)fabove);
        System.out.println("(int)fbelow: " + (int)fbelow);

        System.out.println();

        System.out.println("Math.round(fabove): " + Math.round(fabove));
        System.out.println("Math.round(fbelow): "  + Math.round(fbelow));

        System.out.println();
    }
}

/* output:
 * (int)above: 0
 * (int)below: 0
 * (int)fabove: 0
 * (int)fbelow: 0
 *
 * Math.round(fabove): 1
 * Math.round(fbelow): 0
 */

// So the answer is that casting from a float or double to an integral value always truncates the number.
// Since the round( ) is part of java.lang, you don't need an extra import to use it.
//
// In general, the largest data type in an expression is the one that determines the size of the result of that expression; if you multiply a float and a double, the result will be double; if you add an int and a long, the result will be long.
