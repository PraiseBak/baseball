package baseball.dto;


public class BaseballSameNumberDto {

    private final int sameLocationSameNumber;
    private final int diffLocationSameNumber;

    public BaseballSameNumberDto(int sameLocationSameNumber, int diffLocationSameNumber) {
        this.sameLocationSameNumber = sameLocationSameNumber;
        this.diffLocationSameNumber = diffLocationSameNumber;
    }

    public int getSameLocationSameNumber() {
        return sameLocationSameNumber;
    }

    public int getDiffLocationSameNumber() {
        return diffLocationSameNumber;
    }
}