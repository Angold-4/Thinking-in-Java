// E01_Velocity.java
// {Args: 30.5 3.2}

/*
 * Write a program that calculates velocity
 * using a constant distance and a constant time.
 */


public class E01_Velocity {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.err.println(
                    "Usage: java E01_Velocity distance time");
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.print("Velocity = ");
        System.out.print(distance/time);
        System.out.print(" m/s ");
    }
}

/* output;
 * $ java E01_Velocity 30.5 3.2
 * Velocity = 9.53125 m/s % 
 */
