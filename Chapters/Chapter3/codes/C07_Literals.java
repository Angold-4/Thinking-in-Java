// C07_Literals.java

public class C07_Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // hexadecimal leading with "0x"
        System.out.println("i1: "+ Integer.toBinaryString(i1));
        int i2 = 0177; // Octal leading with "0"
        System.out.println("i2: "+ Integer.toBinaryString(i2));
        int i3 = 0b101; // binary leading with "0b"
        System.out.println("i2: "+ Integer.toBinaryString(i3));
        int i4 = 5; // decimal don't need to lead with anything
        System.out.println("i2: "+ Integer.toBinaryString(i4));
    }
}

/* output
 * i1: 101111
 * i2: 1111111
 * i2: 101
 * i2: 101
 */
