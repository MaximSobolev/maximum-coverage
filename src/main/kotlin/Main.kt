fun main() {
    val amount = 1000_00
    val cardType = "Maestro"
    val monthTransfer = 100000_00

    val resultCommission = calculateCommission(amount)
    println(resultCommission)
}

fun calculateCommission (amount : Int, cardType : String = "VKPay", monthTransfer : Int = 0) = when (cardType) {
    "Mastercard", "Maestro" -> if (monthTransfer < 75000_00) 0 else (0.006 * amount).toInt() + 20_00
    "Visa", "Мир" -> (0.0075 * amount).toInt() + 35_00
    "VKPay" -> 0
    else -> null
}