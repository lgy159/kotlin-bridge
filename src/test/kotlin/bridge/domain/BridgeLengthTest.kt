package bridge.domain

import bridge.view.BridgeLengthException
import bridge.view.InputView
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException


class BridgeLengthTest {
    @Test
    fun `다리 길이에 null이 들어갈 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            BridgeLengthException.exceptions("")
        }
    }

    @Test
    fun `다리 길이에 숫자가 아닌 문자가 들어갈 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            BridgeLengthException.exceptions("abc")
        }
    }

    @Test
    fun `다리 길이에 3이상 20이하가 아니 숫자가 들어갈 경우 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> {
            BridgeLengthException.exceptions("26")
        }
    }


}