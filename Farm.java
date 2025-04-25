
import java.util.ArrayList;

public class Farm extends Location{
    public ArrayList<Pokemon> farmPokemon;
    
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

    //inventory of pokemon
    //ability to interact with pokemon
}
