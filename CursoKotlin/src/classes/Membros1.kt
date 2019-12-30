package classes

class Data(var dia: Int, var mes: Int, var ano: Int) {
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia = 25,mes = 1,ano = 1979)
    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    with(nascimento) { println("${dia}/${mes}/$ano")}
    println(nascimento.formatar())

    nascimento.mes = 10

    println(nascimento.formatar())
}