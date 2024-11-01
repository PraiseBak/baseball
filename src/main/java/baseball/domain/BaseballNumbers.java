package baseball.domain;

import baseball.dto.BaseballSameNumberDto;
import baseball.utility.NumberUtility;
import java.util.List;

public class BaseballNumbers {

    private final List<Integer> baseballNumberList;

    public BaseballNumbers(List<Integer> baseballNumberList) {
        this.baseballNumberList = baseballNumberList;
    }

    public static BaseballNumbers createBaseballNumbers(List<Integer> baseballNumberList) {
        return new BaseballNumbers(baseballNumberList);
    }

    public static BaseballNumbers createBaseballNumbers(String userNumber) {
        return createBaseballNumbers(NumberUtility.charArrToIntegerList(userNumber.toCharArray()));
    }

    public BaseballSameNumberDto calSameNumber(BaseballNumbers userBaseballNumbers) {
        int strike = 0;
        int ball = 0;
        for(int idx=0;idx<baseballNumberList.size();idx++){
            if(isSameLocationSameNumber(idx,userBaseballNumbers)){
                strike++;
                continue;
            }
            if(isDiffLocationSameNumber(idx,userBaseballNumbers)){
                ball++;
            }
        }
        return new BaseballSameNumberDto(strike,ball);

    }

    private boolean isDiffLocationSameNumber(int idx, BaseballNumbers userBaseballNumbers) {
        int userBaseballNumber = userBaseballNumbers.getNumberByIdx(idx);
        for (int i = 0; i < baseballNumberList.size(); i++) {
            if(idx == i) continue;
            if(userBaseballNumber == this.getNumberByIdx(i)){
                return true;
            }
        }
        return false;
    }

    public int getNumberByIdx(int idx){
        return baseballNumberList.get(idx);
    }

    public boolean isSameLocationSameNumber(int idx, BaseballNumbers userBaseballNumbers){
        if(getNumberByIdx(idx) == userBaseballNumbers.getNumberByIdx(idx)){
            return true;
        }
        return false;
    }
}
