package baseball.model;

import baseball.constant.RandomRangeEnum;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static final int MAX_NUM = 3;

    private int[] numbers = new int[MAX_NUM];

    public Computer() {

    }

    public void setRandomNumers() {
        List<Integer> numberList = new ArrayList<>();

        while (numberList.size() < MAX_NUM) {
            int randomNumber = Randoms.pickNumberInRange(RandomRangeEnum.START.getValue(), RandomRangeEnum.END.getValue());
            if (!numberList.contains(randomNumber)) {
                numberList.add(randomNumber);
            }
        }

        for (int i = 0; i < MAX_NUM; i++) {
            this.numbers[i] = numberList.get(i);
        }

    }

    public int[] getNumbers() {
        return numbers;
    }

}
