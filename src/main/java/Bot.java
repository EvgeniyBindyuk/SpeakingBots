import actions.Browser;
import actions.Messages;

class Bot {

    private String email;
    private String password;
    private Browser browser = new Browser();
    private Messages base = new Messages();

    Bot(String email, String password) {
        this.email = email;
        this.password = password;
    }

    void openGmail() {
        browser.openMail();
    }

    void fillForm() {
        browser.fillForm(email, password);
    }

    void startDialog(String name) {
        browser.startDialog(base.messagesOne, name);
    }


}
