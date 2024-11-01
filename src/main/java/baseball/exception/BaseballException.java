package baseball.exception;

import baseball.domain.BaseballNumbers;

public class BaseballException extends IllegalArgumentException{

    public BaseballException(String msg){
        super(msg);
    }
}
