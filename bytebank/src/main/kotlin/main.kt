fun main() {
    println("Bem vindo ao Bytebank")

    val conta1 = Conta("Marcos Vinício", 1006)
    conta1.setSaldo(100.0)
    println("Titular ${conta1.titular}, número da conta ${conta1.numero}, saldo da conta ${conta1.saldo}.")


    val conta2 = Conta("Daniela Oliveira", 1007)
    conta2.setSaldo(200.0)
    println("Titular ${conta2.titular}, número da conta ${conta2.numero}, saldo da conta ${conta2.saldo}.")
}

class Conta(
    var titular: String,
    var numero: Int,
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        } else {
            println("O valor do depósito deve ser maior que zero.")
        }
    }

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente.")
        }
    }

    fun transfere(valor: Double, contaDestino: Conta) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            contaDestino.saldo += valor
        } else {
            println("O valor da transferência deve ser igual ou menor que o saldo da conta")
        }
    }

    fun setSaldo(saldo: Double) {
        if (saldo > 0) {
            this.saldo = saldo
        }
    }

    override fun toString(): String {
        return "Conta(titular='$titular', numero=$numero, saldo=$saldo)"
    }
}

