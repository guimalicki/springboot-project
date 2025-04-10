package com.todolist.desafiotodolist.repository;

import com.todolist.desafiotodolist.entity.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
//Interface no qual realiza as atualizações no banco, indicando que é uma extenção do JPA, passando como Generics a entidade que ela controla e o Tipo do ID da entidade
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
