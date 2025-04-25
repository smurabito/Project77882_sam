public class Cave extends Location{

    //Attributes 
    private String name; 
    private String description; 
    private int x; 
    private int y;
    private int hi; 

    /**
     * Constructor 
     */
    public Cave(String name, int x, int y){
        super(name, x, y); 
        description = "You are in a cave!";
    }
}