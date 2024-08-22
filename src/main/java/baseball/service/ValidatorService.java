package baseball.service;

public class ValidatorService {

    public ValidatorService() {

    }

    public void checkUserInput(String userInput) {
        if (userInput.length() != 3) {
            throw new IllegalArgumentException("3자리 정수를 입력해주세요.");
        }
    }

}
