fun main() {
    // Inclusive o 3
    for (i in 0..3) {
        println(i)
    }

    println("======================================================================")

    // Exclusive o 3
    for (i in 0 until 3) {
        println(i)
    }

    println("======================================================================")

    for(i in 2..8 step 2) {
        println(i)
    }

    println("======================================================================")

    for (i in 3 downTo 0) {
        println(i)
    }
}