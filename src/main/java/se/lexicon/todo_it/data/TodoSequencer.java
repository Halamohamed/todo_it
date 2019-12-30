package se.lexicon.todo_it.data;

public class TodoSequencer {
    private static int sequencerId;

    public static int nextSequencerId(){
        return sequencerId++;
    }
    public static void resetSequencer(){
        sequencerId = 0;
    }
}
