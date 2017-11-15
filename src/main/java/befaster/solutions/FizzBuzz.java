package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.Arrays;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "fizz buzz";
    public static final String BUZZ = "buzz";
    public static final String FIZZ = "fizz";
    public static final String DELUXE = "Deluxe";
    public static final String THREE = "3";
    public static final String FIVE = "5";

    public static String fizzBuzz(Integer number) {
        String numberStr = number.toString();
        boolean isDeluxe = number > 10 && numberStr.replaceAll(numberStr.substring(0,1),"").equals("");
        StringBuilder builder = new StringBuilder();
        if(number%15 == 0){
            builder.append(FIZZ).append(" ").append(BUZZ);
        } else if(number%5 == 0){
            return numberStr.contains(THREE)?FIZZ_BUZZ:BUZZ;
        }else if(number%3 == 0){
            return numberStr.contains(FIVE)?FIZZ_BUZZ:FIZZ;
        }else if(numberStr.contains(FIVE)){
            return numberStr.contains(THREE)?FIZZ_BUZZ:BUZZ;
        }else if(numberStr.contains(THREE)){
            return numberStr.contains(FIVE)?FIZZ_BUZZ:FIZZ;
        }else {
            return number.toString();
        }
        if(isDeluxe){
            builder.append(" ").append(DELUXE);
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(5555555));
    }

}
