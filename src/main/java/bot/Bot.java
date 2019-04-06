package bot;

import pages.DialogPage;
import pages.LoginPage;
import settings.WebDriverSettings;

public class Bot extends WebDriverSettings implements IBot {

    private String email;
    private String password;
    private String botTwoName;
    private LoginPage loginPage = new LoginPage(driver);
    private DialogPage dialogpage = new DialogPage(driver);

    public Bot(String email, String password, String botTwoName) {
        this.email = email;
        this.password = password;
        this.botTwoName = botTwoName;
    }

    public void openGmail() {
        driver.navigate().to("https://www.google.com/gmail/");
    }

    public void logIn() {
        loginPage.typeEmail(email);
        loginPage.typePassword(password);
    }

    public void talk() {
        dialogpage.newChat();
        dialogpage.startDialog(botTwoName);
    }
}
