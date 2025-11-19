package racingcar.model;

import org.mockito.internal.matchers.Null;

public class Name {
    private final String nameValue;
    private static final int MAX_LENGTH = 5;

    public Name(String nameValue) {
        if(nameValue == null || nameValue.trim().isEmpty()) {
            throw new IllegalArgumentException("이름을 비워둘 수 없습니다.");
        }
        if(nameValue.length() > MAX_LENGTH){
            throw new IllegalArgumentException("이름을 " + MAX_LENGTH + "자 이상으로 설정할 수 없습니다.");
        }
        this.nameValue = nameValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    @Override
    public String toString() {
        return nameValue;
    }
}