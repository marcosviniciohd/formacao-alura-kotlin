fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases("Olá")

}

fun cases(obj: Any) {
    when (obj){
        1 -> println("One")
        "Hello" -> println("Hello World")
        is Long -> println("é Long")
        !is String -> println("Não é String")
        else -> println("Nada selecionado!")
    }
}