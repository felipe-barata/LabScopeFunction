package services.functions

import domain.Person

object TakeIfAndTakeUnless {

    private val person = Person(
        "Joao", 25, "M", "11111111111"
    )

    fun tryTakeIfAndTakeUnless() {
        val personThatCanDrive = person.takeIf { person -> person.age > 18 }
        val personThatCannotDrive = person.takeUnless { person -> person.age > 18 }
        println("takeIf: $personThatCanDrive")
        println("takeUnless: $personThatCannotDrive")
    }

}