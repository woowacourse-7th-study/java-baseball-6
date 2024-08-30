package baseball.view;

import baseball.constants.MessageConstants;

public class OutputView {
    public static void printResult(int strike, int ball) { // 결과를 출력하는 메서드
        if (strike == 0 && ball == 0) {
            System.out.println(MessageConstants.NOTHING_MESSAGE);
        } else {
            if (ball != 0) {
                System.out.print(ball + "볼 ");
            }
            if (strike != 0) {
                System.out.print(strike + "스트라이크");
            }
            System.out.println();
        }
    }

    public static void printWinMessage() { // 승리 메시지 출력 메서드
        System.out.println(MessageConstants.WIN_MESSAGE);
    }
}
