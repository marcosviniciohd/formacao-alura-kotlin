package introducao.kotlin

fun main() {
    val x = 2
    if (x in 1..5) {
        println("$x está no range entre 1 e 5")
    }

    if (x !in 6..10) {
        println("$x não está no range entre 6 e 10")
    }
}