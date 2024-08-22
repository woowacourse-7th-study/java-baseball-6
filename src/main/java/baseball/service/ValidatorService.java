package baseball.service;

import baseball.constant.ExceptionEnum;
import baseball.constant.IndexEnum;

public class ValidatorService {

    public ValidatorService() {

    }

    public void checkUserInput(String userInput) {
        if (userInput.length() != IndexEnum.MAX.getValue()) {
            throw new IllegalArgumentException(ExceptionEnum.THREE.getMessage());
        }
    }

}
