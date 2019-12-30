package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 5.3
    if (nota >= 7.0){
        println("Aprovado!")
    } else {
        println("Reprovado!")
    }

    //Utilizando o if e else dentro da string
    print("Aluno ${if (nota >= 7.0) "Aprovado!" else "Reprovado!"}.")
}