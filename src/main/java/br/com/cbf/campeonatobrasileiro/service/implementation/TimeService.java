package br.com.cbf.campeonatobrasileiro.service.implementation;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;
import br.com.cbf.campeonatobrasileiro.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService implements ServiceInterface<Time> {

    @Autowired
    private TimeRepository timeRepository;

    @Override
    public Iterable<Time> buscarTodos() {
        return timeRepository.findAll();
    }

    @Override
    public void inserir(Time time) {
        timeRepository.save(time);
    }

    @Override
    public void remover(Time timeParaRemoverPorNome) {
        List<Time> listaDeTimes = timeRepository.findAll();
        boolean timeFoiRemovido = false;
        for(Time time : listaDeTimes) {
            if(time.getNome().equalsIgnoreCase(timeParaRemoverPorNome.getNome())) {
                timeRepository.delete(time);
                timeFoiRemovido = true;
                System.out.println("Time removido com sucesso.");
                break;
            }
        }
        if(!timeFoiRemovido) System.out.println("Time não existe com nome informado.");
    }



}
