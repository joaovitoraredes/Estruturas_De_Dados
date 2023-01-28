package estruturaDeDados.filas

import java.util.*

data class Person(val name: String, val age: Int)

data class Node(val person: Person, val timestamp: Long)

class Bank {
    private val queue: PriorityQueue<Node> = PriorityQueue<Node> { o1, o2 ->
        if (o1.person.age > 60 && o2.person.age > 60) {
            if (o1.timestamp > o2.timestamp) -1
            else 1
        } else if (o1.person.age > 60) {
            -1
        } else {
            if (o1.timestamp > o2.timestamp) -1
            else 1
        }
    }

    fun add(person: Person) {
        queue.offer(Node(person, System.currentTimeMillis()))
    }

    fun execute() {
        var current = queue.poll()
        while(current != null) {
            println(current)
            current = queue.poll()
        }
    }
}

fun main() {
    val bank = Bank()
    bank.add(Person(name = "Clarice", 15))
    bank.add(Person(name = "Paulo", 68))
    bank.add(Person(name = "Joao", 45))
    bank.add(Person(name = "Rafael", 70))
    bank.add(Person(name = "Jonas", 52))
    bank.add(Person(name = "Larissa", 48))
    bank.add(Person(name = "Rafaela", 89))
    bank.add(Person(name = "Pedro", 90))

    bank.execute()
}
