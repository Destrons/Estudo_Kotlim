package variaveis

fun main() {
    val i1 = 10
    val l1 = i1.toLong() // conversão de valor inteiro para long

    println(i1)
    println(l1)

    val d1 = i1.toDouble() // conversão de valor inteiro para double

    println(d1)

    val d2 = 25.71
    val i2 = d2.toInt()  // cuidados ao converter valores com casas decimais para inteiro, o valor decimal será perdido.

    println(d2)
    println(i2)

    val i3 = 10000
    val b1 = i3.toByte() // ao converter o valor para um tipo menor ele so guardara até o limite no caso o byte e até 16.

    println(i3)
    println(b1)

    val s1 = i1.toString() //conversão de valor númerico para tipo string.
    val s2 = "101"
    val i4 = s2.toInt() //conversão de valor do tipo string para inteiro númerico, ira ocorrer erro se não for apenas de números.

    println(s1)
    println(i4)

}