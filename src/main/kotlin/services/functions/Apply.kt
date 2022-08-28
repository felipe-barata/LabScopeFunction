package services.functions

import domain.Endereco
import domain.Pessoa

object Apply {

    fun testaApply() {
        val jose = Pessoa(
            "Jose", 50, "M", "44444444444"
        ).apply {
            endereco = Endereco(
                "Rua Luciano penatti",
                "Sao Paulo",
                "SP",
                "S/N",
                "N/A"
            )
        }
        println(jose.endereco)
    }

    fun escreveFuncaoSemApply() {
        val jose = Pessoa(
            "Jose", 50, "M", "44444444444"
        )
        val endereco = Endereco(
            "Rua Luciano penatti",
            "Sao Paulo",
            "SP",
            "S/N",
            "N/A"
        )
        jose.endereco = endereco
        println(jose.endereco)
    }

}