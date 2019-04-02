package text;

import java.util.ArrayList;
import java.util.Arrays;

public class Messages {

    public static ArrayList<String> messagesList = new ArrayList<String>();

    static {
        String[] words = Text.TEXT.split("\\p{P}?[ \\t\\n\\r]+");
        messagesList.addAll(Arrays.asList(words));
    }

}
