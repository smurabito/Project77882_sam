public class Pokemon {
    //Attributes 
    private String name; 
    private int happiness = 20; 
    private int experience; 
    private static int maxHappiness = 100; 
    private static int maxExperience = 100;  

    /**
     *  constructor
     * @param name the pokemon's name 
     */
    public Pokemon (String name){
        this.name = name; 
    }


    //--METHODS--

    //--SETTERS--
    /**
     * lowers happiness
     */
    public void lowerHappiness(){
        happiness = happiness - 5; 
        if (happiness < 0){
            happiness = 0; 
            System.out.println("Your pokemon got too upset and decided to run away!"); 
        } else if (happiness > 0 || happiness < 10){
            System.out.println("Your pokemon is upset, and is thinking about running away."); 
        }
    }
    /**
     * increases happiness
     */
    public void increaseHappiness(){
        happiness = happiness + 10; 
        if (happiness > maxHappiness){
            happiness = maxHappiness; 
        }
    }
    /**
     * increases expierence 
     */
    public void increaseExpierence(){
        experience = experience + 20; 
        if (experience > maxExperience){
            experience = maxExperience; 
        }
    }

    //--GETTERS--
    /**
     * @return name 
     */
    public String getName(){
        return name; 
    }
    /**
     * @return happiness
     */
    public int getHappiness(){
        return happiness; 
    }
    /**
     * @return expierence 
     */
    public int getExpierence(){
        return experience; 
    }
}
