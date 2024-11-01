package baseball.view;


import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final static String INPUT_NUMBER_STR = "숫자를 입력해주세요 : ";
    private final static String INPUT_CONTINUE_STR = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private static String input(){
        return Console.readLine();
    }

    public static String inputNumber() {
        OutputView.printStr(INPUT_NUMBER_STR);
        return input();
    }

    public static String inputContinue() {
        OutputView.printStr(INPUT_CONTINUE_STR);
        return input();
    }
}
