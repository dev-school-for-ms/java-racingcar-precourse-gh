package racingcar;

import camp.nextstep.edu.missionutils.Console;
import static racingcar.Validate.validateCarName;

public class InputView {
// 입력 받기

    public String[] readCarNames(){

        while(true){
            try {
                System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
                String carNames = Console.readLine();
                String[] carName = carNames.split(","); // 하나씩 배열에 넣기
                for(int i=0; i<carName.length; i++){
                    carName[i] = carName[i].trim(); // 공백 제거
                }
                validateCarName(carName);   // 5자 이내인지 검증

                return carName;
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }


    public int readNumber() {
        while(true){
            try {
                System.out.println("시도할 횟수는 몇회인가요?");
                return Integer.parseInt(Console.readLine());
            } catch(IllegalArgumentException e){
                System.out.println("[ERROR] 시도 횟수는 숫자여야합니다.");
            }
        }
    }
}
