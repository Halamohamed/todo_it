package se.lexicon.todo_it.data;

import se.lexicon.todo_it.model.Person;
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

    public Todo[] findByDoneStatus(boolean doneStatus){
        Todo[] todoStatus = new Todo[0];
        for (Todo todo: todos
             ) {
            if(doneStatus == todo.isDone()){
                todoStatus[todoStatus.length]= todo;
                todoStatus = Arrays.copyOf(todoStatus, todoStatus.length + 1);
            }
        }
        return todoStatus;
    }

    public Todo[]findByAssignee(int personId){
        Todo[] todoAssignee = new Todo[0];
        for (Todo todo: todos
             ) {
            if(personId == todo.getId()){
                todoAssignee[todoAssignee.length]= todo;
                todoAssignee = Arrays.copyOf(todoAssignee , todoAssignee.length + 1);
            }
        }
        return todoAssignee;
    }

    public Todo[] findByAssignee(Person assignee){
        Todo[] todoP = new Todo[0];
        for (Todo todo: todos
             ) {
            if(assignee.equals(todo.getAssignee())){
                todoP[todoP.length]= todo;
                todoP = Arrays.copyOf(todoP, todoP.length + 1);
            }
        }
        return todoP;
    }

    public Todo[] findUnassigneeTodoItems(){
        Todo[] todoUnassignee = new Todo[0];
        for (Todo todo: todos
             ) {
            if(todo.getAssignee().equals(null)){
                todoUnassignee[todoUnassignee.length]= todo;
                todoUnassignee = Arrays.copyOf(todoUnassignee , todoUnassignee.length  + 1);
            }
        }
        return todoUnassignee;
    }

}
