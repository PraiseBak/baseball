package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class BaseballRandomNumber {

    private final static int RANDOM_NUMBER_SIZE = 3;

    public static List<Integer> getRandomBaseballNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < RANDOM_NUMBER_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }
}
