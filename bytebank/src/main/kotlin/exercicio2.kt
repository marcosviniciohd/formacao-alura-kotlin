fun main() {
    println("Bem vindo ao Bytebank")
    val contaFran = Conta()
    val contaJoao = Conta()

    contaFran.titular = "Fran"
    contaFran.numero = 1000
    contaFran.setSaldo(200.0)

    contaJoao.titular = "João"
    contaJoao.numero = 1001
    contaJoao.setSaldo(300.0)

    println("Titular: ${contaFran.titular}, número da conta: ${contaFran.numero}, saldo da conta: ${contaFran.getSaldo()}.")
    println("Titular: ${contaJoao.titular}, número da conta: ${contaJoao.numero}, saldo da conta: ${contaJoao.getSaldo()}.")

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX: $numeroX")
    println("numeroY: $numeroY")

}