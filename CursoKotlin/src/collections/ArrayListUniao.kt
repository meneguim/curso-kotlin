package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1,2,3,4,5)
    val strings = arrayListOf("Rafael","Pedro","Leandro","Gustavo")
    val uniao = numeros + strings // Sobrecarga de operadores
    uniao.iterator().forEach { println(it) }
}