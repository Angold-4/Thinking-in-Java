// E03_AtypeName.java

/* will print
 * E03_AtypeName@d716361
 * E03_AtypeName@6ff3c5b5
 */

public class E03_AtypeName {
    public static void main(String[] args) {
        E03_AtypeName a = new E03_AtypeName();
        E03_AtypeName b = new E03_AtypeName();
        System.out.println(a);
        System.out.println(b);
    }

}
