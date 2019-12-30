package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println(funcaoSimples("ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("Soma = ${soma(2,3)} e Subtração = ${subtracao(4,2)}")

}