package services.functions

import domain.Person

object TakeIfAndTakeUnless {

    private val person = Person(
        "Joao", 25, "M", "11111111111"
    )

    fun tryTakeIfAndTakeUnless() {
        val personThatCanDrive = person.takeIf { pessoa -> pessoa.age > 18 }
        val personThatCannotDrive = person.takeUnless { pessoa -> pessoa.age > 18 }
        println("Retorno takeIf: $personThatCanDrive")
        println("Retorno takeUnless: $personThatCannotDrive")
    }

}