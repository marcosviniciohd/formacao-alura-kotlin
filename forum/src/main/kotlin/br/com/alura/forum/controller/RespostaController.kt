package br.com.alura.forum.controller

import br.com.alura.forum.model.Resposta
import br.com.alura.forum.service.RespostaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos/{id}/respostas")
class RespostaController(private val respostaService: RespostaService) {

    @GetMapping
    fun listarRespostas(@PathVariable id: Long): List<Resposta> {
        return respostaService.listarRespostas(id)
    }
}