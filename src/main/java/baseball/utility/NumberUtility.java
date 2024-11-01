package baseball.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class NumberUtility {

    private final static String IS_NUMBER_REGEX = "^[0-9]+$";

    public static boolean isNumber(String userInput){
        return Pattern.matches(IS_NUMBER_REGEX,userInput);
    }

    public static int toNumber(String userNumber) {
        return Integer.parseInt(userNumber);
    }

    public static List<Integer> charArrToIntegerList(char[] userNumber) {
        List<Integer> integerList = new ArrayList<>();
        for(char ch : userNumber){
            integerList.add(ch - '0');
        }
        return integerList;
    }
}
