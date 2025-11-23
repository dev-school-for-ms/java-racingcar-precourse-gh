package racingcar;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        InputView inputView = new InputView();
        RacingGame racingGame = new RacingGame();

        String[] carNamesInput = inputView.readCarNames(); // 자동차 이름
        int numInput = inputView.readNumber();  // 게임 실행 횟수
        OutputView.result();  // "실행결과"
        racingGame.play(carNamesInput, numInput); // 게임 실행
    }
}
