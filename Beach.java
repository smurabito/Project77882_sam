public class Beach extends Location{

    //Attributes 
    private String name; 
    private String description; 
    private int x; 
    private int y; 

    public Beach (String name, int x, int y){
        super(name, x, y); 
        description = "You are on a Beach!"; 
    }
}