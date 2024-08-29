package baseball.controller;

import baseball.constant.GameEnum;
import baseball.constant.IndexEnum;
import baseball.model.Computer;
import baseball.model.User;
import baseball.service.CountService;
import baseball.service.ValidatorService;
import baseball.view.EndView;
import baseball.view.HintView;
import baseball.view.StartView;
import camp.nextstep.edu.missionutils.Console;

/**
 * 게임의 시작과 종료를 관리하는 Controller 클래스
 */
public class GameController {

    private final Computer computer;
    private final User user;
    private final CountService countService;
    private final ValidatorService validatorService;
    private final StartView startView;
    private final HintView hintView;
    private final EndView endView;

    /**
     * GameController 생성자
     */
    public GameController(Computer computer, User user, CountService countService, ValidatorService validatorService, StartView startView, HintView hintView, EndView endView) {
        this.computer = computer;
        this.user = user;
        this.countService = countService;
        this.validatorService = validatorService;
        this.startView = startView;
        this.hintView = hintView;
        this.endView = endView;
    }

    /**
     * 게임 시작 메서드
     */
    public void start() {

        while (true) {
            computer.setRandomNumers();

            startView.printStartMessage();

            while (user.getReplay() == GameEnum.RESTART.getValue()) {

                startView.printEnterNumberMessage();
                String userInput = Console.readLine();

                validatorService.checkUserInput(userInput);

                int[] prediction = new int[IndexEnum.MAX.getValue()];

                changeToInt(userInput, prediction);

                int strike = countService.countStrike(prediction, computer.getNumbers());
                int ball = countService.countBall(prediction, computer.getNumbers());

                if (ball > 0) {
                    hintView.printBallMessage(ball);
                }

                if (strike > 0) {
                    hintView.printStrikeMessage(strike);
                }

                if (ball == 0 && strike == 0) {
                    hintView.printNothingMessage();
                }

                if (strike == IndexEnum.MAX.getValue() && ball == 0) {
                    System.out.println();
                    endView.printEndMessage();
                    endView.printReplayMessage();
                    user.setReplay(Integer.parseInt(Console.readLine()));
                    break;
                }

            }

            if (user.getReplay() == GameEnum.END.getValue()) {
                break;
            }

        }

    }

    private void changeToInt(String userInput, int[] prediction) {
        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            prediction[i] = userInput.charAt(i) - '0';
        }
    }

}
