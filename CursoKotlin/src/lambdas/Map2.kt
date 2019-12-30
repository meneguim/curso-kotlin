package lambdas

class Produto (val nome: String, val preco: Double)

val materiaEscolar = listOf(
        Produto("Fichário escolar", 21.90),
        Produto("Lápis de cor", 11.90),
        Produto("Borrachar bicolor", 0.70),
        Produto("Apontador com depósito", 1.80)
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }
    val precoTotal = materiaEscolar.map { it.preco }.reduce(totalizar)

    println("O preço médio é R$ ${precoTotal / materiaEscolar.size}")
}