import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SecondsDiplayTest {

    @Test
    fun `should display O when 01`() {
        val mySecondsDisplay  = SecondsDipslay("01")
        assertThat(mySecondsDisplay.state()).isEqualTo("O");
    }

    @Test
    fun `should display Y when 02`() {
        val mySecondsDisplay  = SecondsDipslay("02")
        assertThat(mySecondsDisplay.state()).isEqualTo("Y");
    }

    @Test
    fun `should display O when odd`() {
        assertThat(SecondsDipslay("03").state()).isEqualTo("O");
        assertThat(SecondsDipslay("05").state()).isEqualTo("O");
        assertThat(SecondsDipslay("23").state()).isEqualTo("O");
    }

    @Test
    fun `should display Y when even`() {
        assertThat(SecondsDipslay("00").state()).isEqualTo("Y");
        assertThat(SecondsDipslay("24").state()).isEqualTo("Y");
        assertThat(SecondsDipslay("56").state()).isEqualTo("Y");
    }
}
