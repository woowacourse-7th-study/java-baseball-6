package baseball;

import baseball.controller.GameController;
import baseball.model.Computer;
import baseball.model.User;
import baseball.service.CountService;
import baseball.service.ValidatorService;
import baseball.view.EndView;
import baseball.view.HintView;
import baseball.view.StartView;

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
        GameController gameController = new GameController(new Computer(), new User(), new CountService(), new ValidatorService(), new StartView(), new HintView(), new EndView());
        gameController.start();
    }
}
