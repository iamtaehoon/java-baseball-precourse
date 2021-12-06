package baseball;

public class Player {
	public BaseballNum inputNumber() {
		return new BaseballNum(InputView.inputNumbers());
	}
}
