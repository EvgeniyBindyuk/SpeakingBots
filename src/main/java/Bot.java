import actions.Browser;

class Bot {

    private String email;
    private String password;
    private Browser browser = new Browser();

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

    void firstMessage(String email) {
        browser.firstMessage(email);
    }

    void startDialog(int countMessages) {
        browser.startDialog(countMessages);
    }


}
