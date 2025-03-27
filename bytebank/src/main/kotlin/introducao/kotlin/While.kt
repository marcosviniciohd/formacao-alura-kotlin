package introducao.kotlin

fun comerUmBolo() = println("Comer um bolo")
fun assarUmBolo() = println("Assar um bolo")

fun main() {
    var bolosComidos = 0
    var bolosAssados = 0

    while (bolosComidos < 5) {
        comerUmBolo()
        bolosComidos ++

    }

    do {
        assarUmBolo()
        bolosAssados++
    } while (bolosAssados < bolosComidos)
}
