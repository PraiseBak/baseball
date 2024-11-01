package baseball.domain;

import baseball.dto.BaseballSameNumberDto;
import baseball.exception.BaseballException;
import baseball.utility.NumberUtility;
import java.util.List;

public class Baseball {


    private final static String INVALID_INPUT_ERROR_MSG = "유효하지 않은 입력입니다";
    private static final int MIN_BASEBALL_NUMBER = 111;
    private static final int MAX_BASEBALL_NUMBER = 999;

    private final BaseballNumbers baseballNumbers;

    private Baseball(List<Integer> baseballNumberList){
        baseballNumbers = BaseballNumbers.createBaseballNumbers(baseballNumberList);
    }

    public static Baseball createBaseball(){
        List<Integer> randNumber = BaseballRandomNumber.getRandomBaseballNumber();
        return new Baseball(randNumber);
    }

    public BaseballSameNumberDto doBaseball(String userNumber){
        if(!isValidNumber(userNumber)){
            throw new BaseballException(INVALID_INPUT_ERROR_MSG);
        }

        BaseballNumbers userBaseballNumbers = BaseballNumbers.createBaseballNumbers(userNumber);
        return baseballNumbers.calSameNumber(userBaseballNumbers);
    }

    private boolean isValidNumber(String userNumber) {
        if(!NumberUtility.isNumber(userNumber)){
            return false;
        }
        if(!isInRangeNumber(userNumber)){
            return false;
        }
        return true;
    }

    private boolean isInRangeNumber(String userNumber) {
        int num = NumberUtility.toNumber(userNumber);
        if(num > MAX_BASEBALL_NUMBER){
            return false;
        }
        if(num < MIN_BASEBALL_NUMBER){
            return false;
        }
        return true;
    }

}
