package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import baseball.exception.InputValidator;

public class InputView {
    public static int[] inputUserNumbers() { // user의 숫자를 입력 받는 메서드
        System.out.print("숫자를 입력해주세요: ");
        String input = Console.readLine(); // 사용자의 입력을 받음

        InputValidator.validateInput(input); // 입력 유효성 검사

        int[] userNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            userNumbers[i] = Character.getNumericValue(input.charAt(i)); // 입력값을 배열에 넣기
        }

        return userNumbers;
    }

    public static boolean restartGame() { // game 재시작 여부를 확인하는 메서드
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();

        if (input.equals("1")) return true;
        if (input.equals("2")) return false;

        throw new IllegalArgumentException("잘못된 입력입니다. 게임을 종료합니다.");
    }
}
