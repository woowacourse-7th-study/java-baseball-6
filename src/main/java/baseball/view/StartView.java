package baseball.view;

import baseball.constant.ViewEnum;

/**
 * 게임 시작과 관련된 메시지를 출력 하는 View 클래스
 */
public class StartView {

    /**
     * StartView 기본 생성자
     */
    public StartView() {

    }

    /**
     * 시작 메시지를 출력 하는 메서드
     */
    public void printStartMessage() {
        System.out.println(ViewEnum.START.getMessage());
    }

    /**
     * 숫자 입력 문구를 출력 하는 메서드
     */
    public void printEnterNumberMessage() {
        System.out.print(ViewEnum.ENTER_NUMBER.getMessage());
    }

}
