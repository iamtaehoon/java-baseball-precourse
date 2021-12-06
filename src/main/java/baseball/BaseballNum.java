package baseball;

public class BaseballNum {
	public BaseballNum(String inputNumbers) {
		//세자리인가?
		//1~9로만 이루어졌는가?
		if (!inputNumbers.matches("[1-9]{3}")) {
			throw new IllegalArgumentException("세 자리 숫자를 입력하세요.");
		}
		//겹치는 숫자가 없는가?
		String[] split = inputNumbers.split("");
		//이거로 세 자리 ArrayList?를 만들거. Set?
	}
}
