package estruturascondicionais

//cadeia de comandos para verificar se tem idade para tirar carteira de motorista.

fun main() {
    val age = readln().toInt()

    val message = if (age >= 18) {
       "você pode tirar a carteira de motorisca"
    } else if (age >= 16){
       "Você não tem idade para tirar carteira de motorista, mas já pode votar"
    }
    else {
       "Você não tem idade para tirar carteira de motorista"
    }
    println(message)
    println("Fim")
}