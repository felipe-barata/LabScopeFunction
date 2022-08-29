package domain.dto

data class ZipCodeDTO(
    val streetName: String,
    val cityName: String,
    val state: String
) {
    override fun toString(): String {
        return """
            $streetName, $cityName - $state
            """
    }
}