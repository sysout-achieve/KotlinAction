class CollectionFunExample {
    var list = listOf(1, 2, 3)

}

fun main() {
    var list = listOf(1, 2, 3)
    println(list.joinToString(separator = "@ ", prefix = "(", postfix = ")"))
}
