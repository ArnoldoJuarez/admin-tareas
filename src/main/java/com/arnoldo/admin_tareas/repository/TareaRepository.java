package com.arnoldo.admin_tareas.repository;

import com.arnoldo.admin_tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
