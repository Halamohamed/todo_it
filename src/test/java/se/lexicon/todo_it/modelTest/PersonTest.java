package se.lexicon.todo_it.modelTest;

import org.junit.Assert;
import org.junit.Test;
import se.lexicon.todo_it.model.Person;

public class PersonTest {
    private Person person;

    @Test
    public void testConstructor(){
      person = new Person(1,"hala", "ali");
      String expected = "hala";
        Assert.assertEquals(expected, person.getFirstName());
        Assert.assertEquals("ali", person.getLastName());
        Assert.assertEquals("Person{" +
                "id=" + 1 +
                ", firstName='" + "hala" + '\'' +
                ", lastName='" + "ali" + '\'' +
                '}', person.toString());
    }
}
