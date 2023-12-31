package pl.sda.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.sda.todoapp.model.Todo;
import pl.sda.todoapp.service.TodoService;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // GET list of todos
    @GetMapping("/todo")
    public String getList(Model model) {
        List<Todo> todos = todoService.getList();

        model.addAttribute("todoList", todos);

        return "todolist";
    }

    // GET todo by id
    @GetMapping("/todo/{id}")
    public String getById(@PathVariable int id, Model model) {
        Todo todo = todoService.getById(id);

        model.addAttribute("todo", todo);

        return "todo";
    }

    // POST todo
    public String create(Object todo) {
        return null;
    }

    // PUT todo
    public String update(Object todo) {
        return null;
    }

}
