package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Hello {

    public static final String HELLO = "Hello %";

    public static String hello(String friendName) {
        return String.format(HELLO,friendName);
    }
}
