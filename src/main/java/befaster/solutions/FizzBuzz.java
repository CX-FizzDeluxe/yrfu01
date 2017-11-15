package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "fizz buzz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ = "fizz";

    public static String fizzBuzz(Integer number) {
        if(number%15 == 0){
            return FIZZ_BUZZ;
        }else if(number%5 == 0){
            return BUZZ;
        }else if(number%3 == 0){
            return FIZZ;
        }else{
            return number.toString();
        }
    }

}
