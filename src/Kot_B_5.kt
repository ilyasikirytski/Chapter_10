import kotlin.math.abs

/*
На базе коллекций реализовать структуру хранения чисел с поддержкой
следующих операций:
• добавление/удаление числа;
• поиск числа, наиболее близкого к заданному (т. е. модуль разницы минимален).
 */

private val myList = ArrayList<Int>()

fun main() {
    for (i in 0 until 10) {
        myList.add((Math.random() * 100).toInt())
    }
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
    println(myList)
    return min
}
