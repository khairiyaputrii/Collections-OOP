// Map Method

import java.util.HashMap;

/**
 * @author Khairiya Maisa Putri
 */

public class MapFruitTest {
    public static void main(String[] args) {
        HashMap<String, String> fruitBowl = new HashMap<String,String>();

        addElements(fruitBowl);
        displayElements(fruitBowl);
        findElement(fruitBowl, "Grape");
        findElement(fruitBowl, "Watermelon");
    }

    static void addElements(HashMap<String, String> fruitBowl){
        fruitBowl.put("Watermelon", "Yellow");
        fruitBowl.put("Grape", "Purple");
        fruitBowl.put("Mango", "Orange");
        fruitBowl.put("Apple", "Red");
    }
    
    static void displayElements(HashMap<String, String> fruitBowl){
        //System.out.println(fruitBowl);
        for(HashMap.Entry<String, String> fruit : fruitBowl.entrySet()){
            System.out.println("Fruit: " + fruit.getKey() + " with Color " + fruit.getValue());
        }
    }
    
    static void findElement(HashMap<String, String> fruitBowl, String fruit){
        if(fruitBowl.containsKey(fruit))
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        else
            System.out.println("There isn't any" + fruit + " in the bowl");
    }
}
