package br.com.alura.forum.testes

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aprendendoSpring")
class AprendendoSpringController {
    @GetMapping
    fun aprendendoSpring(): String {
        return "Aprendendo Spring!!!"
    }
}