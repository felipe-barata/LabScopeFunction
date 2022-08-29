package services

import java.math.BigDecimal

object IntroducaoScopeFunction {

    fun tryUsingScopeFunctions() {
        val salario = BigDecimal(1000) // Create test variable
        salario.let {// Creates new temporary scope
            println(it)
        }
    }

}