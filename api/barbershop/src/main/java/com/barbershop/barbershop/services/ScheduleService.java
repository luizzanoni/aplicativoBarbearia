package com.barbershop.barbershop.services;
import org.springframework.stereotype.Service;
import com.barbershop.barbershop.entities.Schedule;
import com.barbershop.barbershop.repositories.ScheduleRepository;

@Service
public class ScheduleService {
    private ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Boolean createItem(Schedule schedule) throws Exception{
        try{
            scheduleRepository.save(schedule);
            return true;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            return false;
        } 
    }

    public Schedule[] obterTodosHorarios() {
        Schedule[] arraySchedules = scheduleRepository.obterTodosHorarios();
        System.out.println(arraySchedules);
        return arraySchedules;
    }
}
