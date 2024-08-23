package baseball.constant;

/**
 * 랜덤 수의 범위 중 시작과 끝 정보를 모아둔 Enum 클래스
 */
public enum RandomRangeEnum {
    START(1),
    END(9);

    private int value;

    /**
     * value 멤버 변수에 대한 getter 메서드
     *
     * @return
     */
    public int getValue() {
        return value;
    }

    /**
     * RandomRangeEnum 생성자
     *
     * @param value
     */
    RandomRangeEnum(int value) {
        this.value = value;
    }
}
