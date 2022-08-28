package domain

data class Pessoa(
    val nome: String,
    val idade: Int,
    val sexo: String,
    val cpf: String
) {
    var endereco: Endereco? = null
}