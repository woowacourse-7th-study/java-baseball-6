package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다."); // 게임 시작 메시지 출력
    }

    public static int[] generateComputerNumbers() { // computer의 랜덤한 숫자를 저장하는 메서드
        int[] com = new int[3];

        // 1~9까지 랜덤한 숫자 배열에 집어넣기
        for (int i = 0; i < 3; i++) {
            com[i] = Randoms.pickNumberInRange(1, 9);
        }
        return com;
    }
    public static int[] inputUserNumbers() { // user의 숫자를 입력 받는 메서드
        int[] user = new int[3];

        try {
            System.out.print("숫자를 입력해주세요: ");
            String input = Console.readLine(); // 사용자의 입력을 받음

            // 입력 유효성 검사
            validateInput(input);

            // 입력값을 배열에 넣기
            for (int i = 0; i < 3; i++) {
                user[i] = Character.getNumericValue(input.charAt(i));
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1); // 예외 발생 시 애플리케이션 종료
        }

        return user;
    }

    private static void validateInput(String input) { // 입력 유효성 검사를 수행하는 메서드
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
    }
}
