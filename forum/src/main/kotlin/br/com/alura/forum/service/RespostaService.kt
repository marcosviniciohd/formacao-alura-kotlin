package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Resposta
import br.com.alura.forum.model.Topico
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.Arrays
import java.util.stream.Collectors

@Service
class RespostaService(private var respostas: List<Resposta>) {
    init {

        val usuario1 = Usuario(
            id = 1,
            nome = "Marcos Vinício",
            email = "marcosviniciohd@gmail.com"
        )

        val usuario2 = Usuario(
            id = 2,
            nome = "Ana Silva",
            email = "ana.silva@gmail.com"
        )

        val cursoKotlin = Curso(
            id = 1,
            nome = "Kotlin",
            categoria = "Programação"
        )

        val topico1 = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Como declarar variáveis em Kotlin?",
            dataCriacao = LocalDateTime.now(),
            curso = cursoKotlin,
            autor = usuario1
        )

        val resposta1 = Resposta(
            id = 1,
            mensagem = "Utilize 'val' ou 'var' para declarar variáveis, dependendo se precisa ou não reatribuir.",
            dataCriacao = LocalDateTime.now(),
            autor = usuario2,
            topico = topico1,
            solucao = true
        )

        val resposta2 = Resposta(
            id = 2,
            mensagem = "Lembre-se que 'val' cria uma referência imutável, enquanto 'var' permite alterações.",
            dataCriacao = LocalDateTime.now(),
            autor = usuario1,
            topico = topico1,
            solucao = false
        )

        respostas = Arrays.asList(resposta1, resposta2)
    }

    fun listarRespostas(idTopico: Long): List<Resposta> {
        return respostas.stream().filter { r ->
            r.topico.id == idTopico
        }.collect(Collectors.toList())
    }

}
