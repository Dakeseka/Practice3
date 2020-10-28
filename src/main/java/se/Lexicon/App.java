package se.Lexicon;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
        //Make an integer called score and assign a value to it. Create an if –
        //else statement that should print out ”you passed” if the score is
        //above or equals to 65. If score is below 65 it should print ”you did not
        //pass”.
        int scoredPoints = 100;

        int minimumPoints = 65;
        int maxPoint = 100;

        if (scoredPoints < minimumPoints){
            System.out.println("You did not pass");

        }
        if (scoredPoints >= minimumPoints){
            System.out.println("You passed!");

            //Just extra for practise


            if (scoredPoints == maxPoint){
                System.out.println("You also scored full points!");

                //How do I make the program only say the second print if the scoredPoints are full?
            }

        }



    }
}
