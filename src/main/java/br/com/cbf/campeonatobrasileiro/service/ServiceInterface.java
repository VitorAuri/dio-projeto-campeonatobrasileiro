package br.com.cbf.campeonatobrasileiro.service;

import br.com.cbf.campeonatobrasileiro.entity.Time;

public interface ServiceInterface {
    Iterable<Time> buscarTodos();

    void inserir(Time time);

    void removerPorNome(Time time);
}
