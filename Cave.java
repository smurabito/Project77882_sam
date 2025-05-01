import java.util.Random;
import java.util.Scanner;

public class Cave extends Location{
    Random random = new Random();
    int randomNumber = random.nextInt(10);
        
    Pokemon zubat = new Pokemon("Zubat");
    Pokemon grimer = new Pokemon("Grimer");
    Pokemon gengar = new Pokemon("Gengar"); 

    //Attributes 
    private String name; 
    private String description; 

       /**
    * Constructor  
    */
    public Cave (String name){
        super(name); 
        description = "You are at a Cave!";
    }
   
  public void playCave() {
            if (randomNumber >= 1 && randomNumber <= 4) {
                System.out.println("\nYou have encountered a wild Zubat! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomZub = random.nextInt(2);
                    if (randomZub == 1){
                        System.out.println("\nYou caught a Zubat! Congratulations!");
                        System.out.println("\nZubat has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(zubat);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Zubat escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playCave();
                }
            } if (randomNumber >= 5 && randomNumber <= 8) {
                System.out.println("\nYou have encountered a wild Grimer! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomGrim = random.nextInt(2);
                    if (randomGrim == 1){
                        System.out.println("\nYou caught a Grimer! Congratulations!");
                        System.out.println("\nGrimer has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(grimer);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Grimer escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playCave();
                }
            }
            if (randomNumber >= 9 && randomNumber <= 10) {
                System.out.println("\nYou have encountered a wild Gengar! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomGeng = random.nextInt(3);
                    if (randomGeng == 1){
                        System.out.println("\nYou caught a Gengar! Congratulations!");
                        System.out.println("\nGengar has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(gengar);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Gengar escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playCave();
                }
            }
        }
    }
