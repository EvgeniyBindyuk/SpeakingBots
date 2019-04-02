package bot;

public class BotThread extends Thread {

    private Bot botThread;

    public BotThread(Bot botThread) {
        this.botThread = botThread;
    }

    @Override
    public void run() {
        botThread.openGmail();
        botThread.logIn();
        botThread.talk();
    }


}
