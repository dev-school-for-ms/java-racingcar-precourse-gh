package racingcar;
import java.util.*;

public class OutputView {
    public static void result() {
        System.out.println("실행결과");
    }

    // 게임 실행 현황 출력
    public static void printStatus(Car car){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<car.getPosition(); i++){
            sb.append("-");
        }
        System.out.println(car.getName()+ " : "+ sb);
    }

    public static void printWinners(List<Car> car){
        StringBuilder sb = new StringBuilder();
        sb.append(car.get(0).getName());

        // 1명 이상일 경우
        if(car.size() > 1){
            for(int i=1; i<car.size(); i++){
                sb.append(", ").append(car.get(i).getName());
            }
        }
        System.out.println("최종 우승자 : "+sb.toString());
    }
}
