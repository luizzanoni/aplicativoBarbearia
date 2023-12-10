package com.barbershop.barbershop.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.barbershop.barbershop.entities.Schedule;

import java.util.Optional;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    Optional<Schedule> findById(Long id);

    @Query(value = "SELECT * FROM schedule order by id desc", nativeQuery = true)
    Schedule[] obterTodosHorarios();
}
