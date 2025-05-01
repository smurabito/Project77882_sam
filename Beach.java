import java.util.Random;
import java.util.Scanner;

public class Beach extends Location{ 
//do we need location anymore since we aren't doing coordinates?
    Random random = new Random();
    int randomNumber = random.nextInt(10);
        
    Pokemon magikarp = new Pokemon("Magikarp");
    Pokemon poliwag = new Pokemon("Poliwag");
    Pokemon ditto = new Pokemon("Ditto"); 

    //Attributes 
    private String name; 
    private String description; 

    /**
    * Constructor  
    */
    public Beach (String name){
        super(name); 
        description = "You are at the Beach!";
    }

        public void playBeach() {
            if (randomNumber >= 1 && randomNumber <= 4) {
                System.out.println("\nYou have encountered a wild Magikarp! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomCarp = random.nextInt(2);
                    if (randomCarp == 1){
                        System.out.println("\nYou caught a Magikarp! Congratulations!");
                        System.out.println("\nMagikarp has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(magikarp);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Magikarp escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playBeach();
                }
            } if (randomNumber >= 5 && randomNumber <= 8) {
                System.out.println("\nYou have encountered a wild Poliwag! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomWag = random.nextInt(2);
                    if (randomWag == 1){
                        System.out.println("\nYou caught a Poliwag! Congratulations!");
                        System.out.println("\nPoliwag has been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(poliwag);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Poliwag escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playBeach();
                }
            }
            if (randomNumber >= 9 && randomNumber <= 10) {
                System.out.println("\nYou have encountered a wild Ditto! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomWag = random.nextInt(3);
                    if (randomWag == 1){
                        System.out.println("\nYou caught a Ditto! Congratulations!");
                        System.out.println("\nDittohas been sent back to your farm. You will return to your farm now!\n");
                        Main.farm.addPokemon(ditto);
                        Main.farm.play();
                    } else {
                        System.out.println("\nSorry, the Ditto escaped! You will return to your farm now!\n");
                        Main.farm.play();
                }} else if (userChoice.toLowerCase().equals("n")) {
                    System.out.println("\nYou have chosen to go home. You will return to your farm now!\n");
                    Main.farm.play();
                } else {
                    System.out.println("\nI don't know that command. Please type in 'y' or 'n'.");
                    playBeach();
                }
            }
        }
    }


//we can have the random odds generator, if statements in a loop?
// possible outcomes at the beach:
// 1. encounter a magikarp (maybe 1/3 odds?)
// 2. encounter a 

