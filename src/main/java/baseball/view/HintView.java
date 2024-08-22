package baseball.view;

import baseball.constant.ViewEnum;

public class HintView {

    public HintView() {

    }

    public void printBallMessage(int ball) {
        System.out.print(ball + ViewEnum.BALL_HINT.getMessage());
    }

    public void printStrikeMessage(int strike) {
        System.out.println(strike + ViewEnum.STRIKE_HINT.getMessage());
    }

    public void printNothingMessage() {
        System.out.println(ViewEnum.NOTHING_HINT.getMessage());
    }

}
