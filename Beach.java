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
        description = "You are in a Beach!";
    }

        public void playBeach() {
            if (randomNumber >= 1 && randomNumber <= 4) {
                System.out.println("You have encountered a wild Magikarp! Will you catch it? Press 'y' to attempt to catch it or 'n' to go home!");
                Scanner stayRun = new Scanner(System.in); 
                String userChoice = stayRun.nextLine();
                if (userChoice.toLowerCase().equals("y")) {
                    int randomCarp = random.nextInt(2);
                    if (randomCarp == 1){
                        System.out.println("You caught a Magikarp! Congratulations!");
                        System.out.println("Magikarp has been sent back to your farm. You will return to your farm now!");
                        Main.farm.addPokemon(magikarp);
                        
                    } else {
                        System.out.println("")
    
                    }
    
    
    
    
    
                    System.err.println("");
                }
     
            } if (randomNumber == 2) {
                System.out.println("Magikarp");
            }
            
        }
        //probably a way to make it a range so I don't have to repeat it, couldn't figure it out

    }


//we can have the random odds generator, if statements in a loop?
// possible outcomes at the beach:
// 1. encounter a magikarp (maybe 1/3 odds?)
// 2. encounter a 

