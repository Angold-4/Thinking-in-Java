// C05_Bool.java

/* notice:
 * 1. You can apply AND, OR, or NOT to boolean values only.
 *
 * 2. short-circuiting behavior
 * This means that the expression will be evaluated 
 * only until the truth or falsehood of the entire expression can be unambiguously determined.
 * in fact, is that you can get a potential performance increase 
 * if all the parts of a logical expression do not need to be evaluated.
 */

public class C05_Bool {
    static boolean test1(int val) {
        System.out.println("test1("+ val +")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        System.out.println("test2("+ val +")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }
    static boolean test3(int val) {
        System.out.println("test3("+ val +")");
        System.out.println("result: " + (val < 1));
        return val < 1;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(3);
        System.out.println("expression is " + b);
    }
}

/* Output:
 * test1(0)
 * result: true
 * test2(2)
 * result: false
 * expression is false
 */

