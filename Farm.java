
import java.util.ArrayList;
import java.util.Scanner;


public class Farm extends Location{
    public ArrayList<Pokemon> farmPokemon;
    public boolean here = false; 
    
    public Farm(String name) {
        super(name, 0, 0); 
        this.farmPokemon = new ArrayList<>();
       }

    public void addPokemon(Pokemon pokemon) {
        farmPokemon.add(pokemon);
        System.out.println(pokemon.getName() + " has been added to the farm.");
    }

    public void seePokemon(){
        for (int i = 0; i < farmPokemon.size(); i++ ){
            System.out.print("There is a "); 
            System.out.println(farmPokemon.get(i).getName()); 
        }
    }

    public void setHere(boolean here){
        this.here = here; 
    }

    public void leave(){
        this.here = false; 
    }

    //inventory of pokemon
    //ability to interact with pokemon


    public void play(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("You have your starter. What would you like to do now? You can use the command 'look' to look around and figure out what you'd like to do.");

        while (here == true){
            String answer = scanner.nextLine(); 
            boolean loop = false;
            while (!loop){ 
                if (answer.toLowerCase().equals("look")){
                    System.out.println(this.look());
                    loop = true; 
                } else if (answer.toLowerCase().equals("see pokemon")){
                    this.seePokemon();
                } else if (answer.toLowerCase().equals("leave")){
                    this.leave();
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




