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

        if(isDeluxe){
            if(number%15 == 0 || numberStr.contains(FIVE) && numberStr.contains(THREE)){
                builder.append(FIZZ).append(" ").append(BUZZ).append(" ").append(DELUXE);
            }else{
                builder.append(DELUXE);
            }
        }
        else if(number%15 == 0){
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
        }else{
            builder.append(numberStr);
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        System.out.println(fizzBuzz(5555555));
        System.out.println(fizzBuzz(1));
        System.out.println(fizzBuzz(333));
        System.out.println(fizzBuzz(395));
    }

}
