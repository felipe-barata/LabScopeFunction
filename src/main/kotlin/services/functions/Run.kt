package services.functions

import services.BuscaCEPService

object Run {

    fun testaWithComoFuncaoDeExtensao() {
        val buscaCEPGateway = BuscaCEPService()
        val cepDTO = buscaCEPGateway.run {
            porta = 8080
            url = "http://10.0.0.1"
            buscaEnderecoPorCep(CEP)
        }
        println("Encontrou CEP: $cepDTO")
    }

    fun escreveFuncaoSemWithComoFuncaoDeExtensao() {
        val buscaCEPGateway = BuscaCEPService()
        buscaCEPGateway.porta = 8080
        buscaCEPGateway.url = "http://10.0.0.1"
        val cepDTO = buscaCEPGateway.buscaEnderecoPorCep(CEP)
        println("Encontrou CEP: $cepDTO")
    }

    fun reescreveWithComLet() {
        val buscaCEPGateway = BuscaCEPService()
        val cepDTO = buscaCEPGateway.let {
            it.porta = 8080
            it.url = "http://10.0.0.1"
            it.buscaEnderecoPorCep(CEP)
        }
        println("Encontrou CEP: $cepDTO")
    }

    fun testaWithSemFuncaDeExtensao() {
        val validaEmail = run {
            val antesDoArroba = "^(.+)"
            val depoisDoArroba = "(.+)\$"
            Regex("$antesDoArroba@$depoisDoArroba")
        }
        for (match in validaEmail.findAll("teste@gmail.com")) {
            println(match.value)
        }
    }

    fun reescreveSemWith() {
        val antesDoArroba = "^(.+)"
        val depoisDoArroba = "(.+)\$"
        val validaEmail = Regex("$antesDoArroba@$depoisDoArroba")
        for (match in validaEmail.findAll("teste@gmail.com")) {
            println(match.value)
        }
    }

    private const val CEP = "14000-000"
}