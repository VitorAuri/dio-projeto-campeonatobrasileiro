package br.com.cbf.campeonatobrasileiro.rest;

import br.com.cbf.campeonatobrasileiro.entity.Jogo;
import br.com.cbf.campeonatobrasileiro.service.implementation.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoController {

    @Autowired
    JogoService jogoService;

    @GetMapping
    public List<Jogo> buscarTodos() {
        return (List<Jogo>) jogoService.buscarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody Jogo jogo) {
        jogoService.inserir(jogo);
    }

    @DeleteMapping
    public void remover(@RequestBody Jogo jogo) {
        jogoService.remover(jogo);
    }
}
