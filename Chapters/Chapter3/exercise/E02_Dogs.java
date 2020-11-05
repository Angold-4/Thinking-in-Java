// E02_Dogs.java

/* Question:
 * Create a class called Dog with two Strings:
 * name and says. In main(), create two dogs,
 * "spot" who says, "Ruff!", and "scruffy" who
 * says, "Wurf!". Then display their names and
 * what they say.
 */


class Dog {
    String name;
    String says;
}

public class E02_Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "spot";  dog1.says = "ruff!";
        dog2.name = "scruffy";  dog2.says = "wuff!";
        System.out.println(dog1.name + " says " + dog1.says);
        System.out.println(dog2.name + " says " + dog2.says);
    }
}

/* output;
 * spot says ruff!
 *scruffy says wuff!
 */
