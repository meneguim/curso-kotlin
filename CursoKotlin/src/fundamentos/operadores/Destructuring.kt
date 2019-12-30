package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (marca,modelo) = Carro("Ford", "Fusion")
    println("Marca: $marca Modelo: $modelo")

    val(marido, mulher) = listOf("João","Maria")
    println("Marido: $marido Mulher: $mulher")

    val(_,_, terceiroLugar) = listOf("Kimi","Hamilton","Alonso")
    println("Terceiro Lugar: $terceiroLugar")
}