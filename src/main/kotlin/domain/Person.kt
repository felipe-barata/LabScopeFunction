package domain

data class Person(
    val name: String,
    val age: Int,
    val sex: String,
    val taxId: String
) {
    var address: Address? = null
}