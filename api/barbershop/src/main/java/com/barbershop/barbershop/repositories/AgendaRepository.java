package com.barbershop.barbershop.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.barbershop.barbershop.entities.Agenda;

import java.util.Optional;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
    Optional<Agenda> findById(Long id);

    @Query(value = "SELECT * FROM agenda order by id desc", nativeQuery = true)
    Agenda[] obterTodosHorarios();
}
