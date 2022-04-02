import kotlin.math.roundToInt

fun main() {

    val itemPrice = 100_00.00
    val itemCount = 110
    val discount = 100_00.00
    val discountStart = 1000_00
    val discountStart2 = 10000_00
    val musicLover = true

    val totalPrice: Double = itemPrice * itemCount

    val result = if (totalPrice > discountStart2) {
        totalPrice * 0.95
    } else if (totalPrice > discountStart) {
        totalPrice - discount
    } else totalPrice


    val checkout: Double = if (musicLover == true) result * 0.99
    else result
    println("Total price: ${totalPrice / 100} рублей")
    println("Your personal discount: ${(totalPrice - checkout) / 100} рублей")
    println("Price for you: ${(checkout).roundToInt() / 100.00} рублей")

}