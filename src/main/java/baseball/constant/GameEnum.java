package baseball.constant;

/**
 * 게임 재시작과 종료에 대한 정보를 모아둔 Enum 클래스
 */
public enum GameEnum {
    RESTART(1), END(2);

    private int value;

    /**
     * GameEnum 생성자
     *
     * @param value
     */
    GameEnum(int value) {
        this.value = value;
    }

    /**
     * value 멤버 변수에 대한 getter 메서드
     *
     * @return
     */
    public int getValue() {
        return value;
    }

}
