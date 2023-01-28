package estruturaDeDados.pilhas

import java.util.*

data class Stack2<T>(
    private val stack: LinkedList<T> = LinkedList()
) {

    fun push(value: T) { // O(1)
        stack.add(value)
    }

    fun pop(): T? { // O(1)
        return stack.removeLastOrNull()
    }
}

fun main() {
    val stack = Stack<Int>()
    val stack2 = Stack<Char>()
    val string = "123456"
    string.forEach {
        stack2.push(it)
    }

    var char = stack2.pop()
    while (char != null) {
        println(char)
        if (stack2.isEmpty())
            break

        char = stack2.pop()
    }
}