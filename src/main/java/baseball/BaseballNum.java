package baseball;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class BaseballNum {
	private HashSet<Integer> baseballNum = new HashSet<>();

	public BaseballNum(String inputNumbers) {
		validateDigitIsNumber(inputNumbers);
		validateDuplicateDigit(inputNumbers);
	}

	private void validateDuplicateDigit(String inputNumbers) {
		String[] digits = inputNumbers.split("");
		Arrays.stream(digits).forEach(eachDigit -> baseballNum.add(Integer.parseInt(eachDigit)));
		if (baseballNum.size() != 3) {
			throw new IllegalArgumentException("중복되지 않은 세 자리 숫자를 입력하세요.");
		}
	}

	private void validateDigitIsNumber(String inputNumbers) {
		if (!inputNumbers.matches("[1-9]{3}")) {
			throw new IllegalArgumentException("세 자리 숫자를 입력하세요.");
		}
	}
}
