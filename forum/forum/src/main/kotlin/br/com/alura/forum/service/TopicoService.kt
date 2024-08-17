package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val cursoService: CursoService,
    private val usuarioService: UsuarioService
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t -> TopicoView(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            status = t.status,
            dataCriacao = t.dataCriacao
        ) }.toList()
    }

    fun buscarPorId(id: Long): TopicoView {
        val t = topicos.stream().filter { t -> t.id == id }.findFirst().get()
        return TopicoView(
            id = t.id,
            titulo = t.titulo,
            mensagem = t.mensagem,
            status = t.status,
            dataCriacao = t.dataCriacao
        )

    }

    fun cadastrar(novoTopicoForm: NovoTopicoForm) {
        topicos = topicos.plus(Topico(
            id = topicos.size.toLong() + 1,
            titulo = novoTopicoForm.titulo,
            mensagem = novoTopicoForm.mensagem,
            curso = cursoService.buscarPorId(novoTopicoForm.idCurso),
            autor = usuarioService.buscarPorId(novoTopicoForm.idAutor)
        ))
    }

}