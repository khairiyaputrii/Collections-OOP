import java.util.LinkedList;

/**
 * @author Khairiya Maisa Putri
 */

public class LinkedListStack {
    public static void main(String[] args) {
        LinkedList<String> letterS = new LinkedList<String>();

        letterS.push("J");
        letterS.push("K");
        letterS.push("L");
        letterS.push("M");
        letterS.push("N");

        System.out.println("Linked list " + letterS);
        System.out.println("Stack size = " + letterS.size());

        while (!letterS.isEmpty()) {
            System.out.println(letterS.pop());
        }
        System.out.println("Linked list = " + letterS);
    }
}
