import kotlin.math.abs

/*
На базе коллекций реализовать структуру хранения чисел с поддержкой
следующих операций:
• добавление/удаление числа;
• поиск числа, наиболее близкого к заданному (т. е. модуль разницы минимален).
 */

private val myList = ArrayList<Int>()

fun main() {
    myList.add(1)
    myList.add(3)
    myList.add(5)
    myList.add(7)
    myList.add(1)
    myList.add(9)
    myList.add(20)
    myList.add(30)
    println(find(14))
}

fun find(number: Int): Int {
    val iterator: Iterator<Int> = myList.iterator()
    var min = iterator.next()
    while (iterator.hasNext()) {
        val elem = iterator.next()
        if (abs(elem - number) < abs(min - number)) {
            min = elem
        }
    }
    return min
}
