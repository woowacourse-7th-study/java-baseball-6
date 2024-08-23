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
}
