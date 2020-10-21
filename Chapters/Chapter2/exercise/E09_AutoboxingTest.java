// E09_AutoboxingTest.java

/* Write a program to demonstrate that
 * autoboxing works for all the primitive types
 * and their wrappers.
 *
 * notice:
 * before jdk 13:
 * There only excist two types in java
 * One is primitive (primitive type), and the other is object (object type).
 * The primitive type uses the "pass by value" method when passed as a parameter to the method
 * The object types references are typically implemented 
 * as pointers and these things typically have the same size
 * regardless of the sizes of the instances they refer to (Object, String, Integer, etc).
 *
 * but Primitive variables aren't interchangeable in the same way, 
 * neither with each other, nor with Object. 
 * The most obvious reason for this (but not the only reason) is their size difference. 
 *
 * Because java is an OOP language which means object is very important
 * We need autoboxing in java which means transport primitive types to object
 *
 */

public class E09_AutoboxingTest {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by; 
        System.out.println("byte = " + bt); 
        Short sh = 1;
        short s = sh; 
        System.out.println("short = " + s); 
        Integer in = 1;
        int i = in;
        System.out.println("int = " + i); 
        Long lo = 1L;
        long l = lo; 
        System.out.println("long = " + l); 
        Boolean bo = true;
        boolean b = bo; 
        System.out.println("boolean = " + b); 
        Character ch = 'x';
        char c = ch; 
        System.out.println("char = " + c); 
        Float fl = 1.0f;
        float f = fl; 
        System.out.println("float = " + f); 
        System.out.println("float = " + fl); 
        Double db = 1.0d;
        double d = db; 
        System.out.println("double = " + d);
        System.out.println(db.getClass()); // class java.lang.Double
    }
}

