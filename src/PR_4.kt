fun main() {
    val numbers = listOf(5, 2, 8, 1, 9, 4)

    val secondSmallest = numbers
        .sorted()
        .getOrNull(1)
        ?.also { println("Второй самый маленький элемент: $it") }
        ?: println("В массиве меньше двух элементов")
}