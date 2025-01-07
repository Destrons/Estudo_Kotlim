package Operadores

fun main() {
    val a = 5 // Adicionando a fração (5.0) o valor e mudado de inteiro para double.
    val b = 2

    //Soma
    println(a + b)

    //Subtração
    println(a - b)

    //Multiplicação
    println(a * b)

    //Divisão
    println(a / b.toDouble()) // Também e possivel converter o valor direto na conta assim mantendo a fração do resultado

    //Modulo
    println(a % b)

    //Concatenação
    val c = "Thomas " + "Neves"
    println(c)
}