// C03_AutoInc.java

/* Demonstrates the ++ and -- operators.
 * i++ will increment the value of i, 
 * but return the original value that i held before being incremented.
 *
 * ++i will increment the value of i, and then return the incremented value.
 */

public class C03_AutoInc {
  public static void main(String[] args) {
    int i = 1;
    System.out.println("i : " + i);
    System.out.println("++i : " + ++i); // Pre-increment 
    System.out.println("i : " + i);
    System.out.println("i++ : " + i++); // Post-increment
    System.out.println("i : " + i);
    System.out.println("--i : " + --i); // Pre-decrement 
    System.out.println("i : " + i);
    System.out.println("i-- : " + i--); // Post-increment
    System.out.println("i : " + i);
  }
} 

/* Output:
 * i : 1
 * ++i : 2
 * i : 2
 * i++ : 2
 * i : 3
 * --i : 2
 * i : 2
 * i-- : 2
 * i : 1
 */
