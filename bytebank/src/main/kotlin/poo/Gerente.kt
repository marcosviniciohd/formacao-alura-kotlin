package poo

class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int
) {
    fun bonificacao(): Double {
        return this.salario * 0.2
    }

    fun autenticar(senha: Int): Boolean {
        val autenticado = this.senha == senha
        if (autenticado) {
            println("Autenticado com sucesso")
        } else {
            println("Falha na autenticação")
        }
        return autenticado
    }
}