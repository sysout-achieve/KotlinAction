package Scope

fun main() {

}

fun exampleLet() {
    val person = Person("name", 30)
    person.let {
        it.name = "james"
        it.age = 29
    }
    person.run {
        println(name)
        println(name)
    }
}

fun exampleLet2(){
    val person: String = Person("name", 30).let {
        it.name = "james"
        it.age = 29
        "${it.name} age : ${it.age}"
    }
    println(person)
}