package se.lexicon.todo_it.modelTest;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.todo_it.model.Todo;

public class TodoTest {
    public static Todo todo;

    @Test
    public void testConstructor(){
        todo = new Todo(1, "test description");
        Assert.assertEquals(1, todo.getId());
        Assert.assertEquals("test description", todo.getDescription());
        Assert.assertTrue(todo.isDone());
    }
}
