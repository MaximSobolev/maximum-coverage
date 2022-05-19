import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionShouldMastercardOrMaestroWithoutCommission () {
        val amount = 1000_00
        val cardType = "Maestro"
        val monthTransfer = 10000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(0, resultCommission)
    }
    @Test
    fun calculateCommissionShouldMastercardOrMaestroWithCommission () {
        val amount = 1000_00
        val cardType = "Maestro"
        val monthTransfer = 100000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(2600, resultCommission)
    }

    @Test
    fun calculateCommissionShouldVisaOrMir () {
        val amount = 1000_00
        val cardType = "Visa"
        val monthTransfer = 100000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(4250, resultCommission)
    }

    @Test
    fun calculateCommissionShouldVKPay () {
        val amount = 1000_00
        val cardType = "VKPay"
        val monthTransfer = 100000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(0, resultCommission)
    }

    @Test
    fun calculateCommissionShouldNoName () {
        val amount = 1000_00
        val cardType = "MaximCard"
        val monthTransfer = 100000_00

        val resultCommission = calculateCommission(amount, cardType, monthTransfer)

        assertEquals(null, resultCommission)
    }

    @Test
    fun calculateCommissionShouldDefaultCardTypeAndMonthTransfer () {
        val amount = 1000_00

        val resultCommission = calculateCommission(amount)

        assertEquals(2600, resultCommission)
    }

    @Test
    fun calculateCommissionShouldDefaultMonthTransfer () {
        val amount = 1000_00
        val cardType = "Maestro"

        val resultCommission = calculateCommission(amount, cardType)

        assertEquals(100, resultCommission)
    }
}