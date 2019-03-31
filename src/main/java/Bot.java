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

    void startDialog() {
        browser.startDialog(base.messagesOne);
    }


}
