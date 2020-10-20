// E07_Incrementable.java

/* notice:
 * Everytime if there appears a new class in a program
 * when compile it --> appears a new specific .class file
 * Because Each java program just can have one class 
 * which has the same name of the program name and it is public
 * The StaticTest class in this program must be private
 *
 * This program using 3 different ways to increase i
 * 1. create a obj sf and call the increment() method
 * 2. no need to create a obj just direct using class to call
 * 3. just call the static method increment()
 * when compile it and run, all of them get the same effect
 * 
 * 
 */

class StaticTest {
    // auxiliary class 
    // should not be accessed from out its own source file
    static int i = 47;
}

public class E07_Incrementable {
    static int j = 59;
    static void increment() { StaticTest.i ++; }
    public static void main(String[] args) {
        E07_Incrementable sf = new E07_Incrementable();
        sf.increment();
        System.out.println(StaticTest.i);
        E07_Incrementable.increment();
        System.out.println(StaticTest.i);
        increment();
        System.out.println(StaticTest.i);
        System.out.println();
    }
}
