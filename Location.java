public class Location {

    //Attributes 
    private String name; 
    private String description; 
    private int x; 
    private int y; 
    //Array list of items?

    /**
     * Constructor
     */
    public Location(String name, int x, int y){
        this.name = name; 
        this.x = x;
        this.y = y; 
    }

    //--METHODS--

    //--GETTERS--
    /**
     * @return x
     */
    public int getX(){
        return x; 
    }
    /**
     * @return Y
     */
    public int getY(){
        return y; 
    }
    /**
     * @return name
     */
    public String getName(){
        return name; 
    }
    /**
     * @return description
     */
    public String look(){
        return description; 
    }

    public void setDescription(String des){
        description = des; 
    }
}