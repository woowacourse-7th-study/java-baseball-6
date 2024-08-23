package baseball;

import baseball.controller.GameController;

/**
 * 게임이 시작되는 클래스
 */
public class Application {

    /**
     * 게임이 시작되는 메서드
     *
     * @param args
     */
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.startGame();
    }
}
