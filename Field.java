import java.util.Random;
import java.util.Scanner;

public class Field extends Location {
    Random random = new Random();
    int randomNumber = random.nextInt(10);
        
    Pokemon pidgey = new Pokemon("Pidgey");
    Pokemon eevee = new Pokemon("Eevee");
    Pokemon butterfree = new Pokemon("Butterfree"); 
    Pokemon dragonite = new Pokemon("Dragonite");

    //Attributes 
    private String name; 
    private String description; 

       /**
    * Constructor  
    */
    public Field (String name){
        super(name); 
        description = "You are in a Field!";
    }

    public void playField() {
            if (randomNumber >= 1 && randomNumber <= 3) {
                System.out.println("\nYou have encountered a wild Pidgey! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomPidg = random.nextInt(2);
                    if (randomPidg == 1){
                        System.out.println("\nYou caught a Pidgey! Congratulations!");
                        System.out.println("\nPidgey has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(pidgey);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Pidgey escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playField();
                }
            } if (randomNumber >= 4 && randomNumber <= 6) {
                System.out.println("\nYou have encountered a wild Eevee! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomEev = random.nextInt(2);
                    if (randomEev == 1){
                        System.out.println("\nYou caught a Eevee! Congratulations!");
                        System.out.println("\nEevee has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(eevee);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Eevee escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playField();
                }
            } if (randomNumber >= 7 && randomNumber <= 8) {
                System.out.println("\nYou have encountered a wild Butterfree! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomButt = random.nextInt(3);
                    if (randomButt == 1){
                        System.out.println("\nYou caught a Butterfree! Congratulations!");
                        System.out.println("\nButterfree has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(butterfree);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Butterfree escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playField();
                }
            }if (randomNumber >= 7 && randomNumber <= 8) {
                System.out.println("\nYou have encountered a wild Butterfree! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomButt = random.nextInt(3);
                    if (randomButt == 1){
                        System.out.println("\nYou caught a Butterfree! Congratulations!");
                        System.out.println("\nButterfree has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(butterfree);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Butterfree escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playField();
                }
            } if (randomNumber >= 9 && randomNumber <= 10) {
                System.out.println("\nYou have encountered a wild Dragonite! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomDrag = random.nextInt(2);
                    if (randomDrag == 1){
                        System.out.println("\nYou caught a Dragonite! Congratulations!");
                        System.out.println("\nDragonite has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(dragonite);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Dragonite escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playField();
                }

        }
    }
}