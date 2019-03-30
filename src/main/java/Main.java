
public class Main {

    public static void main(String[] args) {

        //speakingbotone@gmail.com  --  2613874qq
        //evganiy@gmail.com  --  inspiron7720rR

        Bot botOne = new Bot("speakingbotone@gmail.com", "2613874qq");
        Bot botTwo = new Bot("evganiy@gmail.com", "inspiron7720rR");

        botOne.openGmail();
        botTwo.openGmail();

        botOne.fillForm();
        botTwo.fillForm();

        botOne.firstMessage("evganiy@gmail.com");

        botOne.startDialog(20);
        botTwo.startDialog(20);

    }

}
