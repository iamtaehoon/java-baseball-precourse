package baseball;

import java.util.Arrays;
import java.util.HashSet;

import camp.nextstep.edu.missionutils.Randoms;

public class BaseballNum {
	private HashSet<Integer> baseballNum;

	private BaseballNum(HashSet<Integer> baseballNum) {
		this.baseballNum = baseballNum;
	}

	public static BaseballNum makeAnswer(HashSet<Integer> threeDigit) {
		if (threeDigit.size() != 3) {
			throw new IllegalArgumentException("중복되지 않은 세 자리 숫자를 입력하세요.");
		}
		return new BaseballNum(threeDigit);
	}

	public static BaseballNum inputGuessNum(String threeDigit) {
		validateDigitIsNumber(threeDigit);
		HashSet<Integer> baseballNum = validateDuplicateDigit(threeDigit);
		return new BaseballNum(baseballNum);
	}

	private static HashSet<Integer> validateDuplicateDigit(String inputNumbers) {
		HashSet<Integer> baseballNum = new HashSet<>();
		String[] digits = inputNumbers.split("");
		Arrays.stream(digits).forEach(eachDigit -> baseballNum.add(Integer.parseInt(eachDigit)));
		if (baseballNum.size() != 3) {
			throw new IllegalArgumentException("중복되지 않은 세 자리 숫자를 입력하세요.");
		}
		return baseballNum;
	}

	private static void validateDigitIsNumber(String inputNumbers) {
		if (!inputNumbers.matches("[1-9]{3}")) {
			throw new IllegalArgumentException("세 자리 숫자를 입력하세요.");
		}
	}
}
