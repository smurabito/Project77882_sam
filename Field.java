public class Field extends Location {

    //Attributes 
    //Attributes 
    private String name; 
    private String description; 
    private int x; 
    private int y;

    /**
     * Constructor
     */
    public Field (String name, int x, int y){
        super(name, x, y); 
        description = "You are in a field!"; 
    }


}