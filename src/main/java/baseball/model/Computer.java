package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import baseball.util.Validator;
import baseball.constants.GameConstants;

public class Computer {
    private int[] numbers; // 컴퓨터의 숫자를 저장하는 배열

    public Computer() {
        this.numbers = generateComputerNumbers(); // 컴퓨터의 랜덤 숫자 생성
    }

    private int[] generateComputerNumbers() { // computer의 랜덤한 숫자를 저장하는 메서드
        int[] com = new int[GameConstants.NUMBER_LENGTH];

        // 1~9까지 랜덤한 숫자 배열에 집어넣기
        // 중복된 숫자 문제 해결
        for (int i = 0; i < GameConstants.NUMBER_LENGTH; i++) {
            int randomNum;
            do {
                randomNum = Randoms.pickNumberInRange(GameConstants.MIN_NUMBER, GameConstants.MAX_NUMBER);
            } while (Validator.contains(com, randomNum));
            com[i] = randomNum;
        }

        return com;
    }

    public int[] getNumbers() { // 컴퓨터의 숫자를 반환하는 메서드
        return numbers;
    }
}
