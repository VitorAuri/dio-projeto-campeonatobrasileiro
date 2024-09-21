package br.com.cbf.campeonatobrasileiro.service;

import br.com.cbf.campeonatobrasileiro.model.Time;

public interface TimeService {
    Iterable<Time> buscarTodos();

    void inserir(Time time);

    void removerPorNome(Time time);
}
