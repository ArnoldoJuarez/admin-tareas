package com.arnoldo.admin_tareas.service;

import com.arnoldo.admin_tareas.model.Tarea;
import com.arnoldo.admin_tareas.repository.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository repository;

    public TareaService(TareaRepository repository) {
        this.repository = repository;
    }

    public List<Tarea> getAll() {
        return repository.findAll();
    }

    public Tarea getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Tarea save(Tarea tarea) {
        return repository.save(tarea);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}