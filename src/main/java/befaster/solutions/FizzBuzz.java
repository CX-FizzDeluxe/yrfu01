package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.Arrays;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "fizz buzz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ = "fizz";
    public static final String DELUXE = "deluxe";
    public static final String FAKE = "fake";
    public static final String THREE = "3";
    public static final String FIVE = "5";

    public static String fizzBuzz(Integer number) {
        String numberStr = number.toString();
        boolean isDeluxe = (number%5 == 0 && numberStr.contains(FIVE)) || (number%3 == 0 && numberStr.contains(THREE));
        StringBuilder builder = new StringBuilder();
        if(number%15 == 0){
            builder.append(FIZZ).append(" ").append(BUZZ);
        } else if(number%5 == 0 || numberStr.contains(FIVE)){
            if(number%3==0 || numberStr.contains(THREE)){
                builder.append(FIZZ).append(" ").append(BUZZ);
            }else{
                builder.append(BUZZ);
            }
        }else if(number%3 == 0 || numberStr.contains(THREE)){
            if(number%5==0 || numberStr.contains(FIVE)){
                builder.append(FIZZ).append(" ").append(BUZZ);
            }else{
                builder.append(FIZZ);
            }
        }

        if(isDeluxe){
            if(number%2 != 0){
                builder.append(" ").append(FAKE);
            }
            builder.append(" ").append(DELUXE);
        }
        if(builder.length() == 0){
            builder.append(numberStr);
        }
        return builder.toString().trim();
    }
}
