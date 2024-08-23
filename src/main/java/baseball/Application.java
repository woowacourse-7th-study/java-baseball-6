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
}
