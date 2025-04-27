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
        farm.setDescription("\nIt's your farm!\nYou see an old farmhouse where you live with grandpa along with a beautiful, sunny, fenced in yard. There are some Oran berry bushes along the fence."); 

        
        
        
        //Game loop 
        String playerName; 

        Scanner input = new Scanner(System.in); 
        System.out.print(border); 
        System.out.println("Hello player! What's your name?");
        playerName = input.nextLine();

        Player player = new Player(playerName); 
        System.out.print("Hello " + player.getName() + "! Welcome to your Pokemon Farm");
        System.out.println("\nYou live here with yout grandfather. Now that you're finally ten years old, your grandfather is going to let you help out on the Pokemon farm.");
        System.out.println("\nYour grandfather has tasked you with recruiting local Pokemon for the farm. You can explore the areas around the farm to discover new Pokemon, new items, and townspeople!"); 
        System.out.println("\nIt's morning. Are you ready to get up? (Press enter)"); 
        Scanner scanner = new Scanner(System.in); 
        String answer = scanner.nextLine(); 
        System.out.print(answer); 
        
        //Pick a starter
        System.out.print(border);
        System.out.println("\nYour grandfather wakes you up for breakfast and he cooks your favorite!");
        System.out.println("\nAfter breakfast he tells you: 'It's time to choose your first Pokemon. Choose wisely.'"); 
        System.out.println("\nYou follow him onto the front porch and see three Pokemon waiting for you."); 
        System.out.println("\nOn the left there's a Pikachu, a small yellow mouse-like creature with electric powers. It says 'pika pika' and smiles at you."); 
        System.out.println("\nIn the middle there's a Vulpix, a small red fox-like creature with the power of fire. It chirps and rubs against your lag happily."); 
        System.out.println("\nOn the right there's a psyduck, a yellow duck with psychic powers. You look into it's eyes and feel worried."); 
        System.out.println("\nWho do you choose?");
        System.out.print(border);

        //user input
        String starter = input.nextLine(); 
        boolean loop = false; 
        while (!loop){
            if (starter.toLowerCase().equals("vulpix")){
                System.out.println("\nGreat choice! Vulpix is excited to be your first pokemon, and can't wait to live on your farm.");
                player.addStarter(vulpix);
                farm.addPokemon(vulpix);
                loop = true; 
            } else if (starter.toLowerCase().equals("psyduck")){
                System.out.println("\nGreat choice! Psyduck looks less confused, and can't wait to live on your farm.");
                player.addStarter(pysduck);
                farm.addPokemon(pysduck);
                loop = true; 
            } else if (starter.toLowerCase().equals("pikachu")){
                System.out.println("\nGreat choice! Pikachu runs around in excitement, and can't wait to live on your farm.");
                player.addStarter(pikachu);
                farm.addPokemon(pikachu);
                loop = true; 
            } else {
                System.out.println("\nI don't know that Pokemon. Try again. Your options are: Vulpix, Psyduck, or Pikachu."); 
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