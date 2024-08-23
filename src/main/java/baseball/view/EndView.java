package baseball.view;

import baseball.constant.ViewEnum;

/**
 * 게임 종료 문구와 관련된 메시지를 출력 하는 View 클래스
 */
public class EndView {

    /**
     * EndView 기본 생성자
     */
    public EndView() {

    }

    /**
     * 게임 종료 문구를 출력 하는 메서드
     */
    public void printEndMessage() {
        System.out.println(ViewEnum.END.getMessage());
    }

    /**
     * 게임 재시작 여부 문구 출력 하는 메서드
     */
    public void printReplayMessage() {
        System.out.println(ViewEnum.ENTER_REPLAY.getMessage());
    }

}
