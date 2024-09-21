package br.com.cbf.campeonatobrasileiro.service.impl;

import br.com.cbf.campeonatobrasileiro.model.Time;
import br.com.cbf.campeonatobrasileiro.model.TimeRepository;
import br.com.cbf.campeonatobrasileiro.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeServiceImpl implements TimeService {

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
