package racingcar;

public class Validate {
// 검증만 하기

    // 자동차 이름이 5자 이하인지 확인
    public static void validateCarName(String[] carName){
        for(int i=0; i<carName.length; i++){
            if(carName[i].trim().length() > 5){
                throw new IllegalArgumentException("[ERROR] 자동자 이름은 5자 이내여야합니다.");
            }
            if(carName[i].isEmpty()){
                throw new IllegalArgumentException("[ERROR] 공백이 입력되었습니다. 다시 입력해주세요.");
            }
        }
    }
}
