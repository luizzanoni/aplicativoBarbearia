package com.barbershop.barbershop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barbershop.barbershop.entities.CustumerResponse;
import com.barbershop.barbershop.entities.Agenda;
import com.barbershop.barbershop.services.AgendaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class AgendaController {
    AgendaService agendaService;

    @PostMapping("/agenda/cadastro")
    public CustumerResponse<Agenda> createUser(@RequestBody Agenda agenda){
        CustumerResponse<Agenda> custumerResponse;
        try{
            System.out.println(agenda);
            Boolean isSucesso = agendaService.createItem(agenda);
            if (isSucesso){
                String message = "Agendado com sucesso";
                custumerResponse = new CustumerResponse<Agenda>(message, 200);
            }  else {
                custumerResponse = new CustumerResponse<Agenda>("Erro ao fazer Agendamento", 401);
            }
            
        }catch (Exception exc){
            String message = exc.getMessage();
            custumerResponse = new CustumerResponse<Agenda>(message, 401);
        }

        return custumerResponse;
    }

    @GetMapping("/agenda/obter")
    public CustumerResponse<Agenda[]> obterHorarios(){
        CustumerResponse<Agenda[]> custumerResponse;
        try{
            Agenda[] arrAgendas = agendaService.obterTodosHorarios();
            String message = "Obtido com sucesso";
            custumerResponse = new CustumerResponse<Agenda[]>(message, 200, arrAgendas);
        }catch (Exception exc){
            String message = exc.getMessage();
            custumerResponse = new CustumerResponse<Agenda[]>(message, 401);
        }

        return custumerResponse;
    }
}
