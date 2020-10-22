// C04_Equivalence.java

/* notice:
 * since both Integer objects are the same. 
 * But while the contents of the objects are the same, 
 * the references are not the same. 
 * The operators == and != compare object references, 
 * so the output is actually false and then true.
 */

class Value {
    int i;
}

public class C04_Equivalence {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println(n1.equals(n2));

        // But if you do like this:
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));

        // Most of the Java library classes implement equals() 
        // so that it compares the contents of objects instead of their references.
    }
}
/* output:
 * false
 * true
 * true
 * false
 */
