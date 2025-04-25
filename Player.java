
import java.util.ArrayList;
import java.util.Scanner;

public class Player{
   public String playerName;
   public ArrayList<Item> playerItems; // need to import items from other class?
   public Pokemon starter; 
   
   public Player(String name) {
    this.playerName = name;
    this.playerItems = new ArrayList<>();
   }

   public String getName() { //maybe put the calling and assigning of this variable in main?
    return playerName; // where do we get input for player name?
    // Scanner input = new Scanner(System.in); 
    // System.out.println("Hello player! What's your name?");
    // playerName = input.nextLine();
    // return playerName;
   }

   public void getItems() {
    if (playerItems.isEmpty()) {
        System.out.println("Sorry" + playerName + "you have no items! :(");
    } else {
        for (Item item : playerItems) {
        System.out.println(item);
        }
    }
}

    public void addItems(Item item) {
        playerItems.add(item);
    }

    public void addStarter(Pokemon pokemon){
        starter = pokemon; 
    }
}