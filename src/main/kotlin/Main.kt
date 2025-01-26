fun main() {
    println("----- Операции с числами -----")

    // 1. Двузначное число
    val twoDigitNumber = 30
    val tens = twoDigitNumber / 10
    val units = twoDigitNumber % 10
    val sumOfDigits = tens + units
    val productOfDigits = tens * units
    println("Двузначное число: $twoDigitNumber")
    println("Десятки: $tens")
    println("Единицы: $units")
    println("Сумма цифр: $sumOfDigits")
    println("Произведение цифр: $productOfDigits")

    // 2. Трехзначное число
    val threeDigitNumber = 992
    val hundreds = threeDigitNumber / 100
    val tens2 = (threeDigitNumber % 100) / 10
    val units2 = threeDigitNumber % 10
    val sumOfDigits2 = hundreds + tens2 + units2
    val productOfDigits2 = hundreds * tens2 * units2
    println("\nТрехзначное число: $threeDigitNumber")
    println("Сотни: $hundreds")
    println("Десятки: $tens2")
    println("Единицы: $units2")
    println("Сумма цифр: $sumOfDigits2")
    println("Произведение цифр: $productOfDigits2")

    // 3. Деление одного числа на другое
    val dividend = 500
    val divisor = 5
    val quotient = dividend / divisor.toDouble()
    println("\nДеление $dividend на $divisor: $quotient")

    // 4. Возведение в степень
    val baseNum = 5
    val exponent = 9
    val power = Math.pow(baseNum.toDouble(), exponent.toDouble()).toInt()
    println("\n$baseNum в степени $exponent: $power")

    // 5. Квадратный корень
    val number = 30
    val squareRoot = Math.sqrt(number.toDouble())
    println("\nКвадратный корень из $number: $squareRoot")


    println("\n----- Вычисление логических выражений -----")

    val a = true
    val b = false
    val c = false
    val x = false
    val y = true
    val z = false

    println("\n1. a) ${a || b}") // true
    println("   b) ${a && b}") // false
    println("   c) ${b || c}") // false

    println("\n2. a) ${x || z}") // false
    println("   b) ${x && y}") // false
    println("   c) ${x && z}") // false

    println("\n3. a) ${!a && b}") // false
    println("   b) ${a || !b}") // true
    println("   c) ${a && b || c}") // false

    println("\n4. a) ${!x && y}") // false
    println("   b) ${x || !y}") // false
    println("   c) ${x || y && z}") // true

    println("\n5. a) ${!x && y}") // false
    println("   b) ${x || !y}") // false
    println("   c) ${x || y && z}") // true

    println("\n6. a) ${x || y && !z}") // false
    println("   b) ${!x && !y}") // true
    println("   c) ${!(x && z) || y}") // true
    println("   d) ${x && !y || z}") // false
    println("   e) ${x && (!y || z)}") // false
    println("   f) ${x || !(y || z)}") // true

    println("\n7. a) ${a || !(a && b) || c}") // true
    println("   b) ${!a || a && (b || c)}") // true
    println("   c) ${(a || b && !c) && c}") // false
}