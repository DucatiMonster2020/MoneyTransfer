fun main() {
    val amount: Int = 10_000
    val min: Int = 35
    val comission: Double = 0.0075
    var totalComission = (amount * comission).toInt()
    var result = if (totalComission >= min) totalComission else min
        println("Комиссия составит: $result рублей")
}