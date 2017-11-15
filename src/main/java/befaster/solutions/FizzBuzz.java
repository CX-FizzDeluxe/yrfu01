package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "fizz buzz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ = "fizz";
    public static final String THREE = "3";
    public static final String FIVE = "5";

    public static String fizzBuzz(Integer number) {
        String numberStr = number.toString();

        if(number%5 == 0){
            return numberStr.contains(THREE)?FIZZ_BUZZ:BUZZ;
        }else if(number%3 == 0){
            return numberStr.contains(FIVE)?FIZZ_BUZZ:FIZZ;
        }else {
            return numberStr.contains(FIVE)?BUZZ:(numberStr.contains(THREE)?FIZZ:number.toString());
        }
    }

}
