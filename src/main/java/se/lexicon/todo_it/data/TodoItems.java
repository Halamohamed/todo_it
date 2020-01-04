package se.lexicon.todo_it.data;

import se.lexicon.todo_it.model.Todo;

import java.util.Arrays;

public class TodoItems {
    private static Todo[] todos = new Todo[0];

    public int size(){
        return todos.length;
    }

    public Todo[] findAll(){
        return todos;
    }

    public Todo findById(int todoId){
        for (Todo t:todos
             ) {
            if(todoId == t.getId()){
                return t;
            }
        }
        return null;
    }

    public Todo createNewTodo(int id, String desc){
        Todo newTodo = new Todo(id,desc);
        todos = Arrays.copyOf(todos, todos.length + 1);
        todos[todos.length]= newTodo;
        return newTodo;

    }

    public void clear(){
        todos = new Todo[0];
    }
}
