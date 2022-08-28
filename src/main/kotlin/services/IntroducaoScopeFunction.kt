package services

import java.math.BigDecimal

object IntroducaoScopeFunction {

    fun testaCriacaoDeEscopoTemporario() {
        val salario = BigDecimal(1000) // Cria variável de teste
        salario.let {// Cria um novo escopo temporário
            println(it)
        }
    }

}