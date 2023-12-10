package com.barbershop.barbershop.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barbershop.barbershop.entities.CustumerResponse;
import com.barbershop.barbershop.entities.Schedule;
import com.barbershop.barbershop.entities.User;
import com.barbershop.barbershop.services.ScheduleService;
import com.barbershop.barbershop.services.UserService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ScheduleController {
    ScheduleService scheduleService;

    @PostMapping("/schedule/cadastro")
    public CustumerResponse<Schedule> createUser(@RequestBody Schedule schedule){
        CustumerResponse<Schedule> custumerResponse;
        try{
            scheduleService.obterTodosHorarios();
            System.out.println(schedule);
            Boolean isSucesso = scheduleService.createItem(schedule);
            if (isSucesso){
                String message = "Agendado com sucesso";
                custumerResponse = new CustumerResponse<Schedule>(message, 200);
            }  else {
                custumerResponse = new CustumerResponse<Schedule>("Erro ao fazer agendamento", 401);
            }
            
        }catch (Exception exc){
            String message = exc.getMessage();
            custumerResponse = new CustumerResponse<Schedule>(message, 401);
        }

        return custumerResponse;
    }
}
