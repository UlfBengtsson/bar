package se.lexicon.ulf;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }

    public static boolean isAdult(int age)
    {
        return age >= 18;
    }

    public static boolean buyAlcohol(int age) {
        return age > 19;
    }

    public static String howStrongIsDrink(double alcoholVol) {

        if(alcoholVol == 0) {
            return "Alcohol free";
        }
        else if(alcoholVol < 1) {
            return "Drive safe";
        }
        else  if(alcoholVol < 3.5) {
            return "local store";
        }
        else {
            return "Alcohol license required";
        }
    }
}
