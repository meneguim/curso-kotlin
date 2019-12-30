package funcoes

class Produto (val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")
    println(p1 maisCaroQue p2) // Uma forma mais clara de usar funções infix
    println(p1.maisCaroQue(p2))
}