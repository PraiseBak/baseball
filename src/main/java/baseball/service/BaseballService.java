package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.BaseballFormatter;
import baseball.dto.BaseballResponseDto;
import baseball.dto.BaseballSameNumberDto;

public class BaseballService {

    private static Baseball baseball;

    public BaseballService(){
        initBaseball();
    }

    public BaseballResponseDto doBaseball(String userInput) {
        BaseballSameNumberDto baseballSameNumberDto = baseball.doBaseball(userInput);
        return getBaseballResult(baseballSameNumberDto);
    }

    private BaseballResponseDto getBaseballResult(BaseballSameNumberDto baseballSameNumberDto) {
        return BaseballFormatter.convertBaseballResponse(baseballSameNumberDto);
    }

    public void initBaseball() {
        baseball = Baseball.createBaseball();
    }
}
