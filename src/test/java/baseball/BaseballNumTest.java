package baseball;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BaseballNumTest {

	@ParameterizedTest
	@ValueSource(strings = {"123","234","168","471","916","987"})
	@DisplayName("1~9로 이루어지고 각 자리의 숫자가 전부 다른 세 자리 문자열을 입력받으면 객체를 만들어준다.")
	void 세자리_1부터_9로_이루어진_문자열_입력받을때_정상(String threeDigit) {
		assertThat(BaseballNum.inputGuessNum(threeDigit)).isNotNull();
	}

	@ParameterizedTest
	@ValueSource(strings = {"120","204","068","470","016","087","012"})
	@DisplayName("0이 들어간 세자리 문자열을 받으면 객체를 만들지 못한다.")
	void 세자리_정수에_0이_들어가면_오류(String threeDigit) {
		assertThatThrownBy(() -> BaseballNum.inputGuessNum(threeDigit)).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("세 자리 숫자를 입력하세요.");
	}

	@ParameterizedTest
	@ValueSource(strings = {"asd","2s4","a68","47b","01!","-87","*12"})
	@DisplayName("0이 들어간 세자리 문자열을 받으면 객체를 만들지 못한다.")
	void 세자리_정수가_아니고_문자열이면_오류(String threeDigit) {
		assertThatThrownBy(() -> BaseballNum.inputGuessNum(threeDigit)).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("세 자리 숫자를 입력하세요.");
	}

	@ParameterizedTest
	@ValueSource(strings = {"121", "222", "616", "919", "949", "844"})
	@DisplayName("세 자리 숫자가 하나라도 겹치면 객체를 만들지 못한다.")
	void 야구숫자에_겹치는_숫자가_있으면_오류(String threeDigit) {
		assertThatThrownBy(() -> BaseballNum.inputGuessNum(threeDigit)).isInstanceOf(IllegalArgumentException.class)
			.hasMessageContaining("중복되지 않은 세 자리 숫자를 입력하세요.");
	}
}