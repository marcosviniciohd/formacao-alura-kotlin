fun main() {
    println("Bem vindo ao Bytebank")

    val conta1 = Conta()
    conta1.titular = "Marcos Vinício"
    conta1.numero = 1006
    conta1.saldo = 100.0
    println("Titular ${conta1.titular}, número da conta ${conta1.numero}, saldo da conta ${conta1.saldo}.")


    val conta2 = Conta()
    conta2.titular = "Daniela Oliveira"
    conta2.numero = 1007
    conta2.saldo = 200.0
    println("Titular ${conta2.titular}, número da conta ${conta2.numero}, saldo da conta ${conta2.saldo}.")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0


    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}