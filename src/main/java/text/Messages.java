package text;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Messages {

    public static ArrayList<String> messagesList = new ArrayList<String>();
    public static Queue<String> abc = new ArrayDeque<>();

    static {
        String[] words = Text.TEXT.split("\\p{P}?[ \\t\\n\\r]+");
        messagesList.addAll(Arrays.asList(words));
        abc.addAll(Arrays.asList(words));
    }

}
