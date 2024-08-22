package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        while (true) {
            int flag = -1;
            int replay = 0;

            System.out.println("숫자 야구 게임을 시작합니다.");
            List<Integer> computer = new ArrayList<>();

            while (computer.size() < 3) {
                int randomNumber = Randoms.pickNumberInRange(1, 9);
                if (!computer.contains(randomNumber)) {
                    computer.add(randomNumber);
                }
            }

            while (flag == -1) {
                System.out.print("숫자를 입력해주세요 : ");
                String userInput = Console.readLine();

                if (userInput.length() != 3) {
                    throw new IllegalArgumentException("3자리 정수를 입력해주세요.");
                }

                List<Integer> prediction = new ArrayList<>(3);
                for (int i = 0; i < 3; i++) {
                    prediction.add((int) userInput.charAt(i) - '0');
                }

                int strike = 0, ball = 0;
                for (int i = 0; i < 3; i++) {
                    if (prediction.get(i).compareTo(computer.get(i)) == 0) {
                        strike++;
                    }
                    for (int j = 0; j < 3; j++) {
                        if (prediction.get(i).compareTo(computer.get(j)) == 0 && i != j) {
                            ball++;
                        }
                    }
                }

                if (ball > 0) {
                    System.out.print(ball + "볼 ");
                }

                if (strike > 0) {
                    System.out.println(strike + "스트라이크");
                }

                if (ball == 0 && strike == 0) {
                    System.out.println("낫싱");
                }

                if (strike == 3 && ball == 0) {
                    System.out.println();
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    flag = 1;
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    replay = Integer.parseInt(Console.readLine());
                }

            }

            if (replay == 2) {
                break;
            }

        }

    }
}
