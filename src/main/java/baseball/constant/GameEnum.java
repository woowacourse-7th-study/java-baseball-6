package baseball.constant;

public enum GameEnum {
    RESTART(1), END(2);

    private int value;

    GameEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
