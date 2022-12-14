package services.functions

import domain.Person
import repository.PersonRepository

object Also {

    fun tryAlso(): Boolean {
        val person = Person(
            "Marcia", 60, "F", "55555555555"
        )
        return PersonRepository().insertNewPerson(person).also {
            println("Inserted new person: $it")
        }
    }

    fun tryWithoutAlso(): Boolean {
        val person = Person(
            "Marcia", 60, "F", "55555555555"
        )
        val insertedNewPerson = PersonRepository().insertNewPerson(person)
        println("Inserted new person: $insertedNewPerson")
        return insertedNewPerson
    }

}