package services.functions

import repository.PersonRepository

object Let {

    private val personRepository = PersonRepository()

    fun tryLetOnOperationsWithNullObjects() {
        personRepository.findPersonByTaxId(TAX_ID)?.let {
            println("Found person ${it.name}!")
        }
    }

    fun tryNullObjectsWithoutLet() {
        val person = personRepository.findPersonByTaxId(TAX_ID)
        if (person != null) {
            println("Found person ${person.name}!")
        }
    }

    fun tryLetChainingCalls() {
        personRepository.getAllPersons().filter { person -> person.sex == "M" }.count().let {
            println(it)
        }
    }

    fun tryLetChainingCallsAndRenamingArgument() {
        personRepository.getAllPersons().filter { person -> person.sex == "M" }.count().let { quantity ->
            println(quantity)
            //do whatever more calls needed
        }
    }

    fun tryLetChainingCallsAndWithLoneFunction() {
        personRepository.getAllPersons().filter { person -> person.sex == "M" }.count().let(::println)
    }

    private const val TAX_ID = "11111111111"
}