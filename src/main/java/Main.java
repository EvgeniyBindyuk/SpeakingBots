import bot.Bot;
import bot.BotThread;

public class Main {
    public static void main(String[] args) {
        Bot botOne = new Bot(
                "speakingbotone@gmail.com",
                "2613874qq",
                "AAA"
        );
        Bot botTwo = new Bot(
                "evganiy@gmail.com",
                "inspiron7720rR",
                "BotOne"
        );
        new BotThread(botOne).start();
        new BotThread(botTwo).start();
    }

}
