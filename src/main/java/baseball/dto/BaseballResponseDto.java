package baseball.dto;

public class BaseballResponseDto {

    private final String result;
    private final boolean end;

    public BaseballResponseDto(String result, boolean end) {
        this.result = result;
        this.end = end;
    }

    public String getResult() {
        return result;
    }

    public boolean isEnd() {
        return end;
    }
}