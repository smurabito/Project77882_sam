public class Location {

    //Attributes 
    private String name; 
    private String description; 
    //Array list of items?

    /**
     * Constructor
     */
    public Location(String name){
        this.name = name; 
    }

    //--METHODS--

    //--GETTERS--

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