package com.adletaskarov.todoapp.repositories;

import com.adletaskarov.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {


}
