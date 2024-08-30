package baseball;

import baseball.controller.BaseballGameController;
import baseball.constants.MessageConstants;

public class Application {
    public static void main(String[] args) {
        System.out.println(MessageConstants.GAME_START_MESSAGE); // 게임 시작 메시지 출력
        BaseballGameController controller = new BaseballGameController();
        controller.run(); // 게임 실행
    }
}
