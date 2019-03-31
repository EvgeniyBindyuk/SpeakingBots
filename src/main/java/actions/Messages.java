package actions;

import java.util.ArrayList;
import java.util.Arrays;

public class Messages {

    public ArrayList<String> messagesOne = new ArrayList<String>();

    {
        Text text = new Text();
        String[] words = text.TEXT.split("\\p{P}?[ \\t\\n\\r]+");
        messagesOne.addAll(Arrays.asList(words));
    }

}
