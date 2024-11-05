package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import pages.ProfileSection;
import session.Session;

import java.util.Date;


public class CreateUpdateEmailTest extends BaseTestTodoLy {


    @Test
    public void verifyCreateUpdateEmail() throws InterruptedException {
        String newEmail = "examenfinal" + new Date().getTime() + "@final.com";
        mainPage.signUpButton.click();
        signUpFormSection.signUp("ExamenFinal", "examenfinal" + new Date().getTime() + "@final.com", "12345");
        settingsSection.settingsButton.click();
        profileSection.changeEmail(newEmail);
        Alert alert = Session.getInstance().getBrowser().switchTo().alert();
        alert.accept();

        mainPage.loginButton.click();
        loginSection.login(newEmail, "12345");

        Assertions.assertTrue(menuSection.logoutButton.isControlDislayed(),
                "ERROR! The full name was not updated correctly");
    }
}
