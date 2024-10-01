fun main() {
    println("Bem vindo ao Bytebank")
    val conta = Conta()
    conta.titular = "Marcos Vinício"
    println(conta.titular)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}