package se.lexicon.todo_it.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {
    public static PersonSequencer personSequencer;

    @Test
    public void testPersonSeq(){

        String expected = null;
        Assert.assertEquals(expected,personSequencer);
        Assert.assertEquals(0,personSequencer.nextPersonId());
        Assert.assertEquals(1,personSequencer.nextPersonId());
        personSequencer.reset();
        Assert.assertEquals(null,personSequencer);
    }
}
