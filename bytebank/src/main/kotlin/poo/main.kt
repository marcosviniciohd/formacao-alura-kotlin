package poo

fun main() {
    println("Bem vindo ao ByteBank")

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        salario = 3000.0
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")

    println("==============================================================")

    val fran = Gerente(
        "Fran",
        "222.222.222-22",
        salario = 5000.0,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao()}")
    println("Autenticado: ${fran.autenticar(12345)}")
}