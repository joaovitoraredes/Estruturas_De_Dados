package estruturaDeDados.arvores

import java.util.*

fun main() {
    val treeMap: MutableMap<Int, String> = TreeMap<Int, String>()

    treeMap.put(1, "asdf")
    treeMap.containsKey(1)

    println(treeMap)
}