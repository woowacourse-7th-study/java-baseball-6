package baseball.util;

public class NumberComparator {
    public static int countStrikes(int[] com, int[] user) { // 스트라이크 개수를 계산하는 메서드
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (com[i] == user[i]) {
                strike++;
            }
        }
        return strike;
    }

    public static int countBalls(int[] com, int[] user) { // 볼 개수를 계산하는 메서드
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (com[i] != user[i] && Validator.contains(com, user[i])) {
                ball++;
            }
        }
        return ball;
    }
}
