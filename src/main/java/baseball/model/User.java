package baseball.model;

import baseball.constant.GameEnum;

public class User {
    private int replay;

    public User() {
        this.replay = GameEnum.RESTART.getValue();
    }

    public void setReplay(int replay) {
        this.replay = replay;
    }

    public int getReplay() {
        return replay;
    }
}
