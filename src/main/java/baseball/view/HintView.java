package baseball.view;

import baseball.constant.ViewEnum;

/**
 * 힌트와 관련된 메시지를 출력 하는 View 클래스
 */
public class HintView {

    /**
     * HintView 기본 생성자
     */
    public HintView() {

    }

    /**
     * Ball 개수를 출력 하는 메서드
     *
     * @param ball
     */
    public void printBallMessage(int ball) {
        System.out.print(ball + ViewEnum.BALL_HINT.getMessage());
    }

    /**
     * Strike 개수를 출력 하는 메서드
     *
     * @param strike
     */
    public void printStrikeMessage(int strike) {
        System.out.println(strike + ViewEnum.STRIKE_HINT.getMessage());
    }

    /**
     * 낫싱 문구를 출력 하는 메서드
     */
    public void printNothingMessage() {
        System.out.println(ViewEnum.NOTHING_HINT.getMessage());
    }

}
