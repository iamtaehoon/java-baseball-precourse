package baseball;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputerTest {

	@Test
	void 세자리_모두다른_값_입력되면_정상로직() {
		Computer computer = new Computer();
		computer.makeAnswer(new HashSet<Integer>() {
			{
				add(1);
				add(2);
				add(3);
			}
		});
	}


	@Test
	void 세자리_중복값_있으면_오류() {
		Computer computer = new Computer();
		Assertions.assertThatThrownBy(() -> computer.makeAnswer(new HashSet<Integer>() {
			{
				add(1);
				add(2);
				add(1);
			}
		})).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("중복되지 않은 세 자리 숫자를 입력하세요.");
	}

}