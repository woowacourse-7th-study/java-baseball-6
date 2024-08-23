package baseball.constant;

/**
 * 정수 개수에 대한 정보를 담은 Enum 클래스
 */
public enum IndexEnum {
    MAX(3);

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
     * IndexEnum 생성자
     *
     * @param value
     */
    IndexEnum(int value) {
        this.value = value;
    }

}
