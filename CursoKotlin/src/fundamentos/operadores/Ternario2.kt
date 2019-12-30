package fundamentos.operadores

fun obterResultado(nota : Double) : String = if(nota >= 7.0) "Passo" else "Reprovado"

fun obterResultado2(nota : Double) : String {
    return if(nota >= 7.0) "Passo" else "Reprovado"
}

fun main(args: Array<String>) {
    println (obterResultado(6.2))
    println (obterResultado2(8.2))
}
