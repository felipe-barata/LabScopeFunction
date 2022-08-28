package domain.dto

data class CepDTO(
    val rua: String,
    val cidade: String,
    val estado: String
) {
    override fun toString(): String {
        return """
            $rua, $cidade - $estado
            """
    }
}