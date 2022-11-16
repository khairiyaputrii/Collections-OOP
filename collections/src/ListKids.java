// List Method
import java.util.ArrayList;

/**
 * @author Khairiya Maisa Putri
 */
public class ListKids {
    public static void main(String[] args) {
        ArrayList<String> kidsName = new ArrayList();

        addKids(kidsName);
        displayKids(kidsName);

    }

    static void addKids(ArrayList<String> kidsName) {
        kidsName.add("May");
        kidsName.add("Daisy");
        kidsName.add("Febby");
        kidsName.add("Jules");

        kidsName.add(2,"Jaden");

        kidsName.remove("May");
    }

    static void displayKids(ArrayList<String> kidsName) {
        for(String kids: kidsName)
            System.out.println("Kids Name : " + kids);
    }
}