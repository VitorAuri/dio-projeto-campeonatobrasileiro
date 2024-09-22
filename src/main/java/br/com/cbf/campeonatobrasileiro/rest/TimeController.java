package br.com.cbf.campeonatobrasileiro.rest;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.service.implementation.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {

    @Autowired
    TimeService timeService;

    @GetMapping
    public List<Time> listaDeTimes() {
        return (List<Time>) timeService.buscarTodos();
    }

    @PostMapping
    public void inserirTime(@RequestBody Time time) {
        timeService.inserir(time);
    }

}
