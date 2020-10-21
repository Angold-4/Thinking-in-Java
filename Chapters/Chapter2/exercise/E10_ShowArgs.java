// E10_ShowArgs.java

/* Write a program that prints three arguments
 * taken from the command line.
 * You'll need to index into the command-line
 * array of Strings.
 *
 * notice:
 * about public:
 * It is made public so that JVM can invoke it from outside 
 * the class as it is not present in the current class.
 *
 * about static:
 * is static so that JVM can invoke it without instantiating the class
 *
 * about void:
 * As soon as the main() method terminates, the java program terminates too. 
 * Hence, it does not make any sense to return from main() method 
 * as JVM cannot do anything with the return value of it.
 *
 * about String[] args:
 * args is an array of type java.lang.String class.
 * where store the parameter when execute the program
 */

public class E10_ShowArgs {
    public static void main(String[] args) {
        if(args.length < 3) 
        { System.err.println("Need 3 arguments"); System.exit(1);}
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }
}

/* example:
 * $java E10_ShowArgs A B C
 * A
 * B
 * C
 */
