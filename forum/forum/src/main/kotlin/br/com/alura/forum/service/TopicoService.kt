package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
            id = 1,
            titulo = "Duvida",
            mensagem = "Duvida com Spring",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Rafael",
                email = "rafael.silva@gmail.com"
            )
        )

        val topico2 = Topico(
            id = 2,
            titulo = "Duvida2",
            mensagem = "Duvida com Spring Data JPA",
            curso = Curso(
                id = 2,
                nome = "Java",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Maria das Dores",
                email = "maria.dores@gmail.com"
            )
        )

        val topico3 = Topico(
            id = 3,
            titulo = "Duvida3",
            mensagem = "Duvida com Spring Boot",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Antonio Silva",
                email = "antonio.silva@gmail.com"
            )
        )

       topicos = Arrays.asList(topico, topico2, topico3)
    }

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter { t -> t.id == id }.findFirst().get()
    }

}