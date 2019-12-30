package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda","André","Bernardo","Carlos")
    for (aluno in alunos){
        println(aluno)
    }
    for ((indece, aluno) in alunos.withIndex()){
        println("${indece +1} - $aluno")
    }
}