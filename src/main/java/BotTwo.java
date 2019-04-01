import actions.BrowserTest;
import actions.Messages;

class BotTwo {

    private String email;
    private String password;
    private BrowserTest browserTest = new BrowserTest();
    private Messages base = new Messages();

    BotTwo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    void openGmail() {
        browserTest.openMail();
    }

    void fillForm() {
        browserTest.fillForm(email, password);
    }

    void startDialog(String name) {
        browserTest.startDialog(base.messagesOne, name);
    }
}
