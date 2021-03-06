package com.cloudsole.angular.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmichels on 8/1/14.
 */

@Service
public class TodoServiceImpl implements TodoService {

    List<String> todos = new ArrayList<String>();

    @Override
    public List<String> allTodos() {
        return todos;
    }

    @Override
    public void addTodo(String todo) {
        todos.add(todo);
    }

    @Override
    public void deleteTodo(String todo) {
        if (todos.contains(todo)){
            todos.remove(todo);
        }
    }

    @Override
    public void deleteAll() {
        todos.clear();
    }


    @Override
    public void updateTodo(int position, String todo) {
        todos.set(position, todo);
    }
}
