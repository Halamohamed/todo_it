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
        todos[todos.length-1]= newTodo;
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
                todoStatus = Arrays.copyOf(todoStatus, todoStatus.length + 1);
                todoStatus[todoStatus.length-1]= todo;

            }
        }
        return todoStatus;
    }

    public Todo[]findByAssignee(int personId){
        Todo[] todoAssignee = new Todo[0];
        for (Todo todo: todos
             ) {
            if(personId == todo.getId()){
                todoAssignee = Arrays.copyOf(todoAssignee , todoAssignee.length + 1);
                todoAssignee[todoAssignee.length-1]= todo;

            }
        }
        return todoAssignee;
    }

    public Todo[] findByAssignee(Person assignee){
        Todo[] todoP = new Todo[0];
        for (Todo todo: todos
             ) {
            if(assignee.equals(todo.getAssignee())){
                todoP = Arrays.copyOf(todoP, todoP.length + 1);
                todoP[todoP.length-1]= todo;

            }
        }
        return todoP;
    }

    public Todo[] findUnassigneeTodoItems(){
        Todo[] todoUnassignee = new Todo[0];
        for (Todo todo: todos
             ) {
            if(todo.getAssignee().equals(null)){
                todoUnassignee = Arrays.copyOf(todoUnassignee , todoUnassignee.length  + 1);
                todoUnassignee[todoUnassignee.length-1]= todo;

            }
        }
        return todoUnassignee;
    }

    public int indexOfTodo(int id){
        int index = -1;
        for(int i=0; i<todos.length; i++){
            if(todos[i].getId() == id){
                index = i;
            }
        }
        return index;
    }

    public Todo[] remove(int index){
        Todo[] first = Arrays.copyOfRange(todos, 0, index);
        Todo[] last = Arrays.copyOfRange(todos, index+1, todos.length);
        Todo[] combined = Arrays.copyOf(first, first.length+ last.length);
        System.arraycopy(last, 0 , combined, first.length, first.length+ last.length);
        return combined;
    }

    public boolean removeTodo(int id){
        int position = indexOfTodo(id);
        if(position == -1){
            return false;
        }
        todos = remove(position);
        return true;
    }

}
