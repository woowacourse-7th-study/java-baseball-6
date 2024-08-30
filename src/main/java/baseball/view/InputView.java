package baseball.view;

import baseball.constants.GameConstants;
import camp.nextstep.edu.missionutils.Console;
import baseball.exception.InputValidator;
import baseball.constants.MessageConstants;
import baseball.constants.GameOption;

public class InputView {
    public static int[] inputUserNumbers() { // user의 숫자를 입력 받는 메서드
        System.out.print(MessageConstants.INPUT_PROMPT_MESSAGE);
        String input = Console.readLine(); // 사용자의 입력을 받음

        InputValidator.validateInput(input); // 입력 유효성 검사

        int[] userNumbers = new int[GameConstants.NUMBER_LENGTH];
        for (int i = 0; i < GameConstants.NUMBER_LENGTH; i++) {
            userNumbers[i] = Character.getNumericValue(input.charAt(i)); // 입력값을 배열에 넣기
        }

        return userNumbers;
    }

    public static boolean restartGame() { // game 재시작 여부를 확인하는 메서드
        System.out.println(MessageConstants.RESTART_PROMPT_MESSAGE);
        String input = Console.readLine();

        try {
            GameOption option = GameOption.from(Integer.parseInt(input));
            return option == GameOption.RESTART;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(MessageConstants.INVALID_INPUT_MESSAGE);
        }
    }
}
