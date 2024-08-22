package baseball.model;

import baseball.constant.IndexEnum;
import baseball.constant.RandomRangeEnum;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private int[] numbers = new int[IndexEnum.MAX.getValue()];

    public Computer() {

    }

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

    public int[] getNumbers() {
        return numbers;
    }

}
