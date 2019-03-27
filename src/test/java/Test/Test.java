package Test;

import Test.Actions.action;

public class Test extends action {
    public void gmailAuto(){
        navigateURL("http://mail.google.com");
        waitDriverSec(5);
        login();
        waitDriverSec(2);
        password();
        waitDriverSec(7);
        composeEmail();
        waitDriverSec(5);
        closeDriver();

    }

}
