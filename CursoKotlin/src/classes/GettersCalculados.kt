package classes

class Produto(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {
    val inativo: Boolean get() = !ativo
    val precoComDesconto: Double get() = preco * (1 - desconto)
}

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.90,0.2, ativo = true)
    println("O ${p1.nome} tem o valor de ${p1.preco} com o desconto fica ${p1.precoComDesconto}")

    val p2 = Produto("Galaxy Note 7", 2699.49,0.50, ativo = false)
    println("${p2.nome}\n\t De: ${p2.preco}\n\t Para: ${p2.precoComDesconto}")
    if(p2.inativo){
        p2.preco = 0.0
        println("Depois de inativo: ${p2.precoComDesconto}")
    }
}