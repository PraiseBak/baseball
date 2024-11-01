package baseball;

import baseball.controller.BaseballController;
import baseball.dto.BaseballResponseDto;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {

    public static void main(String[] args) {
        BaseballController baseballController = new BaseballController(new BaseballService());
        boolean endGame = false;
        OutputView.startGame();
        while (!endGame){
            BaseballResponseDto response = doBaseball(baseballController);
            if(!response.isEnd()){
                continue;
            }

            if(inputIsEnd()){
                endGame = true;
                continue;
            }
            baseballController.resetBaseball();
        }
    }

    private static BaseballResponseDto doBaseball(BaseballController baseballController) {
        String number = InputView.inputNumber();
        BaseballResponseDto response = baseballController.baseball(number);
        OutputView.printStr(response.getResult());
        return response;
    }

    private static boolean inputIsEnd() {
        String continueStr = InputView.inputContinue();
        if(continueStr.equals("2")){
            return true;
        }
        return false;
    }
}
