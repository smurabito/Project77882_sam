import java.util.Random;
import java.util.Scanner;

public class Forest extends Location{
    Random random = new Random();
    int randomNumber = random.nextInt(10);
        
    Pokemon oddish = new Pokemon("Oddish");
    Pokemon mankey = new Pokemon("Mankey");
    Pokemon snorlax = new Pokemon("Snorlax"); 

    //Attributes 
    private String name; 
    private String description; 

       /**
    * Constructor  
    */
    public Forest (String name){
        super(name); 
        description = "You are in a Forest!";
    }
    public void playForest() {
            if (randomNumber >= 1 && randomNumber <= 4) {
                System.out.println("\nYou have encountered a wild Oddish! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomOdd = random.nextInt(2);
                    if (randomOdd == 1){
                        System.out.println("\nYou caught a Oddish! Congratulations!");
                        System.out.println("\nOddish has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(oddish);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Oddish escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playForest();
                }
            } if (randomNumber >= 5 && randomNumber <= 8) {
                System.out.println("\nYou have encountered a wild Mankey! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomMank = random.nextInt(2);
                    if (randomMank == 1){
                        System.out.println("\nYou caught a Mankey! Congratulations!");
                        System.out.println("\nMankey has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(mankey);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Mankey escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playForest();
                }
            } if (randomNumber >= 9 && randomNumber <= 10) {
                System.out.println("\nYou have encountered a wild Snorlax! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomSnor = random.nextInt(3);
                    if (randomSnor == 1){
                        System.out.println("\nYou caught a Snorlax! Congratulations!");
                        System.out.println("\nSnorlax has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(snorlax);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Snorlax escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playForest();
                }
            }
        }
}