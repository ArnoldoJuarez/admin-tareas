package com.arnoldo.admin_tareas.controller;

import com.arnoldo.admin_tareas.model.Tarea;
import com.arnoldo.admin_tareas.service.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    private final TareaService service;

    public TareaController(TareaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarea> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Tarea getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Tarea create(@RequestBody Tarea tarea) {
        return service.save(tarea);
    }

    @PutMapping("/{id}")
    public Tarea update(@PathVariable Long id, @RequestBody Tarea tarea) {
        tarea.setId(id);
        return service.save(tarea);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}