package com.barbershop.barbershop.services;
import org.springframework.stereotype.Service;
import com.barbershop.barbershop.entities.Agenda;
import com.barbershop.barbershop.repositories.AgendaRepository;

@Service
public class AgendaService {
    private AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public Boolean createItem(Agenda agenda) throws Exception{
        try{
            agendaRepository.save(agenda);
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        } 
    }

    public Agenda[] obterTodosHorarios() throws Exception {
        try{
            Agenda[] arrayAgendas = agendaRepository.obterTodosHorarios();
            return arrayAgendas;
        }catch(Exception ex){
            throw new Exception(ex.getMessage());
        }
        
    }
}
