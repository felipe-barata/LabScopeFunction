package services.functions

import domain.Address
import domain.Person

object Apply {

    fun tryApply() {
        val jose = Person(
            "Jose", 50, "M", "44444444444"
        ).apply {
            address = Address(
                "Rua Luciano penatti",
                "Sao Paulo",
                "SP",
                "S/N",
                "N/A"
            )
        }
        println(jose.address)
    }

    fun tryWithoutApply() {
        val jose = Person(
            "Jose", 50, "M", "44444444444"
        )
        val endereco = Address(
            "Rua Luciano penatti",
            "Sao Paulo",
            "SP",
            "S/N",
            "N/A"
        )
        jose.address = endereco
        println(jose.address)
    }

}