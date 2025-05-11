fun main() {
    val numbers = listOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)
    val sortedNumbers = numbers.sorted() // Возвращает новый список

    println("Отсортированный массив: ${sortedNumbers.joinToString(", ")}")
}