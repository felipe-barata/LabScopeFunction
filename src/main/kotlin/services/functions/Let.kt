package services.functions

import repository.PessoaRepository

object Let {

    private val pessoaRepository = PessoaRepository()

    fun testaLetEmOperacoesComObjetosNulos() {
        pessoaRepository.procuraPessoaPeloCPF(CPF)?.let {
            println("Encontrou a pessoa ${it.nome}!")
        }
    }

    fun validaObjetosNullSemLet() {
        val pessoa = pessoaRepository.procuraPessoaPeloCPF(CPF)
        if (pessoa != null) {
            println("Encontrou a pessoa ${pessoa.nome}!")
        }
    }

    fun testaLetEmOperacoesEncadeadas() {
        pessoaRepository.retornaTodasPessoas().filter { pessoa -> pessoa.sexo == "M" }.count().let {
            println(it)
        }
    }

    fun testaLetEmOperacoesEncadeadasRenomeandoArgumento() {
        pessoaRepository.retornaTodasPessoas().filter { pessoa -> pessoa.sexo == "M" }.count().let { quantidade ->
            println(quantidade)
        }
    }

    fun testaLetEmOperacoesEncadeadasEmFuncaoUnica() {
        pessoaRepository.retornaTodasPessoas().filter { pessoa -> pessoa.sexo == "M" }.count().let(::println)
    }

    private const val CPF = "11111111111"
}