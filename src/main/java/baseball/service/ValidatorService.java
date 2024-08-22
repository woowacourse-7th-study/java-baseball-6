package baseball.service;

import baseball.constant.ExceptionEnum;

public class ValidatorService {

    public ValidatorService() {

    }

    public void checkUserInput(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException(ExceptionEnum.THREE.getMessage());
        }
    }

}
