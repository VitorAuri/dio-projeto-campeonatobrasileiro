package br.com.cbf.campeonatobrasileiro.service.implementation;

import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;
import br.com.cbf.campeonatobrasileiro.service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService implements ServiceInterface {

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
    public void removerPorNome(Time timeParaRemover) {
        List<Time> listaDeTimes = timeRepository.findAll();
        for(Time time : listaDeTimes) {
            if(time.equals(timeParaRemover)) {
                timeRepository.delete(time);
            }
        }
    }

}
