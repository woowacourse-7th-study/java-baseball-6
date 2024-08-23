package baseball.model;

import baseball.constant.IndexEnum;
import baseball.constant.RandomRangeEnum;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

/**
 * 상대방 컴퓨터 역할을 하는 Model 클래스
 */
public class Computer {

    /**
     * 랜덤 정수 3개를 저장할 numbers 멤버 변수
     */
    private int[] numbers = new int[IndexEnum.MAX.getValue()];

    /**
     * Computer 기본 생성자
     */
    public Computer() {

    }

    /**
     * numbers 멤버 변수 초기 값 세팅 하는 메서드
     */
    public void setRandomNumers() {
        List<Integer> numberList = new ArrayList<>();

        while (numberList.size() < IndexEnum.MAX.getValue()) {
            int randomNumber = Randoms.pickNumberInRange(RandomRangeEnum.START.getValue(), RandomRangeEnum.END.getValue());
            if (!numberList.contains(randomNumber)) {
                numberList.add(randomNumber);
            }
        }

        for (int i = 0; i < IndexEnum.MAX.getValue(); i++) {
            this.numbers[i] = numberList.get(i);
        }

    }


    /**
     * number 멤버 변수에 대한 getter 메서드
     *
     * @return
     */
    public int[] getNumbers() {
        return numbers;
    }

}
