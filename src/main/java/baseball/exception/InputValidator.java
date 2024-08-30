package baseball.exception;

public class InputValidator {
    public static void validateInput(String input) { // 입력 유효성 검사를 수행하는 메서드
        // 길이가 3이 아닌 경우
        if (input.length() != 3) {
            throw new IllegalArgumentException("입력값은 세 자리 숫자여야 합니다.");
        }

        // 숫자가 아닌 값이 포함된 경우
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException("입력값은 숫자여야 합니다.");
            }
        }

        // 각 자리 숫자가 1~9 범위 내에 있는지 확인
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            if (digit < 1 || digit > 9) {
                throw new IllegalArgumentException("각 숫자는 1에서 9 사이여야 합니다.");
            }
        }

        // 중복된 숫자가 있는지 확인
        if (input.charAt(0) == input.charAt(1) || input.charAt(0) == input.charAt(2) || input.charAt(1) == input.charAt(2)) {
            throw new IllegalArgumentException("입력값은 중복되지 않은 숫자여야 합니다.");
        }
    }
}
