package baseball.constants;

public enum GameOption {
    RESTART(1),
    QUIT(2);

    private final int value;

    GameOption(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static GameOption from(int value) {
        for (GameOption option : GameOption.values()) {
            if (option.getValue() == value) {
                return option;
            }
        }
        throw new IllegalArgumentException("Invalid value: " + value);
    }
}
