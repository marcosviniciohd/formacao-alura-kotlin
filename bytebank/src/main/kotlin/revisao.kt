fun main() {
    println("Bem vindo ao Bytebank")

    class Conta {
        var titular = ""
        var numero = 0
        var saldo = 0.0
    }

    val conta1 = Conta()
    conta1.titular = "Marcos Vinício"
    conta1.numero = 1006
    conta1.saldo = 100.0

    println("Titular ${conta1.titular}, número da conta ${conta1.numero}, saldo da conta ${conta1.saldo}.")
}

