package Scope

import org.junit.Assert.assertEquals
import org.junit.Test


class ScopeExerciseKtTest {

    //given
    var person = Person("defaultName", 29)
    var expectedName = "gunt"
    var expectedAge = 30

    @Test
    fun exampleApply() {
        //when
        println(person.name)

        person.apply {
            name = expectedName
            age = expectedAge
        }

        //then
        person.run {
            println(name)
        }
        assertEquals(person.name , expectedName)
    }

    @Test
    fun exampleLet() {
        //given
        val personName: String = Person("name", 30).let {
            it.name = expectedName
            it.name
        }

        //when

        //then
        assertEquals(personName, expectedName)
    }
}

