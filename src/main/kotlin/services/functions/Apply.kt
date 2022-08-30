package services.functions

import domain.Address
import domain.Person

object Apply {

    private val address = Address(
        "Rua penatti",
        "Sao Paulo",
        "SP",
        "S/N",
        "N/A"
    )

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

            println(this.address)
            println(this@Apply.address)

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