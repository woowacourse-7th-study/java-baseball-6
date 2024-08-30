package baseball.model;

public class Player {
    private int[] numbers; // 유저의 숫자를 저장하는 배열

    public void setNumbers(int[] numbers) { // 유저의 숫자를 설정하는 메서드
        this.numbers = numbers;
    }

    public int[] getNumbers() { // 유저의 숫자를 반환하는 메서드
        return numbers;
    }
}
