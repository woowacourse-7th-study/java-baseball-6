package baseball.view;

import baseball.constant.ViewEnum;

public class EndView {

    public EndView() {

    }

    public void printEndMessage() {
        System.out.println(ViewEnum.END.getMessage());
    }

    public void printReplayMessage() {
        System.out.println(ViewEnum.ENTER_REPLAY.getMessage());
    }

}
