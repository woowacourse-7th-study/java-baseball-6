package baseball.service;

import baseball.constant.IndexEnum;

/**
 * 계산 하는 부분을 대신 처리 하는 Service 클래스
 */
public class CountService {

    /**
     * CountService 기본 생성자
     */
    public CountService() {

    }

    /**
     * Strike 개수를 계산 하는 메서드
     *
     * @param prediction 사용자의 예측 정수 3개
     * @param computer   컴퓨터의 랜덤 정수 3개
     * @return strike 개수
     */
    public int countStrike(int[] prediction, int[] computer) {
        int strike = 0;
        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            if (prediction[i] == computer[i]) {
                strike++;
            }
        }
        return strike;
    }

    /**
     * Ball 개수를 계산 하는 메서드
     *
     * @param prediction 사용자의 예측 정수 3개
     * @param computer   컴퓨터의 랜덤 정수 3개
     * @return ball 개수
     */
    public int countBall(int[] prediction, int[] computer) {
        int ball = 0;
        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            for (int j = 0; j < IndexEnum.MAX.getValue(); j++) {
                if (prediction[i] == computer[j] && i != j) {
                    ball++;
                }
            }
        }
        return ball;
    }

}
