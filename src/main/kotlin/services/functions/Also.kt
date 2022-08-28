package services.functions

import domain.Pessoa
import repository.PessoaRepository

object Also {

    fun testaAlso() {
        val pessoa = Pessoa(
            "Marcia", 60, "F", "55555555555"
        )
        PessoaRepository().insereNovaPessoa(pessoa).also {
            println("Inseriu nova pessoa: $it")
        }
    }

    fun escreveFuncaoSemAlso() {
        val pessoa = Pessoa(
            "Marcia", 60, "F", "55555555555"
        )
        val inseriuNovaPessoa = PessoaRepository().insereNovaPessoa(pessoa)
        println("Inseriu nova pessoa: $inseriuNovaPessoa")
    }

}