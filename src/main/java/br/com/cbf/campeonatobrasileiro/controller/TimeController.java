package br.com.cbf.campeonatobrasileiro.controller;

import br.com.cbf.campeonatobrasileiro.model.Time;
import br.com.cbf.campeonatobrasileiro.service.TimeService;
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
