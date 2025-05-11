fun main() {
    val numbers = emptyList<Int>()               // Начинаем с пустого списка
        .plus(listOf(8, 21, 5, 90, 11, 0))      // Добавляем числа (создается новый список)
        .let { it.take(0) + 90 + it.drop(0) }   // Вставляем 90 в начало (без мутации!)
        .let { it.filterIndexed { index, _ -> index != 4 } }  // Удаляем элемент по индексу 4
        .plus(-35)                              // Добавляем -35 в конец

    println("Массив: ${numbers.joinToString(", ")}")
}