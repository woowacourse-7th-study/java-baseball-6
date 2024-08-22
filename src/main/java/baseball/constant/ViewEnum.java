package baseball.constant;

public enum ViewEnum {

    START("숫자 야구 게임을 시작합니다."),
    ENTER_NUMBER("숫자를 입력해주세요 : "),
    BALL_HINT("볼 "),
    STRIKE_HINT("스트라이크"),
    NOTHING_HINT("낫싱"),
    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    ENTER_REPLAY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    final String message;

    public String getMessage() {
        return message;
    }

    private ViewEnum(String message) {
        this.message = message;
    }

}
