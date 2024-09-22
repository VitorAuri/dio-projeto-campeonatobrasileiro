package br.com.cbf.campeonatobrasileiro.service.implementation;

import br.com.cbf.campeonatobrasileiro.entity.Jogo;
import br.com.cbf.campeonatobrasileiro.repository.JogoRepository;
import br.com.cbf.campeonatobrasileiro.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService implements ServiceInterface<Jogo> {

    @Autowired
    private JogoRepository jogoRepository;

    @Override
    public Iterable<Jogo> buscarTodos() {
        return jogoRepository.findAll();
    }

    @Override
    public void inserir(Jogo jogo) {
        jogoRepository.save(jogo);
    }

    @Override
    public void remover(Jogo jogoParaRemoverPorID) {
        List<Jogo> listaDeJogos = jogoRepository.findAll();
        boolean jogoFoiRemovido = false;
        for(Jogo jogo : listaDeJogos) {
            if(jogo.getId().equals(jogoParaRemoverPorID.getId())) {
                jogoRepository.delete(jogo);
                jogoFoiRemovido = true;
                System.out.println("Jogo removido com sucesso.");
                break;
            }
        }
        if(!jogoFoiRemovido) System.out.println("Jogo não existe.");
    }
}
