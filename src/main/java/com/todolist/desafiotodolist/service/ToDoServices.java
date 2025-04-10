package com.todolist.desafiotodolist.service;

import com.todolist.desafiotodolist.entity.ToDo;
import com.todolist.desafiotodolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Indica que é um serviço
public class ToDoServices {

    @Autowired //Realiza a injeção, criação do objeto
    private ToDoRepository todoRepository;

    /*Outra forma de ralizar a injeção é via construtor, conforme abaixo:
     public ToDoServices(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }    */

    //Todos as funções retornaram a lista de To Do
    public  List<ToDo> create(ToDo todo) {
        todoRepository.save(todo); //Salva o toDo na lista
        return list(); // Realiza a impressão da lista utizando a função list
    }
    public List<ToDo> list() {
        Sort sort = Sort.by("prioridade").descending() //Realiza a ordenação decrescente da prioridade
                    .and(Sort.by("nome").ascending()); //E ordenação crescente do nome
        return todoRepository.findAll(sort); //Imprime toda a lista utilizando a ordenação
    }

    public List<ToDo> update(ToDo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<ToDo> delete(Long id) {
        todoRepository.deleteById(id); //Realiza o delete utilizando o ID
        return list();
    }

}
