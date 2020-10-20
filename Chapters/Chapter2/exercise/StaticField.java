// StaticField.java

/* plz check both the code and comment below
 * think about why we can't call StaticField.Instance directly
 */

public class StaticField {
    private static boolean Static;
    private boolean Instance;
    public static void main(String[] args) {
        // a static method can access static fields
        Static = true;
        // Instance = False; -> cannot find a symbol Instance
        // That is because the static main() method does not know
        // which instance of the StaticField class

        // a static method can access instance fields
        // through an object reference
        StaticField instance = new StaticField();
        // We need to create an instance to tell the static main method
        // the specific class instance that main() can access it
        instance.Instance = true;
        
        System.out.println(StaticField.Static); // true
        System.out.println(instance.Instance);  // true
        // System.out.println(StaticField.Instance); // error

    }
}


/* static members belong to the class instead of a specific instance.
 * It means that only one instance of a static field exists
 * even if you create a million instances of the class or you don't create any. 
 * It will be shared by all instances.
 * one for each class versus the non-static one for each object
 */
