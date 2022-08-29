package domain

data class Address(
    val streetName: String,
    val cityName: String,
    val state: String,
    val number: String,
    val additionalInfo: String
) {
    override fun toString(): String {
        return """
            $streetName, $number
            Additional Info: $additionalInfo
            $ - $state
        """
    }
}