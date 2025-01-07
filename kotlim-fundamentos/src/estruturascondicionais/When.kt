package estruturascondicionais

fun main() {
    val mes = 1
    val month = 2

   /* when (mes) {
        1 -> {
            println("Janeiro")
            println("Primeiro mês")
        } // usando bloco para escrever mais de um comando ou linha.
        2 -> println("Fevereiro")
        3 -> println("Março")
        else -> println("mês invalido")

    }*/

    // Outra forma de usar When
    val name = when (month){
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        else -> "mês invalido"
    }

    /*val name = when {
        month == 1 -> "Janeiro"
        month == 2 -> "Fevereiro"
        month == 3 -> "Março"
        else -> "mês invalido"
    }

    println(name)
}