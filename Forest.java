public class Forest extends Location{

    //Attributes 
    private String name; 
    private String description; 
    private int x; 
    private int y;

    /**
     * Constructor  
     */
    public Forest (String name, int x, int y){
        super(name, x, y); 
        description = "You are in a Forest!";
    }
}