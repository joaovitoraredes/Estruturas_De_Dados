package estruturaDeDados.ordenacao

//Colocando em ordem | sort
fun main() {
    val list = mutableListOf(1, 5, 3, 4, 2)
    // bubblesort
    // * 1 5 3 4 2
    // * 1 2 3 4 5
    for (i in 0 until list.lastIndex) {
        for (j in 0 until list.lastIndex) {
            if (list[j] > list[j + 1]) {
                // swap entre j e j+1
                val tmp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = tmp
            }
            println(list)
        }
    }
}