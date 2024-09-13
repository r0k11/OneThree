fun main()
{
    println("Введите натуральное число:")
    val input = readLine()
    if (input != null && input.toIntOrNull() != null && input.toInt() > 0)
    {
        val decimalNumber = input.toInt()
        val binaryNumber = decimalToBinary(decimalNumber)
        println("Двоичное представление числа $decimalNumber: $binaryNumber")
    } else
    {
        println("Пожалуйста, введите корректное натуральное число.")
    }
}
fun decimalToBinary(decimal: Int): String
{
    var number = decimal
    val binaryString = StringBuilder()
    while (number > 0) {
        binaryString.insert(0, number % 2)
        number /= 2
    }
    return binaryString.toString()
}
