package text;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Messages {

    public static Queue<String> abc = new ArrayDeque<>();

    static {
        String[] words = Text.PHRASES.split("\\p{P}?[ \\t\\n\\r]+");
        abc.addAll(Arrays.asList(words));
    }

}
