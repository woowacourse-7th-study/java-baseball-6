package baseball.util;

public class Validator {
    public static boolean contains(int[] array, int value) { // 배열에 특정 값이 있는지 확인하는 메서드
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
