package Scope

class Person {
    var name = ""
    var age = 0

    constructor()

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }


}