package services

import domain.dto.CepDTO

class BuscaCEPService {

    var url: String? = null
    var porta: Int? = null

    fun buscaEnderecoPorCep(cep: String): CepDTO {
        println("Buscando endereço.....")
        return CepDTO(
            "Avenida Cruzeiro",
            "São Paulo",
            "SP"
        )
    }

}