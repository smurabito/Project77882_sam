
public class Item {
    public String itemName;
    public String itemDesc;
    public String itemProp;
    
    /**
     * Constructor
     * @param itemName name of item
     * @param itemDesc description of said item
     * @param itemProp properties of the item
     * @return 
     */

    public Item(String itemName, String itemDesc, String itemProp) {
    this.itemName = itemName;
    this.itemDesc = itemDesc;
    this.itemProp = itemProp;
   }
   
   // getters
   public String getName() {
    return itemName;
   }
   public String getDesc() {
    return itemDesc;
   }

   public String getProp() {
    return itemProp;
   }

   // setters
   public void setItem(String itemName) {
    this.itemName = itemName;
   }

   public void setDesc(String itemDesc) {
    this.itemDesc = itemDesc;
   }

   public void setProp(String itemProp) {
    this.itemProp = itemProp;
   }

   public void itemDisplay(){
    System.out.println("The name of the item is: " + itemName);
    System.out.println("The description of the item is: " + itemDesc);
    System.out.println("The item's property is : "+ itemProp);
   }


   public static void main(String[] args) {
    Item oranBerry = new Item(
        "Oran Berry",
        "A common blue berry that restores 10 HP.",
        "Restores 10 HP" // do we have it edit the player's totals?
    );
    Item thunderStone = new Item(
        "Thunder Stone",
        "A yellow stone used to evolve certain Pokemon.",
        "Can evolve certain Pokemon." // do we have it edit the player's totals?
    );
    Item waterStone = new Item(
        "Water Stone",
        "A blue stone used to evolve certain Pokemon.",
        "Can evolve certain Pokemon." // do we have it edit the player's totals?
    );
    Item fireStone = new Item(
        "Fire Stone",
        "A red stone used to evolve certain Pokemon.",
        "Can evolve certain Pokemon." // do we have it edit the player's totals?
    );
}
}
