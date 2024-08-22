package baseball.controller;

import baseball.constant.IndexEnum;
import baseball.model.Computer;
import baseball.service.CountService;
import baseball.service.ValidatorService;
import baseball.view.EndView;
import baseball.view.HintView;
import baseball.view.StartView;
import camp.nextstep.edu.missionutils.Console;

public class GameController {

    public GameController() {

    }

    public void startGame() {
        while (true) {
            int flag = -1;
            int replay = 0;

            Computer computer = new Computer();
            computer.setRandomNumers();

            StartView startView = new StartView();
            startView.printStartMessage();

            HintView hintView = new HintView();

            EndView endView = new EndView();

            ValidatorService validatorService = new ValidatorService();

            CountService countService = new CountService();

            while (flag == -1) {
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
                    flag = 1;
                    endView.printReplayMessage();
                    replay = Integer.parseInt(Console.readLine());
                }

            }

            if (replay == 2) {
                break;
            }

        }

    }

}
