import java.util.Collections

fun main() {
    // write your code here

    val numeroDeElementos: Int = readln().toInt()


    var listaDeInteiros = mutableListOf<Int>()
    for (index in 0 until numeroDeElementos) {
        listaDeInteiros.add(readln().toInt())
    }

    Collections.rotate(listaDeInteiros, +1)

    println(listaDeInteiros.joinToString().replace(",", ""))
}