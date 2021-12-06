package baseball;

import java.util.HashSet;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

	public static HashSet<Integer> makeRandomThreeDigit() {
		HashSet<Integer> baseballNum = new HashSet<>();
		while (baseballNum.size() != 3) {
			baseballNum.add(Randoms.pickNumberInRange(1, 9));
		}
		return baseballNum;
	}
}
