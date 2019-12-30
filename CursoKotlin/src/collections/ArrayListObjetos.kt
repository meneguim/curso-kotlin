package collections

data class Fruta (var nome: String, var preco: Double)

fun main(args: Array<String>) {
    var frutas = arrayListOf(Fruta("Banana",1.50),Fruta("Morango",3.20))
    frutas.iterator().forEach { println("${it.nome} - R$ ${it.preco}")}

    println(frutas.contains(Fruta("Banana",1.50)))
    println(frutas.distinctBy { it.preco })

    frutas.add(Fruta("Laranja",2.30))
    frutas.iterator().forEach { println("${it.nome} - R$ ${it.preco}")}
}