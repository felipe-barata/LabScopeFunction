package services.functions

import repository.PessoaRepository

object With {

    private val pessoaRepository = PessoaRepository()

    fun usandoWithParaRealizarCalculos() {
        val pessoas = pessoaRepository.retornaTodasPessoas()
        with(pessoas) {
            val mediaDeIdade = map { pessoa -> pessoa.idade }.sum().div(size)
            println("Media de idade: $mediaDeIdade")
        }
    }

    fun reescreveSemWith() {
        val pessoas = pessoaRepository.retornaTodasPessoas()
        val mediaDeIdade = pessoas.map { pessoa -> pessoa.idade }.sum().div(pessoas.size)
        println("Media de idade: $mediaDeIdade")
    }

}