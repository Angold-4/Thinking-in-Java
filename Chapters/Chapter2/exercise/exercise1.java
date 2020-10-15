// exercise1.java

/* Exercise 1: 
 * Create a class containing an int and a char that are not initialized,
 * And print their values to verify that Java performs default initialization.
 */

class exercise1 {
    int i;
    char c;
    exercise1() {
        System.out.println("i =  " + i);
        System.out.println("c = [" + c + ']');
    }
    public static void main(String[] args) {
        new exercise1();
    }
}
