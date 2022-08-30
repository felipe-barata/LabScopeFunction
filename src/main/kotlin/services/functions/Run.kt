package services.functions

import services.GetAddressService

object Run {

    fun tryRunAsExtensionFunction() {
        val getAddressService = GetAddressService()
        val zipCodeDTO = getAddressService.run {
            port = 8080
            url = "http://10.0.0.1"
            getAddressByZipCode(ZIP_CODE)
        }
        println("Found ZipCode: $zipCodeDTO")
    }

    fun tryWithoutRun() {
        val getAddressService = GetAddressService()
        getAddressService.port = 8080
        getAddressService.url = "http://10.0.0.1"
        val zipCodeDTO = getAddressService.getAddressByZipCode(ZIP_CODE)
        println("Found ZipCode: $zipCodeDTO")
    }

    fun rewriteRunAsLet() {
        val getAddressService = GetAddressService()
        val zipCodeDTO = getAddressService.let {
            it.port = 8080
            it.url = "http://10.0.0.1"
            it.getAddressByZipCode(ZIP_CODE)
        }
        println("Found ZipCode: $zipCodeDTO")
    }

    fun tryRunAsANonExtensionFunction() {
        val validateEmail = run {
            val beforeSign = "^(.+)"
            val afterSign = "(.+)\$"
            Regex("$beforeSign@$afterSign")
        }
        for (match in validateEmail.findAll("teste@gmail.com")) {
            println(match.value)
        }
    }

    fun rewriteWithoutRunAsNonExtensionFunction() {
        val beforeSign = "^(.+)"
        val afterSign = "(.+)\$"
        val validateEmail = Regex("$beforeSign@$afterSign")
        for (match in validateEmail.findAll("teste@gmail.com")) {
            println(match.value)
        }
    }

    private const val ZIP_CODE = "14000-000"
}