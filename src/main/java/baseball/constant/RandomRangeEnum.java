package baseball.constant;

public enum RandomRangeEnum {
    START(1),
    END(9);

    private int value;

    public int getValue() {
        return value;
    }

    RandomRangeEnum(int value) {
        this.value = value;
    }
}
