fun main() {
    val (a, b) = listOf(5, 8).sorted()  // Сортируем числа, чтобы получить диапазон
    val numbers = (a..b).toList()        // Создаем диапазон и преобразуем в список

    println("Массив: ${numbers.joinToString(", ")}")
}
