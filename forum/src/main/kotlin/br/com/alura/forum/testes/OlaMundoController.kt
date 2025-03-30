package br.com.alura.forum.testes

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/olaMundo")
class OlaMundoController {
    @GetMapping
    fun olaMundo(): String {
        return "Olá Mundo alterado!!!"
    }
}