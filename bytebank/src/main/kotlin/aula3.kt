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

    deposita(conta1, 100.0)
    deposita(conta2, 200.0)
    deposita(conta1, 0.0)
    println("Saldo da conta ${conta1.numero}, é de: ${conta1.saldo} reais")
    println("Saldo da conta ${conta2.numero}, é de: ${conta2.saldo} reais")

}