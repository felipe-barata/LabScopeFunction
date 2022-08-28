package domain

data class Endereco(
    val rua: String,
    val cidade: String,
    val estado: String,
    val numero: String,
    val complemento: String
) {
    override fun toString(): String {
        return """
            $rua, $numero
            Complemento: $complemento
            $cidade - $estado
        """
    }
}