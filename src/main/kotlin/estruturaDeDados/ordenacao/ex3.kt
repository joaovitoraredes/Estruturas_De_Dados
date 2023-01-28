package estruturaDeDados.ordenacao

fun main() {
    val list = intArrayOf(1, 5, 9, 7, 2, 4)
    list.sort()
    quickSort(list)
    printArray(list)
}

fun quickSort(list: IntArray, start: Int = 0, end: Int = list.lastIndex) {
    if (start < end) {
        val pivotIndex = partition(list, start, end)

        quickSort(list, start, pivotIndex - 1)
        quickSort(list, pivotIndex + 1, end)
    }
}

fun partition(list: IntArray, start: Int, end: Int): Int {
    val pivot = list[end]

    var smallestEndIndex = start - 1
    for (i in start until end) {
        if (list[i] < pivot) {
            smallestEndIndex++
            if (smallestEndIndex != i) {
                val tmp = list[smallestEndIndex]
                list[smallestEndIndex] = list[i]
                list[i] = tmp
            }
        }
    }
    val tmp = list[smallestEndIndex + 1]
    list[smallestEndIndex + 1] = list[end]
    list[end] = tmp

    return smallestEndIndex + 1
}