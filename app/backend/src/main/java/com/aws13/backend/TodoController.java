package com.aws13.backend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "*")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable Long id) {
        return todoRepository.findById(id).map(todo -> {
            todo.setCompleted(!todo.isCompleted());
            return ResponseEntity.ok(todoRepository.save(todo));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
