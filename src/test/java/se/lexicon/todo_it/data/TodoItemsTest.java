package se.lexicon.todo_it.data;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.todo_it.model.Todo;

public class TodoItemsTest {
    public static TodoItems todoItems;

    @Test
    public void testObject(){
     todoItems = new TodoItems();
        Todo todo = new Todo(1,"test description");
        Todo[] expected = {todo};
        todoItems.createNewTodo(1,"test description");
        //Assert.assertEquals(todo, todoItems.createNewTodo(1,"test description"));
        Assert.assertNotNull(todoItems.findAll());
        Assert.assertNotNull( todoItems.findByDoneStatus(true));
        Assert.assertNotNull( todoItems.findByAssignee(1));
    }
}
