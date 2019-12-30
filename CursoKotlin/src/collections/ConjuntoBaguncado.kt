package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    // conjunto.get(1) o Set não é indexado não é possivel acessar diretamente pelo indece

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print()
    conjunto.remove('a').print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1,2,3) // somente leitura
    //nums.add(4) não é possível adicionar mais elementos no setOf depois de definido. Ele é somente de leitura

    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() // não muda o conjunto
    conjunto.retainAll(nums) // muda o conjunto
    conjunto.print()
    conjunto.size.print()
    conjunto.clear()
    conjunto.isEmpty().print()
}