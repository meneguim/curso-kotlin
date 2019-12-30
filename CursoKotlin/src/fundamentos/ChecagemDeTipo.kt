package fundamentos

fun main(args: Array<String>) {
    val valor = "abc"

    if (valor is String){
        println(valor)
    } else if (valor !is String){ // Explicando negação do is para checagem do tipo
        println("Não é uma String")
    }
}