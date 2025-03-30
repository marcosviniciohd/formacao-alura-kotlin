package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service

@Service
class TopicoService (private var topicos: List<Topico>){

    init {
        val topico = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Variáveis no Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Marcos Vinício",
                email = "marcosviniciohd@gmail.com"
            ),

            )
        val topico1 = Topico(
            id = 2,
            titulo = "Dúvida Spring Boot",
            mensagem = "Como configurar o Spring Boot",
            curso = Curso(
                id = 2,
                nome = "Spring Boot",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 2,
                nome = "Ana Silva",
                email = "ana.silva@gmail.com"
            )
        )

        val topico2 = Topico(
            id = 3,
            titulo = "Dúvida Maven",
            mensagem = "Como usar o Maven",
            curso = Curso(
                id = 3,
                nome = "Maven",
                categoria = "DevOps"
            ),
            autor = Usuario(
                id = 3,
                nome = "João Souza",
                email = "joao.souza@gmail.com"
            )
        )

        val topico3 = Topico(
            id = 4,
            titulo = "Dúvida IntelliJ",
            mensagem = "Atalhos no IntelliJ",
            curso = Curso(
                id = 4,
                nome = "IntelliJ IDEA",
                categoria = "Ferramentas"
            ),
            autor = Usuario(
                id = 4,
                nome = "Maria Oliveira",
                email = "maria.oliveira@gmail.com"
            )
        )
        topicos = listOf(topico, topico1, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({it.id == id}).findFirst().get()
    }


}