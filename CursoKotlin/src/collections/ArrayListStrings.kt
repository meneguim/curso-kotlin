package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")
    strings.iterator().forEach { println(it.toUpperCase()) }
}