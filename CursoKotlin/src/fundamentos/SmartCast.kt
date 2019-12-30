package fundamentos

fun souEsperto(x: Any) {
    if(x is String){
        println(x.toUpperCase())
    } else if (x is Int){
        println(x.plus(3))
    } else {
        println("Repense a sua vida!")
    }
}

fun souEsperto2(x: Any) {
   when(x) {
       is String -> println(x.toUpperCase())
       is Int -> println(x.plus(3))
       else -> println("Repense a sua vida!")
   }
}

fun main(args: Array<String>) {
    souEsperto("Ola")
    souEsperto(9)
    souEsperto2(true)

    souEsperto2("oi")
    souEsperto2(3)
    souEsperto2(true)
}