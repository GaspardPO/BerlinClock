import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class HoursDisplayTest {

    @Test
    fun `should display OOOO OOOO when 00`() {
        val myHoursDisplay  = HoursDipslay(0)
        assertThat(myHoursDisplay.state()).isEqualTo("OOOO\nOOOO");
    }

    @Test
    fun `should display OOOO ROOO when 01`() {
        val myHoursDisplay  = HoursDipslay(1)
        assertThat(myHoursDisplay.state()).isEqualTo("OOOO\nROOO");
    }

    @Test
    fun `should display OOOO RROO when 02`() {
        val myHoursDisplay  = HoursDipslay(2)
        assertThat(myHoursDisplay.state()).isEqualTo("OOOO\nRROO");
    }

    @Test
    fun `should display OOOO RRRO when 03`() {
        val myHoursDisplay  = HoursDipslay(3)
        assertThat(myHoursDisplay.state()).isEqualTo("OOOO\nRRRO");
    }

    @Test
    fun `should display OOOO RRRR when 04`() {
        val myHoursDisplay  = HoursDipslay(4)
        assertThat(myHoursDisplay.state()).isEqualTo("OOOO\nRRRR");
    }

    @Test
    fun `should display ROOO OOOO when 05`() {
        val myHoursDisplay  = HoursDipslay(5)
        assertThat(myHoursDisplay.state()).isEqualTo("ROOO\nOOOO");
    }

    @Test
    fun `should display ROOO ROOO when 06`() {
        val myHoursDisplay  = HoursDipslay(6)
        assertThat(myHoursDisplay.state()).isEqualTo("ROOO\nROOO");
    }

    @Test
    fun `should display RROO OOOO when 10`() {
        val myHoursDisplay  = HoursDipslay(10)
        assertThat(myHoursDisplay.state()).isEqualTo("RROO\nOOOO");
    }

    @Test
    fun `should display RRRO OOOO when 15`() {
        val myHoursDisplay  = HoursDipslay(15)
        assertThat(myHoursDisplay.state()).isEqualTo("RRRO\nOOOO");
    }

    @Test
    fun `should display RRRR OOOO when 20`() {
        val myHoursDisplay  = HoursDipslay(20)
        assertThat(myHoursDisplay.state()).isEqualTo("RRRR\nOOOO");
    }

    @Test
    fun `should display RROO RROO when 12`() {
        val myHoursDisplay  = HoursDipslay(12)
        assertThat(myHoursDisplay.state()).isEqualTo("RROO\nRROO");
    }
}
