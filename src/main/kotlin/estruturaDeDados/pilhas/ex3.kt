package estruturaDeDados.pilhas

fun recursion() {
    println("recursao")
    recursion()
}

fun main() {
// StackOverflowException
    recursion()
}
