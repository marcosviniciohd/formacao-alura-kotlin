fun main() {
    println("Exercicio 1")
    var numero1 = 10
    var numero2 = numero1
    numero2 = 20


    println("numero1: $numero1")
    println("numero2: $numero2")
    println("numero2: $numero2")

    class Conta {
        var titular = ""
        var numero = 0
        var saldo = 0.0
    }

    val conta1 = Conta()
    conta1.titular = "Marcos Vinício"
    println("Titular ${conta1.titular}")
    val conta2 = Conta()
    conta2.titular = conta1.titular
    println("Titular da conta2 ${conta2.titular}")
    conta2.titular = "Daniela Oliveira"
    println("Titular da conta2 ${conta2.titular}")
}