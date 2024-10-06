fun main() {
    println("Bem Vindo ao Bytebank")
    val conta1 = Conta()
    conta1.titular = "Marcos Vinício"
    conta1.numero = 1006
    conta1.saldo = 00.0

    val conta2 = Conta()
    conta2.titular = "Daniela Oliveira"
    conta2.numero = 1007
    conta2.saldo = 00.0

    conta1.deposita(100.0)
    conta2.deposita(200.0)
    conta1.deposita(0.0)
    println("Saldo da conta ${conta1.numero}, é de: ${conta1.saldo} reais")
    println("Saldo da conta ${conta2.numero}, é de: ${conta2.saldo} reais")

    println("=================================================================")
    println("=================================================================")
    println("Realizando saque na conta ${conta1.numero}")
    conta1.saca(150.0)
    println("Saldo da conta ${conta1.numero}, é de: ${conta1.saldo} reais")

    println("Realizando saque na conta ${conta2.numero}")
    conta2.saca(150.0)
    println("Saldo da conta ${conta2.numero}, é de: ${conta2.saldo} reais")

    println("=================================================================")
    println("=================================================================")

    println("Realizando transferência da conta ${conta1.numero} para a conta ${conta2.numero}")
    conta1.transfere(50.0, conta2)
    println("Saldo da conta ${conta1.numero}, é de: ${conta1.saldo} reais")
    println("Saldo da conta ${conta2.numero}, é de: ${conta2.saldo} reais")

    println("=================================================================")
    println("=================================================================")
    println("Realizando transferência da conta ${conta2.numero} para a conta ${conta1.numero}")
    conta2.transfere(50.0, conta1)
    println("Saldo da conta ${conta1.numero}, é de: ${conta1.saldo} reais")
    println("Saldo da conta ${conta2.numero}, é de: ${conta2.saldo} reais")

}