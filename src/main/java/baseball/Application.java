package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    static boolean gameWon = false; // 게임 이겼는지 여부 확인하는 변수, 전역변수로 선언
    public static void main(String[] args) {
        System.out.println("숫자 야구 게임을 시작합니다."); // 게임 시작 메시지 출력

        boolean play = true;

        while(play){
            playGame();
            if(restartGame()){
                play = true;
            }
            if(!restartGame()){
                play = false;
            }
        }
    }

    private static void playGame(){
        int[] computerNumbers = generateComputerNumbers(); // 컴퓨터의 랜덤 숫자 생성

        while(!gameWon){
            int[] userNumbers = inputUserNumbers(); // 유저의 숫자 입력
            compareNumber(computerNumbers, userNumbers); // 컴퓨터의 숫자와 유저의 숫자 비교 후 출력
        }
    }

    private static int[] generateComputerNumbers() { // computer의 랜덤한 숫자를 저장하는 메서드
        int[] com = new int[3];

        // 1~9까지 랜덤한 숫자 배열에 집어넣기
        for (int i = 0; i < 3; i++) {
            com[i] = Randoms.pickNumberInRange(1, 9);
        }
        return com;
    }
    private static int[] inputUserNumbers() { // user의 숫자를 입력 받는 메서드
        int[] user = new int[3];

        try {
            System.out.print("숫자를 입력해주세요: ");
            String input = Console.readLine(); // 사용자의 입력을 받음

            // 입력 유효성 검사
            validateInput(input);

            // 입력값을 배열에 넣기
            for (int i = 0; i < 3; i++) {
                user[i] = Character.getNumericValue(input.charAt(i));
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1); // 예외 발생 시 애플리케이션 종료
        }

        return user;
    }

    private static void validateInput(String input) { // 입력 유효성 검사를 수행하는 메서드
        // 길이가 3이 아닌 경우
        if (input.length() != 3) {
            throw new IllegalArgumentException("입력값은 세 자리 숫자여야 합니다.");
        }

        // 숫자가 아닌 값이 포함된 경우
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException("입력값은 숫자여야 합니다.");
            }
        }

        // 각 자리 숫자가 1~9 범위 내에 있는지 확인
        for (int i = 0; i < input.length(); i++) {
            int digit = Character.getNumericValue(input.charAt(i));
            if (digit < 1 || digit > 9) {
                throw new IllegalArgumentException("각 숫자는 1에서 9 사이여야 합니다.");
            }
        }
    }

    private static void compareNumber(int[] com, int[] user){ // 숫자를 비교하는 메서드
        int strike = 0; // 스트라이크 개수
        int ball = 0; // 볼 개수

        for(int i=0; i<3; i++){
            if(com[i] == user[i]){
                strike ++;
            }else if(contains(com, user[i])){
                ball++;
            }
        }

        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else {
            if (ball != 0) {
                System.out.print(ball + "볼 ");
            }
            if (strike != 0) {
                System.out.print(strike + "스트라이크");
            }
            System.out.println();
        }

        if(strike == 3){
            isWinGame(); // strike 3이 나오면 isWinGame() 메서드 호출
        }
    }
    private static boolean contains(int[] array, int value) { // 배열에 특정 값이 있는지 확인하는 메서드
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    private static void isWinGame(){ // game이 이겼으면 gameWon 변수 true로 변경
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        gameWon = true;
    }

    private static boolean restartGame(){ // game 재시작 여부를 확인하는 메서드
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();

        if(input.equals("1")) return true;
        if(input.equals("2")) return false;
        return false;
    }
}
