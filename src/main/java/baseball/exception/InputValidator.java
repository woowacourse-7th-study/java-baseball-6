package baseball.exception;

import baseball.constants.MessageConstants;
import baseball.constants.GameConstants;

public class InputValidator {
    public static void validateInput(String input) { // 입력 유효성 검사를 수행하는 메서드
        // 길이가 3이 아닌 경우
        if (input.length() != GameConstants.NUMBER_LENGTH) {
            throw new IllegalArgumentException(MessageConstants.INVALID_LENGTH_MESSAGE);
        }

        // 숫자가 아닌 값이 포함된 경우
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException(MessageConstants.INVALID_DIGIT_MESSAGE);
            }
        }

        // 각 자리 숫자가 1~9 범위 내에 있는지 확인
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            if (digit < GameConstants.MIN_NUMBER || digit > GameConstants.MAX_NUMBER) {
                throw new IllegalArgumentException(MessageConstants.INVALID_RANGE_MESSAGE);
            }
        }

        // 중복된 숫자가 있는지 확인
        if (input.charAt(0) == input.charAt(1) || input.charAt(0) == input.charAt(2) || input.charAt(1) == input.charAt(2)) {
            throw new IllegalArgumentException(MessageConstants.DUPLICATE_NUMBER_MESSAGE);
        }
    }
}
