fun main() {
    println("Bem vindo ao Bytebank")
    val contaFran = Conta("Fran", 1000)
    val contaJoao = Conta("João", 1001)

    contaFran.setSaldo(200.0)
    contaJoao.setSaldo(300.0)

    println("Titular: ${contaFran.titular}, número da conta: ${contaFran.numero}, saldo da conta: ${contaFran.saldo}.")
    println("Titular: ${contaJoao.titular}, número da conta: ${contaJoao.numero}, saldo da conta: ${contaJoao.saldo}.")

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

}