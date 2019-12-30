package classes

enum class DiaSemana2 (val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1,"Domingo", false),
    SEGUNDA(2,"Segunda-Feira",true),
    TERCA(3,"Terça-Feira",true),
    QUARTA(4,"Quarta-Feira",true),
    QUINTA(5,"Quinta-Feira",true),
    SEXTA(6,"Sexta-Feira",true),
    SABADO(7,"Sábado",false)
}

fun main(args: Array<String>) {
    for (dia in DiaSemana2.values()){
        println("${dia.nome} é um dia ${if(dia.util) "útil" else "do fim de semana"}.")
    }
}