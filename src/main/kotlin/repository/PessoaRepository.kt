package repository

import domain.Pessoa

class PessoaRepository {

    private var pessoas = mutableListOf(
        Pessoa(
            "Joao", 25, "M", "11111111111"
        ),
        Pessoa(
            "Jorge", 30, "M", "22222222222"
        ),
        Pessoa(
            "Maria", 20, "F", "33333333333"
        ),
        Pessoa(
            "Jose", 50, "M", "44444444444"
        )
    )

    fun procuraPessoaPeloCPF(cpf: String) = pessoas.firstOrNull { pessoa -> pessoa.cpf == cpf }

    fun retornaTodasPessoas() = pessoas

    fun insereNovaPessoa(pessoa: Pessoa) = pessoas.add(pessoa)
}