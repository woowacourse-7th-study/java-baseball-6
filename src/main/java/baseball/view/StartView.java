package baseball.view;

import baseball.constant.ViewEnum;

public class StartView {

    public StartView() {

    }

    public void printStartMessage() {
        System.out.println(ViewEnum.START.getMessage());
    }

    public void printEnterNumberMessage() {
        System.out.print(ViewEnum.ENTER_NUMBER.getMessage());
    }

}
