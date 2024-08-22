package baseball.view;

public class HintView {

    public HintView() {

    }

    public void printBallMessage(int ball) {
        System.out.print(ball + "볼 ");
    }

    public void printStrikeMessage(int strike) {
        System.out.println(strike + "스트라이크");
    }

    public void printNothingMessage() {
        System.out.println("낫싱");
    }

}
