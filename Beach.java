import java.util.Random;

public class Beach { 
//do we need location anymore since we aren't doing coordinates?
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        
        //probably a way to make it a range so I don't have to repeat it, couldn't figure it out
        if (randomNumber == 1){
            System.out.println("Magikarp");
        } if (randomNumber == 2) {
            System.out.println("Magikarp");
        }

    }


//we can have the random odds generator, if statements in a loop?
// possible outcomes at the beach:
// 1. encounter a magikarp (maybe 1/3 odds?)
// 2. encounter a 

}