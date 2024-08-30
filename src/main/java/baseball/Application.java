package baseball;

import baseball.controller.BaseballGameController;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다."); // 게임 시작 메시지 출력
        BaseballGameController controller = new BaseballGameController();
        controller.run(); // 게임 실행
    }
}
