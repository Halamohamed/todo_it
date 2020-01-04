package se.lexicon.todo_it.data;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.todo_it.model.Person;

public class PeopleTest {
    public static People people;

    @Test
    public void testObject(){
        people = new People();
        people.createNewPerson("hala","ali");
        Person expected = new Person("hala","ali");
        Assert.assertNotNull(people.findAll());
    }
}
