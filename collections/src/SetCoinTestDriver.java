import java.util.HashSet;

/**
 * @author Khairiya Maisa Putri
 */

public class SetCoinTestDriver {
    public static void main(String[] args){
        HashSet<SetCoin> bagOfCoins = new HashSet<SetCoin>();
        
        SetCoin coin1 = new SetCoin(1);
        SetCoin coin2 = new SetCoin(2);
        SetCoin coin3 = new SetCoin(3);
        SetCoin coin5 = new SetCoin(5);
        SetCoin coin100 = new SetCoin(100);
        
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin3);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin100);
        
        bagOfCoins.contains(coin5);
        
        findCoin(bagOfCoins, coin100);
        displayBagContents(bagOfCoins);
        displayBagDetails(bagOfCoins);
        bagOfCoins.clear();
        displayBagDetails(bagOfCoins);
    }
    
    static void findCoin(HashSet<SetCoin> bagOfCoins, SetCoin coin){
        if(bagOfCoins.contains(coin)) System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        else System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
    }
    
    static void displayBagContents(HashSet<SetCoin> bagOfCoins){
        for(SetCoin coin : bagOfCoins) System.out.print(coin.getDenomination() + " ");
    }
    
    static void displayBagDetails(HashSet<SetCoin> bagOfCoins){
        if(bagOfCoins.isEmpty()) System.out.println("There is no coins in the bag");
        else System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }
}
