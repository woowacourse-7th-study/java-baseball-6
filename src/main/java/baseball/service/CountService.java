package baseball.service;

import baseball.constant.IndexEnum;

public class CountService {

    public CountService() {

    }

    public int countStrike(int[] prediction, int[] computer) {
        int strike = 0;
        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            if (prediction[i] == computer[i]) {
                strike++;
            }
        }
        return strike;
    }

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
