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

    /**
     * GameController 기본 생성자
     */
    public GameController() {

    }

    /**
     * 게임 시작 메서드
     */
    public void start() {

        while (true) {

            User user = new User();

            Computer computer = new Computer();
            computer.setRandomNumers();

            StartView startView = new StartView();
            startView.printStartMessage();

            HintView hintView = new HintView();

            EndView endView = new EndView();

            ValidatorService validatorService = new ValidatorService();

            CountService countService = new CountService();

            while (user.getReplay() == GameEnum.RESTART.getValue()) {

                startView.printEnterNumberMessage();
                String userInput = Console.readLine();

                validatorService.checkUserInput(userInput);

                int[] prediction = new int[IndexEnum.MAX.getValue()];
                for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
                    prediction[i] = userInput.charAt(i) - '0';
                }

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

}
