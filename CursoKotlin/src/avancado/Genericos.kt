package avancado

import collections.print

class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()
    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T){
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main(args: Array<String>) {
    val materialEscolar = Caixa("Caneta")
    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Borracha")
    materialEscolar.print()

    val numeros = Caixa(objeto = 1)
    numeros.adicionar(2)
    numeros.adicionar(3)
    numeros.print()
}