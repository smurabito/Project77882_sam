import java.util.ArrayList;
import java.util.Scanner;


public class Farm extends Location{
    public ArrayList<Pokemon> farmPokemon;
    public boolean here = false; 

    public Farm(String name) {
        super(name); 
        this.farmPokemon = new ArrayList<>();
       }

    public void returnFarm(){
        
    }


    public void addPokemon(Pokemon pokemon) {
        farmPokemon.add(pokemon);
        System.out.println(pokemon.getName() + " has been added to the farm.");
    }

    public void seePokemon(){
        for (int i = 0; i < farmPokemon.size(); i++ ){
            System.out.print("\nYour farm has a "); 
            System.out.println(farmPokemon.get(i).getName()); 
            System.out.println("\nWhat would you like to do now?\n\nYou can use the command 'look' to look around the farm, 'see pokemon' to see your current Pokemon, or 'leave' to leave the farm and begin your adventure!");
        }
    }

    public void setHere(boolean here){
        this.here = here; 
    }

    public void leave(Scanner scanner){
        this.here = false; 
        System.out.println("\nYou have left, where would you like to go? You can go to the 'beach', the 'cave', the 'forest', or the 'field'.\nType in your choice: ");
        
        boolean move = false;
        while (!move){
            String answer = scanner.nextLine(); 
            if (answer.toLowerCase().equals("beach")){
                System.out.println("\nYou are now at the beach.");
                
                move = true; 
            } else if (answer.toLowerCase().equals("cave")){
                System.out.println("\nYou are now at the cave.");
                move = true; 
            } else if (answer.toLowerCase().equals("field")){
                System.out.println("\nYou are now at the field.");
                move = true; 
            } else if (answer.toLowerCase().equals("forest")){
                System.out.println("\nYou are now at the forest.");
                move = true; 
            } else {
                System.out.println("\nI don't know that command. Please type in 'beach', 'cave', 'forest', or 'field'."); 
            }
        }
    }

    //inventory of pokemon
    //ability to interact with pokemon

    public void play(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("You have your starter. What would you like to do now?\n\nYou can use the command 'look' to look around the farm, 'see pokemon' to see your current Pokemon, or 'leave' to leave the farm and begin your adventure!");

        while (here == true){
            String answer = scanner.nextLine(); 
            boolean loop = false;
            while (!loop){ 
                if (answer.toLowerCase().equals("look")){
                    System.out.println(this.look());
                    System.out.println("\nWhat would you like to do now?\n\nYou can use the command 'look' to look around the farm, 'see pokemon' to see your current Pokemon, or 'leave' to leave the farm and begin your adventure!");
                    loop = true; 
                } else if (answer.toLowerCase().equals("see pokemon")){
                    this.seePokemon();
                    loop = true;
                } else if (answer.toLowerCase().equals("leave")){
                    this.leave(scanner);
                    loop = true; 
                    scanner.close();
                }
                else {
                    System.out.println("I don't know that command. You can use the command 'see pokemon' to see your pokemon. You can look around using the command 'look'"); 
                    answer = scanner.nextLine(); 
                }

            }
           
        }
    }
}




