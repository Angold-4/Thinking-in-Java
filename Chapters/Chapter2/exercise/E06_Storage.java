// E06_Storage.java

/* notice:
 * main() method must be defined as
 * public static void main(String[] args)
 * or it will occur main() method not found error
 *
 * if method in class not define whether public or private
 * then the compile will default set it public
 */

public class E06_Storage {
    String s = "Hello, World!";
    int storage(String s){
        return s.length() * 2;
    }
    void print() {
        System.out.println("storage(s) = " + storage(s));
    }
    public static void main (String[] args) {
        E06_Storage st = new E06_Storage();
        st.print();
    }
}
