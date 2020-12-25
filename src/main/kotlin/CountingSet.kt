import Scope.Person

class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet()) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    private set
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded+=elements.size
        return innerSet.addAll(elements)
    }
}

fun main() {
    val countingSet = CountingSet<Int>()
    countingSet.add(10)
    countingSet.addAll(1..10)

    println(countingSet.objectsAdded)
    println(countingSet.size)
}