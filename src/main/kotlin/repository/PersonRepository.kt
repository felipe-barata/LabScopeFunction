package repository

import domain.Person

class PersonRepository {

    private var people = mutableListOf(
        Person(
            "Joao", 25, "M", "11111111111"
        ),
        Person(
            "Jorge", 30, "M", "22222222222"
        ),
        Person(
            "Maria", 20, "F", "33333333333"
        ),
        Person(
            "Jose", 50, "M", "44444444444"
        )
    )

    fun findPersonByTaxId(taxId: String) = people.firstOrNull { person -> person.taxId == taxId }

    fun getAllPersons() = people

    fun insertNewPerson(person: Person) = people.add(person)
}