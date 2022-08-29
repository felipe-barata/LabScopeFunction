package services.functions

import repository.PersonRepository

object With {

    private val personRepository = PersonRepository()

    fun tryWithToDoSomeCalculations() {
        val people = personRepository.getAllPersons()
        with(people) {
            val averageAge = map { person -> person.age }.sum().div(size)
            println("Average age: $averageAge")
        }
    }

    fun tryWithoutWith() {
        val people = personRepository.getAllPersons()
        val averageAge = people.map { person -> person.age }.sum().div(people.size)
        println("Average age: $averageAge")
    }

}