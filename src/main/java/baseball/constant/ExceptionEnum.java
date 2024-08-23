package baseball.constant;

/**
 * 예외 발생 시 출력 할 문구를 모아둔 Enum 클래스
 */
public enum ExceptionEnum {

    THREE("3자리 정수를 입력해주세요."),
    DUP("중복되지 않은 정수를 입력해주세요."),
    RANGE("1부터 9까지의 정수를 입력해주세요."),
    INT("정수를 입력해주세요.");

    private final String message;

    /**
     * message 멤버 변수에 대한 getter 메서드
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * ExceptionEnum 생성자
     *
     * @param message
     */
    ExceptionEnum(String message) {
        this.message = message;
    }

}
