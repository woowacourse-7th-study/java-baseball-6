package baseball.service;

import baseball.constant.ExceptionEnum;
import baseball.constant.IndexEnum;
import baseball.constant.RandomRangeEnum;

/**
 * 사용자의 입력 값에 대한 검증 과정을 대신 처리 하는 Service 클래스
 */
public class ValidatorService {

    /**
     * ValidatorService 기본 생성자
     */
    public ValidatorService() {

    }

    /**
     * 사용자의 입력 값에 대한 검증이 이루어지는 메서드
     *
     * @param userInput 사용자의 입력 값
     */
    public void checkUserInput(String userInput) {

        // 입력된 정수가 3개가 아닌 경우
        if (userInput.length() != IndexEnum.MAX.getValue()) {
            throw new IllegalArgumentException(ExceptionEnum.THREE.getMessage());
        }

        // 입력된 정수 중 중복 되는 수가 존재 하는 경우
        if (userInput.charAt(0) == userInput.charAt(1) || userInput.charAt(1) == userInput.charAt(2) || userInput.charAt(0) == userInput.charAt(2)) {
            throw new IllegalArgumentException(ExceptionEnum.DUP.getMessage());
        }

        // 입력된 정수 중 범위를 벗어난 수가 존재 하는 경우
        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            if ((userInput.charAt(i) - '0') < RandomRangeEnum.START.getValue() && RandomRangeEnum.END.getValue() < userInput.charAt(i) - '0') {
                throw new IllegalArgumentException(ExceptionEnum.RANGE.getMessage());
            }
        }

        // 입력된 값이 정수가 아닌 경우
        try {
            Integer.parseInt(userInput);
        } catch (Exception e) {
            throw new IllegalArgumentException(ExceptionEnum.INT.getMessage());
        }

    }

}
