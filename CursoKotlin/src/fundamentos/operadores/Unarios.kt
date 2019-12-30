package fundamentos.operadores

fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 2

    num1++
    println(num1)
    --num1
    println(num1)

    // Incremento e decremento
    println(++num1 == num2--)
    println(num1 == num2)

    /*  Operador antes da variável é pré-fixado. Ele tem preferencia sobre a comparação == então vai incrementar
        antes de comparar.
        Exemplo ++num1 == num2-- o operador ++ pré-fixado vai incrementar antes de olhar para o sinal de igual ==
        Já no operador pós-fixado ele só é incrementado ou decrementado depois da comparação.
        No mesmo exemplo ++num1 == num2-- quando executado o num1 recebem o incremento antes de comparar, já o
        num2 é comparado antes de receber o decremento. Então num1 = 2 antes de comprar == e num2 = 2 antes de
        comparar depois vira num2 = 1
     */
}