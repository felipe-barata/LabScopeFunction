package services

import java.math.BigDecimal

object ntroToScopeFunction {

    fun tryUsingScopeFunctions() {
        val salary = BigDecimal(1000) // Create test variable
        salary.let {// Creates new temporary scope
            println(it)
        }
    }
}