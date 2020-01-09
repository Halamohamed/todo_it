package se.lexicon.todo_it.data;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.todo_it.model.Person;

public class PeopleTest {
    public static People people;

    @Test
    public void testObject(){
        people = new People();

        Person expected = new Person(0,"hala","ali");
        people.createNewPerson("hala","ali");
        //Assert.assertEquals(expected,people.createNewPerson("hala","ali"));
        Assert.assertNotNull(people.findAll());
        Assert.assertEquals(1, people.size());
        people.clear();
        Assert.assertEquals(0,people.size());
    }
}
