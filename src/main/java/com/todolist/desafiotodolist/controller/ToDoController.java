package com.todolist.desafiotodolist.controller;

//Camada WEB (API's)

import com.todolist.desafiotodolist.entity.ToDo;
import com.todolist.desafiotodolist.service.ToDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController //Indica que é um controller do tipo REST
@RequestMapping("/todos") //Endereço inicial para acesso das APIs
public class ToDoController {

    @Autowired
    private ToDoServices toDoServices;

    @PostMapping
    List<ToDo> create(@RequestBody ToDo todo){ //Todo deve ser enviada no Body (Corpo da requisição
        return toDoServices.create(todo);
    }

    @GetMapping
    List<ToDo> list() {
        return toDoServices.list();
    }

    @PutMapping
    List<ToDo> update(@RequestBody ToDo todo) {
        return toDoServices.update(todo);
    }

    @DeleteMapping("{id}") //Deverá passar um ID no link/requisição. O valor deve ficar em chaves {}
    List<ToDo> delete(@PathVariable("id") Long id){ //PathVariable indica que o valor está sendo passado no link da requisição
        return toDoServices.delete(id);
    }
}
s