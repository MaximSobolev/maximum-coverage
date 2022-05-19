import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommission() {
        val amount = 1000_00
        val cardType = "Maestro"
        val monthTransfer = 100000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(0, resultCommission)
    }
}