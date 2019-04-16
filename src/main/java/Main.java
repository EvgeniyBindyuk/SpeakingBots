import bot.Bot;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        new Thread(new Bot(
                env.get("emailOne"),
                env.get("passwordOne"),
                env.get("opponentNameOne")
        )).start();
        new Thread(new Bot(
                env.get("emailTwo"),
                env.get("passwordTwo"),
                env.get("opponentNameTwo")
        )).start();
    }
}
