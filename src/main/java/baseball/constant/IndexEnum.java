package baseball.constant;

public enum IndexEnum {
    MAX(3);

    private int value;

    public int getValue() {
        return value;
    }

    IndexEnum(int value) {
        this.value = value;
    }

}
