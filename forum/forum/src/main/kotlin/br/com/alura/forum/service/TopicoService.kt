package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(
    private var topicos: List<Topico>
) {

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

        val topico4 = Topico(
            id = 4,
            titulo = "Duvida4",
            mensagem = "Duvida com Spring Security",
            curso = Curso(
                id = 2,
                nome = "Java",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 2,
                nome = "João Pereira",
                email = "joao.pereira@gmail.com"
            )
        )

        val topico5 = Topico(
            id = 5,
            titulo = "Duvida5",
            mensagem = "Duvida com Spring MVC",
            curso = Curso(
                id = 3,
                nome = "Python",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 3,
                nome = "Ana Souza",
                email = "ana.souza@gmail.com"
            )
        )

        val topico6 = Topico(
            id = 6,
            titulo = "Duvida6",
            mensagem = "Duvida com Spring Cloud",
            curso = Curso(
                id = 4,
                nome = "JavaScript",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 4,
                nome = "Carlos Lima",
                email = "carlos.lima@gmail.com"
            )
        )

        val topico7 = Topico(
            id = 7,
            titulo = "Duvida7",
            mensagem = "Duvida com Spring Batch",
            curso = Curso(
                id = 5,
                nome = "Ruby",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 5,
                nome = "Mariana Costa",
                email = "mariana.costa@gmail.com"
            )
        )

        val topico8 = Topico(
            id = 8,
            titulo = "Duvida8",
            mensagem = "Duvida com Spring Integration",
            curso = Curso(
                id = 6,
                nome = "C#",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 6,
                nome = "Pedro Almeida",
                email = "pedro.almeida@gmail.com"
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