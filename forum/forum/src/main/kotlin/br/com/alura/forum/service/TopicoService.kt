package br.com.alura.forum.service

import br.com.alura.forum.dto.NovoTopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.mapper.TopicoFormMapper
import br.com.alura.forum.mapper.TopicoViewMapper
import br.com.alura.forum.model.Topico
import org.springframework.stereotype.Service

@Service
class TopicoService(
    private var topicos: List<Topico> = ArrayList(),
    private val topicoViewMapper: TopicoViewMapper,
    private val topicoFormMapper: TopicoFormMapper
) {

    fun listar(): List<TopicoView> {
        return topicos.stream().map { t -> topicoViewMapper.map(t)}.toList()
    }

    fun buscarPorId(id: Long): TopicoView {
        val t = topicos.stream().filter { t -> t.id == id }.findFirst().get()
        return topicoViewMapper.map(t)
    }

    fun cadastrar(novoTopicoForm: NovoTopicoForm) {
        val topico = topicoFormMapper.map(novoTopicoForm)
        topico.id = topicos.size.toLong() + 1
        topicos = topicos.plus(topico)
    }

}