package baseball.controller;

import baseball.dto.BaseballResponseDto;
import baseball.dto.BaseballSameNumberDto;
import baseball.service.BaseballService;

public class BaseballController {
    
    private final BaseballService baseballService;

    public BaseballController(BaseballService baseballService){
        this.baseballService = baseballService;
    }
    
    public BaseballResponseDto baseball(String number) {
        return baseballService.doBaseball(number);
    }

    public void resetBaseball() {
        baseballService.initBaseball();
    }
}
