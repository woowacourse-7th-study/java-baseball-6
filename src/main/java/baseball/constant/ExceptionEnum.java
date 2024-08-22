package baseball.constant;

public enum ExceptionEnum {

    THREE("3자리 정수를 입력해주세요.");

    private final String message;

    public String getMessage() {
        return message;
    }

    ExceptionEnum(String message) {
        this.message = message;
    }

}
