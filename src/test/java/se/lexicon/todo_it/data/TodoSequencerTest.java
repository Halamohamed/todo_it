package se.lexicon.todo_it.data;

import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {
    private static TodoSequencer todoSequencer;

    @Test
    public void testSequencer(){
        String expected = null;
        Assert.assertEquals(expected,todoSequencer);
        Assert.assertEquals(0,todoSequencer.nextSequencerId());
        Assert.assertEquals(1,todoSequencer.nextSequencerId());
        todoSequencer.resetSequencer();
        Assert.assertEquals(null,todoSequencer);
    }
}
