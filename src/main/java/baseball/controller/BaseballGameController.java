package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.util.NumberComparator;

public class BaseballGameController {
    private boolean gameWon = false; // 게임 이겼는지 여부 확인하는 변수

    public void run() {
        boolean play = true; // 재시작을 하는지 확인하는 변수

        while (play) { // game 시작
            playGame();
            if (!restartGame()) {
                play = false;
            }
        }
    }

    private void playGame() {
        gameWon = false; // 새로운 게임이 시작되면 gameWon을 다시 false로 설정
        Computer computer = new Computer(); // 컴퓨터의 랜덤 숫자 생성
        Player player = new Player(); // 유저의 숫자 생성

        while (!gameWon) {
            player.setNumbers(InputView.inputUserNumbers()); // 유저의 숫자 입력
            int strike = NumberComparator.countStrikes(computer.getNumbers(), player.getNumbers()); // 스트라이크 개수 계산
            int ball = NumberComparator.countBalls(computer.getNumbers(), player.getNumbers()); // 볼 개수 계산
            OutputView.printResult(strike, ball); // 결과 출력

            if (strike == 3) {
                OutputView.printWinMessage(); // 이겼을 때 메시지 출력
                gameWon = true;
            }
        }
    }

    private boolean restartGame() { // game 재시작 여부를 확인하는 메서드
        return InputView.restartGame();
    }
}
