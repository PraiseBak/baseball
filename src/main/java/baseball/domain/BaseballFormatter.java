package baseball.domain;

import baseball.dto.BaseballResponseDto;
import baseball.dto.BaseballSameNumberDto;

public class BaseballFormatter {

    private static final String NOTHING = "낫싱";
    private static final String STRIKE = "스트라이크";
    private static final String BALL = "볼";
    private static final String GAME_END_STR = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final int MAX_STRIKE_COUNT = 3;

    public static BaseballResponseDto convertBaseballResponse(BaseballSameNumberDto baseballSameNumberDto) {
        StringBuilder resultStringBuilder = new StringBuilder();
        int ballCount = baseballSameNumberDto.getDiffLocationSameNumber();
        int strikeCount = baseballSameNumberDto.getSameLocationSameNumber();
        boolean gameEnd = false;
        if(strikeCount == MAX_STRIKE_COUNT){
            resultStringBuilder.append(GAME_END_STR);
            gameEnd = true;
            return new BaseballResponseDto(resultStringBuilder.toString(),gameEnd);
        }
        if(ballCount != 0){
            resultStringBuilder.append(ballCount + BALL + " ");
        }
        if(strikeCount != 0){
            resultStringBuilder.append(strikeCount + STRIKE + " ");
        }
        if(ballCount == 0 && strikeCount == 0){
            resultStringBuilder.append(NOTHING);
        }

        return new BaseballResponseDto(resultStringBuilder.toString(),gameEnd);
    }
}
