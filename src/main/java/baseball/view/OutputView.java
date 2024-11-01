package baseball.view;

public class OutputView {

    private static final String START_GAME = "숫자 야구 게임을 시작합니다.";

    public static void printStr(String s) {
        System.out.println(s);
    }

    public static void startGame() {
        printStr(START_GAME);
    }
}
