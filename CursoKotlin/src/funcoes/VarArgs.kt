package funcoes

fun ordenar(vararg numero: Int, a: Int): IntArray {
    println(a)
    return numero.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(38,3,456,8,51,1,88,73, a = 10)){
        print("$n ")
    }
}