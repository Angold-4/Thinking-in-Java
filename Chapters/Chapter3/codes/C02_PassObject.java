// C02_PassObject.java


/* notice:
 * Passing objects to methods may not be 
 * what you are used to.
 */

class Letter {
    char c;
}

public class C02_PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);
    }
}

 /* Output: 
  * 1: x.c: a 
  * 2: x.c: z
  */
