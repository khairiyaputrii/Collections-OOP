import java.util.LinkedList;

/**
 * @author Khairiya Maisa Putri
 */

public class LinkedListQueue {
    public static void main(String[] args) {
        LinkedList<String> lettersQ = new LinkedList<String>();

        lettersQ.add("J");
        lettersQ.add("K");
        lettersQ.add("L");
        lettersQ.add("M");
        lettersQ.add("N");

        System.out.println("Linked list = " + lettersQ);
        System.out.println("Queue size = " + lettersQ.size());

        while (!lettersQ.isEmpty()) {
            System.out.println(lettersQ.removeFirst());
        }

        System.out.println("Linked list = " + lettersQ);
        System.out.println("Queue size = " + lettersQ.size());

    }
}
