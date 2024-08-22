package baseball;

import baseball.model.Computer;
import baseball.view.EndView;
import baseball.view.HintView;
import baseball.view.StartView;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        while (true) {
            int flag = -1;
            int replay = 0;


            Computer computer = new Computer();
            computer.setRandomNumers();

            StartView startView = new StartView();
            startView.printStartMessage();

            HintView hintView = new HintView();
            EndView endView = new EndView();

            while (flag == -1) {
                startView.printEnterNumberMessage();
                String userInput = Console.readLine();

                if (userInput.length() != 3) {
                    throw new IllegalArgumentException("3자리 정수를 입력해주세요.");
                }

                List<Integer> prediction = new ArrayList<>(3);
                for (int i = 0; i < 3; i++) {
                    prediction.add((int) userInput.charAt(i) - '0');
                }

                int strike = 0, ball = 0;
                for (int i = 0; i < 3; i++) {
                    if (prediction.get(i) == computer.getNumbers()[i]) {
                        strike++;
                    }
                    for (int j = 0; j < 3; j++) {
                        if (prediction.get(i) == computer.getNumbers()[j] && i != j) {
                            ball++;
                        }
                    }
                }

                if (ball > 0) {
                    hintView.printBallMessage(ball);
                }

                if (strike > 0) {
                    hintView.printStrikeMessage(strike);
                }

                if (ball == 0 && strike == 0) {
                    hintView.printNothingMessage();
                }

                if (strike == 3 && ball == 0) {
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
