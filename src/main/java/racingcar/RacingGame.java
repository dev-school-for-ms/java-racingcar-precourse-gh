package racingcar;

import java.util.*;
import camp.nextstep.edu.missionutils.Randoms;

public class RacingGame {
    public List<Car> carList = new ArrayList<>(); // 자동차들 담을 리스트 전역변수로 생성

    public void play(String[] carName, int num){
        for(int i=0; i<carName.length; i++){
            carList.add(new Car(carName[i]));   // carName 배열에서 하나씩 꺼내 객체 생성하고 리스트로 저장
        }

        // num 만큼 뽑고 움직이기
        for(int j=0; j<num; j++){
            playOneRound(carList, num);
            System.out.println();   // 라운드 구분
        }
        List<Car> winners = findWinners();  // 우승자 찾기
        OutputView.printWinners(winners);  // 우승자 출력하기
    }

    public void playOneRound(List<Car> carList, int num){
        for(int i=0; i<carList.size(); i++){
            Car car = carList.get(i);
            int random = Randoms.pickNumberInRange(0, 9);  // 0~9 사이 랜덤 수 뽑기

            if(random >= 4){
                car.move();
            }
            OutputView.printStatus(car);  // 게임실행 현황 출력하기
        }
    }


    public List<Car> findWinners(){
        // getPosition 중 max 찾기
        int maxPosition = 0;
        for(int i=0; i<carList.size(); i++){
            Car car = carList.get(i);
            if(car.getPosition() >= maxPosition){
                maxPosition = car.getPosition();
            }
        }

        // maxPosition의 자동차 리스트에 넣기
        List<Car> winners = new ArrayList<>();
        for(int i=0; i<carList.size(); i++){
            Car car = carList.get(i);
            if(car.getPosition() == maxPosition){
                winners.add(car);
            }
        }
        return winners;
    }
}
