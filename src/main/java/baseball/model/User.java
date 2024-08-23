package baseball.model;

import baseball.constant.GameEnum;

/**
 * 사용자의 재시작 여부 정보를 담고 있는 Model 클래스
 */
public class User {

    /**
     * 게임 재시작 여부 정보가 담긴 멤버 변수
     */
    private int replay;

    /**
     * User 기본 생성자
     * replay 멤버 변수를 초기 값으로 세팅
     */
    public User() {
        this.replay = GameEnum.RESTART.getValue();
    }

    /**
     * replay 멤버 변수에 대한 setter 메서드
     *
     * @param replay
     */
    public void setReplay(int replay) {
        this.replay = replay;
    }

    /**
     * replay 멤버 변수에 대한 getter 메서드
     *
     * @return
     */
    public int getReplay() {
        return replay;
    }
}
