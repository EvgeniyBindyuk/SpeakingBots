package bot;

public class BotThread extends Thread {

    private Bot bot;

    public BotThread(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void run() {
        bot.openGmail();
        bot.logIn();
        bot.talk();
    }


}
