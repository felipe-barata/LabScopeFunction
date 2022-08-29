package services.functions

import repository.PersonRepository

object Let {

    private val personRepository = PersonRepository()

    fun tryLetOnOperationsWithNullObjects() {
        personRepository.findPersonByTaxId(CPF)?.let {
            println("Found person ${it.name}!")
        }
    }

    fun tryNullObjectsWithoutLet() {
        val pessoa = personRepository.findPersonByTaxId(CPF)
        if (pessoa != null) {
            println("Found person ${pessoa.name}!")
        }
    }

    fun tryLetChainingCalls() {
        personRepository.getAllPersons().filter { person -> person.sex == "M" }.count().let {
            println(it)
        }
    }

    fun tryLetChainingCallsAndRenamingArgument() {
        personRepository.getAllPersons().filter { pessoa -> pessoa.sex == "M" }.count().let { quantidade ->
            println(quantidade)
        }
    }

    fun tryLetChainingCallsAndWithLoneFunction() {
        personRepository.getAllPersons().filter { pessoa -> pessoa.sex == "M" }.count().let(::println)
    }

    private const val CPF = "11111111111"
}