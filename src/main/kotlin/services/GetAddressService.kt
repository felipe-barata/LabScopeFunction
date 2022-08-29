package services

import domain.dto.ZipCodeDTO

class GetAddressService {

    var url: String? = null
    var port: Int? = null

    fun getAddressByZipCode(cep: String): ZipCodeDTO {
        println("Looking for address.....")
        return ZipCodeDTO(
            "Avenida Cruzeiro",
            "São Paulo",
            "SP"
        )
    }

}