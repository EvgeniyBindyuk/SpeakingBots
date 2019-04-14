import bot.Bot;
import bot.BotThread;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();

        Bot botOne = new Bot(
                env.get("emailOne"),
                env.get("passwordOne"),
                env.get("opponentNameOne")
        );
        Bot botTwo = new Bot(
                env.get("emailTwo"),
                env.get("passwordTwo"),
                env.get("opponentNameTwo")
        );
        new BotThread(botOne).start();
        new BotThread(botTwo).start();
    }
}
