package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = false

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println("Comprou Sorvete ${comprouSorvete}")
    println("Comprou TV 50 ${comprouTv50}")
    println("Comprou TV 32 ${comprouTv32}")

    // Operador unário (Negação)
    if(!comprouSorvete){
        println("A saúde agradece.")
    }
}