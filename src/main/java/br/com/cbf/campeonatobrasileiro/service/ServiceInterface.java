package br.com.cbf.campeonatobrasileiro.service;

public interface ServiceInterface<T> {
    Iterable<T> buscarTodos();

    void inserir(T Object);

    void remover(T Object);
}
