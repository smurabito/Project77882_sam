import java.util.EnumMap;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //Stuf 
        String border = "=====================================\n";


        //Set up
        Pokemon pikachu = new Pokemon("Pikachu"); 
        Pokemon vulpix = new Pokemon("Vulpix"); 
        Pokemon pysduck = new Pokemon("Psyduck"); 

        //
        Farm farm = new Farm("Farm");//Make player's farm
        farm.setDescription("It's your farm!\nThere's an old farmhouse where you live with grandpa. A beautiful, sunny, fenced in yard. There are some oran berry bushes along the fence.\nYou can look at your pokemon using the command 'see pokemon'."); 

        
        
        
        //Game loop 
        String playerName; 

        Scanner input = new Scanner(System.in); 
        System.out.print(border); 
        System.out.println("Hello player! What's your name?");
        playerName = input.nextLine();

        Player player = new Player(playerName); 

        System.out.print("Hello, ");
        System.out.print(player.getName());
        System.out.println("! Welcome to your Pokemon Farm!"); 
        System.out.println("You live here with yout grandfather. Now that you're finally ten years old, your grandfather is going to let you help out on the pokemon farm.");
        System.out.println("Your grandpa has tasked you with recruiting local pokemon for the farm. You can explore the areas around the farm to discover new pokemon, new items, and townspeople!"); 
        System.out.println("It's morning-time. Are you ready to get up? (Press enter)"); 
        Scanner scanner = new Scanner(System.in); 
        String answer = scanner.nextLine(); 
        System.out.print(answer); 
        //Pick a starter
        System.out.print(border);
        System.out.println("Your grandpa wakes you up for breakfast, and he cooks your favorite.");
        System.out.println("After breakfast, he says to you: 'It's time to choose your first pokemon. Choose wisely.'"); 
        System.out.println("You follow him onto the front porch and see three pokemon waiting for you."); 
        System.out.println("On the left there's a pikachu, a small yellow mouse-like creature with electric powers. It says 'pika pika' and smiles at you."); 
        System.out.println("In the middle there's a vulpix, a small red fox-like creature with the power of fire. It chirps and rubs against your lag happily."); 
        System.out.println("On the right there's a psyduck, a yellow duck with psychic powers. You look into it's eyes and feel worried."); 
        System.out.println("Who do you choose?");
        System.out.print(border);
        //user input
        String starter = input.nextLine(); 
        boolean loop = false; 
        while (!loop){
            if (starter.toLowerCase().equals("vulpix")){
                System.out.println("Great Choice! Vulpix is excited to be your first pokemon, and can't wait to live on your farm.");
                player.addStarter(vulpix);
                farm.addPokemon(vulpix);
                loop = true; 
            } else if (starter.toLowerCase().equals("psyduck")){
                System.out.println("Great Choice! Psyduck looks less confused, and can't wait to live on your farm.");
                player.addStarter(pysduck);
                farm.addPokemon(pysduck);
                loop = true; 
            } else if (starter.toLowerCase().equals("pikachu")){
                System.out.println("Great Choice! Pikachu runs around in excitement, and can't wait to live on your farm.");
                player.addStarter(pikachu);
                farm.addPokemon(pikachu);
                loop = true; 
            } else {
                System.out.println("I don't know that pokemon. Try again. Your options are: vulpix, psyduck, or pikachu."); 
                starter = input.nextLine(); 
            }
             
            farm.setHere(true);
            //
            System.out.println(border); 
            farm.play();            

        }

        scanner.close();
    }  
}