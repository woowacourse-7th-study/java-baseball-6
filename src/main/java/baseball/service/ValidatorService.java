package baseball.service;

import baseball.constant.ExceptionEnum;
import baseball.constant.IndexEnum;
import baseball.constant.RandomRangeEnum;

public class ValidatorService {

    public ValidatorService() {

    }

    public void checkUserInput(String userInput) {
        if (userInput.length() != IndexEnum.MAX.getValue()) {
            throw new IllegalArgumentException(ExceptionEnum.THREE.getMessage());
        }

        if (userInput.charAt(0) == userInput.charAt(1) || userInput.charAt(1) == userInput.charAt(2) || userInput.charAt(0) == userInput.charAt(2)) {
            throw new IllegalArgumentException(ExceptionEnum.DUP.getMessage());
        }

        for (int i=0; i<IndexEnum.MAX.getValue(); i++) {
            if ((userInput.charAt(i) - '0') < RandomRangeEnum.START.getValue() && RandomRangeEnum.END.getValue() < userInput.charAt(i) - '0') {
                throw new IllegalArgumentException(ExceptionEnum.RANGE.getMessage());
            }
        }

        try {
            Integer.parseInt(userInput);
        } catch (Exception e) {
            throw new IllegalArgumentException(ExceptionEnum.INT.getMessage());
        }

    }

}
